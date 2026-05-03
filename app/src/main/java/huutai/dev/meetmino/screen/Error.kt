package huutai.dev.meetmino.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import huutai.dev.meetmino.LocalNavController
import huutai.dev.meetmino.component.ColumnCenter
import huutai.dev.meetmino.helper.getScreenWidth

@Composable
fun ErrorScreen(
    title: String? = ""
) {
    val navController = LocalNavController.current

    Box(
        modifier = Modifier.padding()
    ) {
        ColumnCenter(
            modifier = Modifier.fillMaxSize()
        ) {


            if (title != null) {

            }


        }
    }

}