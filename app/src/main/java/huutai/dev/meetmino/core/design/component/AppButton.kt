package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppElevation
import huutai.dev.meetmino.core.design.theme.AppGradients
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing

/**
 * Primary CTA Button
 * - Pill-shaped (full rounded)
 * - Green gradient
 * - Soft shadow
 * - Friendly, inviting style
 */
@Composable
fun AppPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled && !isLoading,
        shape = AppShapes.Pill,
        colors = ButtonDefaults.buttonColors(
            containerColor = AppTheme.colors.primary,
            disabledContainerColor = AppTheme.colors.disabled
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = AppElevation.Small,
            pressedElevation = AppElevation.Medium
        ),
        contentPadding = PaddingValues(
            horizontal = Spacing.buttonPaddingHorizontal,
            vertical = 12.dp
        )
    ) {
        Text(
            text = if (isLoading) "Loading..." else text,
            style = TextStyle(
                fontSize = 16.sp
            ),
            color = if (enabled) Color.White else AppTheme.colors.textHint
        )
    }
}

/**
 * Secondary Button
 * - Outlined style
 * - No gradient
 * - Subtle, friendly
 */
@Composable
fun AppSecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = AppShapes.Pill,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = AppTheme.colors.surface,
            contentColor = AppTheme.colors.primary,
            disabledContentColor = AppTheme.colors.disabled
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp
        ),
        contentPadding = PaddingValues(
            horizontal = Spacing.buttonPaddingHorizontal,
            vertical = 12.dp
        )
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp
            )
        )
    }
}

/**
 * Success Button (for confirmation, approval)
 */
@Composable
fun AppSuccessButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = AppShapes.Pill,
        colors = ButtonDefaults.buttonColors(
            containerColor = AppTheme.colors.success
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = AppElevation.Small
        ),
        contentPadding = PaddingValues(
            horizontal = Spacing.buttonPaddingHorizontal,
            vertical = 12.dp
        )
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp
            ),
            color = Color.White
        )
    }
}

/**
 * Error/Danger Button
 */
@Composable
fun AppErrorButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = AppShapes.Pill,
        colors = ButtonDefaults.buttonColors(
            containerColor = AppTheme.colors.error
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = AppElevation.Small
        ),
        contentPadding = PaddingValues(
            horizontal = Spacing.buttonPaddingHorizontal,
            vertical = 12.dp
        )
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp
            ),
            color = Color.White
        )
    }
}
