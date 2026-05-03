package huutai.dev.meetmino.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.LocalNavController
import huutai.dev.meetmino.R
import huutai.dev.meetmino.Screen
import huutai.dev.meetmino.component.BtnPrimary
import huutai.dev.meetmino.component.ColumnCenter
import huutai.dev.meetmino.component.ImgSource
import huutai.dev.meetmino.component.Seprate
import huutai.dev.meetmino.helper.getScreenWidth
import huutai.dev.meetmino.navigateWithAnimation
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
@Composable
fun RequireLoginScreen(
) {

    val navController = LocalNavController.current


    Box(
        modifier = Modifier.padding()
    ) {
        ColumnCenter(
            modifier = Modifier.fillMaxSize()
        ) {

            ImgSource(
                source = R.drawable.login_req,
                modifier = Modifier.width((getScreenWidth()).dp),
            )

            Seprate(height = 10)

            BtnPrimary(
                minWidth = getScreenWidth() / 2,
                title = "LOGIN",
                onClick = {
                    navController.navigateWithAnimation(Screen.Login.route)
                }
            )

        }
    }

}