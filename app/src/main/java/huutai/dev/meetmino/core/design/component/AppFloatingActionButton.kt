package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import huutai.dev.meetmino.core.design.theme.AppElevation
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing

/**
 * App Floating Action Button (FAB)
 * - Green primary color
 * - Soft shadow (8dp)
 * - Smooth transitions
 */
@Composable
fun AppFloatingActionButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    FloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        containerColor = AppTheme.colors.primary,
        contentColor = androidx.compose.ui.graphics.Color.White,
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = AppElevation.Floating,
            pressedElevation = AppElevation.Large
        )
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription
        )
    }
}

/**
 * Extended FAB with label
 */
@Composable
fun AppExtendedFloatingActionButton(
    icon: ImageVector,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    FloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        containerColor = AppTheme.colors.primary,
        contentColor = androidx.compose.ui.graphics.Color.White,
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = AppElevation.Floating
        )
    ) {
        Box(
            modifier = Modifier.padding(Spacing.md),
            contentAlignment = Alignment.Center
        ) {
            androidx.compose.foundation.layout.Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = Spacing.md)
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = text
                )
            }
        }
    }
}

/**
 * Floating Action Button Group (bottom-right corner)
 */
@Composable
fun AppFloatingActionButtonCluster(
    items: List<Pair<ImageVector, () -> Unit>>,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(Spacing.lg),
        contentAlignment = Alignment.BottomEnd
    ) {
        androidx.compose.foundation.layout.Column(
            horizontalAlignment = Alignment.End
        ) {
            items.forEach { (icon, onClick) ->
                AppFloatingActionButton(
                    icon = icon,
                    contentDescription = "Action",
                    onClick = onClick,
                    modifier = Modifier.padding(Spacing.sm)
                )
            }
        }
    }
}
