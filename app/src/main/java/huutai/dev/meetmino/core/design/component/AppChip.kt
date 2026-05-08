package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing

@Composable
fun AppChip(
    text: String,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    enabled: Boolean = true,
    onClick: (() -> Unit)? = null
) {
    val backgroundColor = if (selected) AppTheme.colors.primary.copy(alpha = 0.12f) else AppTheme.colors.surface
    val contentColor = if (selected) AppTheme.colors.primary else AppTheme.colors.textPrimary
    val borderColor = if (selected) AppTheme.colors.primary.copy(alpha = 0.3f) else AppTheme.colors.border

    Box(
        modifier = modifier
            .border(width = 1.dp, color = borderColor, shape = AppShapes.Pill)
            .background(color = backgroundColor, shape = AppShapes.Pill)
            .then(
                if (enabled && onClick != null) {
                    Modifier.clickable(onClick = onClick)
                } else {
                    Modifier
                }
            )
            .padding(horizontal = Spacing.md, vertical = Spacing.xs),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = TextStyle(fontSize = 13.sp),
            color = if (enabled) contentColor else AppTheme.colors.textHint
        )
    }
}

@Composable
fun AppStatusChip(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = AppTheme.colors.success
) {
    Row(
        modifier = modifier
            .background(color.copy(alpha = 0.12f), CircleShape)
            .padding(horizontal = Spacing.md, vertical = Spacing.xs),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = TextStyle(fontSize = 12.sp),
            color = color
        )
    }
}