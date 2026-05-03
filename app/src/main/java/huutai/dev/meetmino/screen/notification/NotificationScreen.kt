package huutai.dev.meetmino.screen.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import huutai.dev.meetmino.component.EmptyView
import huutai.dev.meetmino.component.Header


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen() {
    Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
        Column {
            EmptyView(
                title = "No notification yet!"
            )
        }
        Header()

    }

}