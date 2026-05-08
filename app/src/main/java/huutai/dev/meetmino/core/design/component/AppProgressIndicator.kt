package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme

@Composable
fun AppLinearProgressIndicator(
    progress: Float,
    modifier: Modifier = Modifier,
    trackAlpha: Float = 0.25f
) {
    LinearProgressIndicator(
        progress = { progress.coerceIn(0f, 1f) },
        modifier = modifier
            .fillMaxWidth()
            .height(4.dp)
            .clip(AppShapes.Pill),
        color = AppTheme.colors.primary,
        trackColor = AppTheme.colors.border.copy(alpha = trackAlpha),
        drawStopIndicator = {}
    )
}

@Composable
fun AppCircularProgressIndicator(
    modifier: Modifier = Modifier,
    strokeWidth: androidx.compose.ui.unit.Dp = 4.dp
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = AppTheme.colors.primary,
        trackColor = AppTheme.colors.border.copy(alpha = 0.25f),
        strokeWidth = strokeWidth
    )
}