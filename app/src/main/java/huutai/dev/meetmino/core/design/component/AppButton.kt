package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppElevation
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
    isLoading: Boolean = false,
    useGradient: Boolean = true
) {
    Button(
        onClick = onClick,
        enabled = enabled && !isLoading,
        modifier = modifier,
        shape = AppShapes.Pill,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent, // 👈 quan trọng
            disabledContainerColor = AppTheme.colors.disabled
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = AppElevation.Small,
            pressedElevation = AppElevation.Medium
        ),
        contentPadding = PaddingValues() // 👈 control bên trong
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    if (useGradient && enabled) {
                        Brush.horizontalGradient(
                            listOf(
                                AppTheme.colors.primary,
                                AppTheme.colors.primaryVariant
                            )
                        )
                    } else {
                        Brush.horizontalGradient(
                            listOf(
                                AppTheme.colors.disabled,
                                AppTheme.colors.disabled
                            )
                        )
                    }
                )
                .padding(
                    horizontal = Spacing.buttonPaddingHorizontal,
                    vertical = 12.dp
                ),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = if (isLoading) "Loading..." else text,
                style = TextStyle(fontSize = 16.sp),
                color = Color.White
            )
        }
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
    enabled: Boolean = true,
    isLoading: Boolean = false
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
            defaultElevation = AppElevation.Small,
            pressedElevation = AppElevation.Medium
        ),
        contentPadding = PaddingValues() // 👈
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    if (enabled) {
                        Brush.horizontalGradient(
                            listOf(
                                AppTheme.colors.background,
                                AppTheme.colors.background
                            )
                        )
                    } else {
                        Brush.horizontalGradient(
                            listOf(
                                AppTheme.colors.disabled,
                                AppTheme.colors.disabled
                            )
                        )
                    }
                )
                .padding(
                    horizontal = Spacing.buttonPaddingHorizontal,
                    vertical = 12.dp
                ),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = if (isLoading) "Loading..." else text,
                style = TextStyle(fontSize = 16.sp),
                color = AppTheme.colors.primary
            )
        }
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


