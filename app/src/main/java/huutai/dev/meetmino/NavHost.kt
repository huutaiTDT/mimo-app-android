package huutai.dev.meetmino

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import huutai.dev.meetmino.screen.home.HomeScreen
import huutai.dev.meetmino.screen.quickCheckIn.QuickCheckInScreen
import huutai.dev.meetmino.screen.myMap.JourneyMapScreen
import huutai.dev.meetmino.screen.profile.ProfileScreen
import huutai.dev.meetmino.component.BottomBarComponent

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Home : Screen("home")
    object JourneyMap : Screen("journey-map")
    object QuickCheckIn : Screen("quick-checkin")
    object Profile : Screen("profile")
    object Main : Screen("main")
}

data class ScreenConfig(
    val route: String,
    val content: @Composable (NavBackStackEntry) -> Unit
)

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AppNavHost(navController: NavHostController) {
    // Define transition animations
    val enterTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition)? = {
        slideInHorizontally(
            initialOffsetX = { it }, // Move from right to left
            animationSpec = tween(500)
        )
    }

    val exitTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition)? = {
        slideOutHorizontally(
            targetOffsetX = { -it }, // Move from left to right
            animationSpec = tween(500)
        )
    }

    val popEnterTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition)? = {
        slideInHorizontally(
            initialOffsetX = { -it }, // Move from left to right on back navigation
            animationSpec = tween(500)
        )
    }

    val popExitTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition)? = {
        slideOutHorizontally(
            targetOffsetX = { it }, // Move from right to left on back navigation
            animationSpec = tween(500)
        )
    }

    // Top-level nav: keep a Login route for compatibility, and a Main shell that hosts bottom tabs.
    NavHost(navController = navController, startDestination = Screen.Main.route) {
        // Login route (kept for compatibility with existing flows)
        animatedComposable(
            route = Screen.Login.route,
            enterTransition = enterTransition,
            exitTransition = exitTransition,
            popEnterTransition = popEnterTransition,
            popExitTransition = popExitTransition
        ) { backStackEntry ->
            HomeScreen(navController)
        }

        // Main shell contains a nested NavHost for bottom tabs, with a persistent BottomBar
        composable(Screen.Main.route) {
            val tabNavController = rememberNavController()
            val currentRoute by tabNavController.currentBackStackEntryFlow.collectAsState(
                initial = tabNavController.currentBackStackEntry
            )
            Scaffold(
                bottomBar = {
                    if (currentRoute?.destination?.route != Screen.QuickCheckIn.route) {
                        BottomBarComponent(
                            navController = tabNavController,
                            onCenterClick = {
                                tabNavController.navigate(Screen.QuickCheckIn.route) {
                                    launchSingleTop = true
                                }
                            }
                        )
                    }
                }
            ) { innerPadding ->
                NavHost(
                    navController = tabNavController,
                    startDestination = Screen.Home.route,
                    modifier = Modifier.padding(innerPadding)
                ) {
                    composable(Screen.Home.route) { HomeScreen(tabNavController) }
                    composable(Screen.JourneyMap.route) { JourneyMapScreen(tabNavController) }
                    composable(Screen.Profile.route) { ProfileScreen() }
                    animatedComposable(
                        route = Screen.QuickCheckIn.route,
                        enterTransition = {
                            slideInVertically(
                                initialOffsetY = { it },
                                animationSpec = tween(320)
                            )
                        },
                        exitTransition = {
                            slideOutVertically(
                                targetOffsetY = { it },
                                animationSpec = tween(280)
                            )
                        },
                        popEnterTransition = {
                            slideInVertically(
                                initialOffsetY = { -it / 2 },
                                animationSpec = tween(320)
                            )
                        },
                        popExitTransition = {
                            slideOutVertically(
                                targetOffsetY = { it / 2 },
                                animationSpec = tween(280)
                            )
                        }
                    ) {
                        QuickCheckInScreen(tabNavController)
                    }
                }
            }
        }
    }
}

// Fixed extension function with correct nullable types
fun NavGraphBuilder.animatedComposable(
    route: String,
    enterTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition)? = null,
    exitTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition)? = null,
    popEnterTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition)? = null,
    popExitTransition: (AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition)? = null,
    content: @Composable AnimatedContentScope.(NavBackStackEntry) -> Unit
) {
    composable(
        route = route,
        enterTransition = enterTransition,
        exitTransition = exitTransition,
        popEnterTransition = popEnterTransition,
        popExitTransition = popExitTransition,
        content = content
    )
}

// Helper extension for navigation
fun NavController.navigateWithAnimation(route: String) {
    this.navigate(route) {
        launchSingleTop = true
    }
}

