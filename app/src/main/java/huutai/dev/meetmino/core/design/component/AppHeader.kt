package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing
import huutai.dev.meetmino.core.design.theme.appTypography

@Composable
fun AppHeader(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    leadingIcon: ImageVector? = null,
    onLeadingClick: (() -> Unit)? = null,
    actions: List<Pair<ImageVector, () -> Unit>> = emptyList(),
    showDivider: Boolean = false,
    accentColor: Color = AppTheme.colors.primary
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Spacing.md, vertical = Spacing.md),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(Spacing.sm),
                modifier = Modifier.weight(1f)
            ) {
                if (leadingIcon != null) {
                    Box(
                        modifier = Modifier
                            .background(accentColor.copy(alpha = 0.14f), CircleShape)
                            .clickable(enabled = onLeadingClick != null) { onLeadingClick?.invoke() }
                            .padding(10.dp)
                    ) {
                        Icon(
                            imageVector = leadingIcon,
                            contentDescription = null,
                            tint = accentColor
                        )
                    }
                } else {
                    Box(
                        modifier = Modifier
                            .background(accentColor.copy(alpha = 0.14f), CircleShape)
                            .padding(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(10.dp)
                                .background(accentColor, CircleShape)
                        )
                    }
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = title,
                        style = appTypography.titleLarge.copy(
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 22.sp
                        ),
                        color = AppTheme.colors.textPrimary
                    )

                    if (subtitle != null) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = subtitle,
                            style = appTypography.bodySmall,
                            color = AppTheme.colors.textSecondary
                        )
                    }
                }
            }

            if (actions.isNotEmpty()) {
                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.xs)) {
                    actions.forEach { (icon, onClick) ->
                        IconButton(onClick = onClick) {
                            Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = accentColor
                            )
                        }
                    }
                }
            }
        }

        if (showDivider) {
            AppDivider(alpha = 0.7f)
        }
    }
}

@Composable
fun AppBrandHeader(
    modifier: Modifier = Modifier,
    title: String = "Meet Mino",
    subtitle: String = "Track every journey. Share every moment.",
    accentColor: Color = AppTheme.colors.primary
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box(
            modifier = Modifier
                .background(accentColor.copy(alpha = 0.18f), CircleShape)
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(10.dp)
                    .background(accentColor, CircleShape)
            )
        }

        Column {
            Text(
                text = title,
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = AppTheme.colors.textPrimary
            )
            Text(
                text = subtitle,
                fontSize = 13.sp,
                color = AppTheme.colors.textSecondary
            )
        }
    }
}