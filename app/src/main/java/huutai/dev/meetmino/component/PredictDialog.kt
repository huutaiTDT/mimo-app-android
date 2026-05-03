package huutai.dev.meetmino.component


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import huutai.dev.meetmino.R
import huutai.dev.meetmino.helper.getScreenHeight


@Composable
fun PredictDialog(
    onDismiss: () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss
    ) {

        Box(
            modifier = Modifier
                .height((getScreenHeight() / 1.78) .dp)
        ) {
           AnimateImg(
               source = R.raw.predict_anim
           )
        }
    }
}




