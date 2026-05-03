package huutai.dev.meetmino.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import huutai.dev.meetmino.component.BottomBarComponent
import huutai.dev.meetmino.theme.HodosTheme

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    HodosTheme {
        Scaffold(
            bottomBar = { BottomBarComponent(navController) },
            modifier = Modifier.background(Color.Transparent).fillMaxSize()
        ) { _ ->

                Box(modifier = Modifier.padding()) {
                    NavigationGraph(navController)
                }

        }
    }
}

sealed class BottomBarRoute(val route: String) {
    object Home : BottomBarRoute("home")
    object Post : BottomBarRoute("Post")
    object Trip : BottomBarRoute("trip")
    object Event : BottomBarRoute("Event")
    object Profile : BottomBarRoute("Profile")
}


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(BottomBarRoute.Home.route) { ComingSoonScreen() }
        composable(BottomBarRoute.Post.route) { ComingSoonScreen() }
        composable(BottomBarRoute.Trip.route) { ComingSoonScreen(
        ) }
        composable(BottomBarRoute.Event.route) { ComingSoonScreen() }
        composable(BottomBarRoute.Profile.route) { ComingSoonScreen() }
    }
}