package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.core.design.theme.AppTheme

@Composable
fun AppDivider(
    modifier: Modifier = Modifier,
    thickness: androidx.compose.ui.unit.Dp = 1.dp,
    alpha: Float = 1f
) {
    HorizontalDivider(
        modifier = modifier.fillMaxWidth(),
        thickness = thickness,
        color = AppTheme.colors.divider.copy(alpha = alpha)
    )
}