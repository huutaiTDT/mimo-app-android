package huutai.dev.meetmino.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import kotlinx.coroutines.delay

enum class NotifyType {
    SUCCESS, ERROR
}

@Composable
fun NotifyPopup(
    message: String,
    type: NotifyType,
    onDismiss: () -> Unit,
    durationMillis: Long = 2000
) {
    // Tự động đóng sau vài giây
    LaunchedEffect(Unit) {
        delay(durationMillis)
        onDismiss()
    }

    Dialog(onDismissRequest = { onDismiss() },
        ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
        ) {
            ColumnCenter {
                if (type == NotifyType.ERROR) {
                   //todo
                } else {
                    //todo
                }

                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }

}

