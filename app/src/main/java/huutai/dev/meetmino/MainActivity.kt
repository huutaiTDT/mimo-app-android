package huutai.dev.meetmino

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import huutai.dev.meetmino.helper.NetworkStateMonitor
import huutai.dev.meetmino.helper.OnboardingUtils
import huutai.dev.meetmino.screen.OnboardingScreen
import huutai.dev.meetmino.screen.SplashScreen
import huutai.dev.meetmino.theme.HodosTheme

val LocalNavController = staticCompositionLocalOf<NavHostController> {
    error("NavController not provided")
}

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var networkMonitor: NetworkStateMonitor
    private val onboardingUtils by lazy { OnboardingUtils(this) }
    @OptIn(ExperimentalAnimationApi::class)
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        networkMonitor = NetworkStateMonitor(this)
        networkMonitor.register()

        installSplashScreen()
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                Color.TRANSPARENT,
                Color.TRANSPARENT
            )
        )

        setContent {
            val navController = rememberNavController()
            val isNetworkAvailable by networkMonitor.isConnected.collectAsState()
            var showSplash by remember { mutableStateOf(true) }

            HodosTheme {
                CompositionLocalProvider(LocalNavController provides navController) {
                    AnimatedContent(
                        targetState = showSplash,
                        transitionSpec = {
                            slideInHorizontally(initialOffsetX = { it }) with
                                    slideOutHorizontally(targetOffsetX = { -it }) using
                                    SizeTransform(clip = false)
                        }, label = ""
                    ) { isSplash ->
                        if (isSplash) {
                            SplashScreen(
                                onNavigate = {
                                    showSplash = false
                                }
                            )
                        } else {
                            Box(modifier = Modifier.fillMaxSize()) {
                                if (onboardingUtils.isOnboardingCompleted()) {
                                    AppNavHost(navController)
                                } else {
                                    ShowOnboardingScreen(navController, onboardingUtils)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @OptIn(ExperimentalAnimationApi::class, ExperimentalFoundationApi::class)
    @Composable
    private fun ShowOnboardingScreen(
        navController: NavHostController,
        onboardingUtils: OnboardingUtils
    ) {
        val scope = rememberCoroutineScope()

        OnboardingScreen(
            onFinishOnboarding = {onboardingUtils.setOnboardingCompleted()}
        )
    }
    override fun onDestroy() {
        super.onDestroy()
        networkMonitor.unregister()
    }
}
