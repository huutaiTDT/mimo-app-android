package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.core.design.theme.AppElevation
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme

/**
 * App Card Component
 * - Rounded corners (24dp)
 * - Soft shadow (4dp)
 * - Padding: 16-20dp
 * - Light border for dark mode
 */
@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        modifier = modifier
            ,
        shape = AppShapes.Large,
        colors = CardDefaults.cardColors(
            containerColor = AppTheme.colors.card
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = AppElevation.None
        ),
        content = content
    )
}

/**
 * Elevated Card (stronger shadow for depth)
 */
@Composable
fun AppElevatedCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier
            .border(
                width = 1.dp,
                color = AppTheme.colors.border,
                shape = AppShapes.Large
            ),
        shape = AppShapes.Large,
        colors = CardDefaults.cardColors(
            containerColor = AppTheme.colors.card
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = AppElevation.Medium
        ),
        content = content
    )
}

/**
 * Gradient Card (accent with gradient background)
 */
@Composable
fun AppGradientCard(
    modifier: Modifier = Modifier,
    brush: Brush = AppTheme.let {
        if (it.colors.background.value.toLong() == 0xFF0F172A) {
            // Dark theme
            huutai.dev.meetmino.core.design.theme.AppGradients.DarkPrimaryGradient
        } else {
            // Light theme
            huutai.dev.meetmino.core.design.theme.AppGradients.PrimaryGradient
        }
    },
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier
            .background(brush = brush, shape = AppShapes.Large),
        shape = AppShapes.Large,
        colors = CardDefaults.cardColors(
            containerColor = androidx.compose.ui.graphics.Color.Transparent
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = AppElevation.Card
        ),
        content = content
    )
}
