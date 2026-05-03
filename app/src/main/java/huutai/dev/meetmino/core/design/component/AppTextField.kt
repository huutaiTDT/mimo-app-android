package huutai.dev.meetmino.core.design.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing

/**
 * App Text Input Field
 * - Rounded corners (16dp)
 * - Subtle border
 * - Friendly styling
 */
@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    enabled: Boolean = true,
    isError: Boolean = false,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    singleLine: Boolean = false
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = if (isError) AppTheme.colors.error else AppTheme.colors.border,
                shape = AppShapes.Medium
            )
            .background(
                color = AppTheme.colors.surface,
                shape = AppShapes.Medium
            )
            .padding(Spacing.md),
        enabled = enabled,
        singleLine = singleLine,
        textStyle = TextStyle(
            fontSize = 16.sp,
            color = AppTheme.colors.textPrimary
        ),
        decorationBox = { innerTextField ->
            if (value.isEmpty()) {
                Text(
                    text = placeholder,
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = AppTheme.colors.textHint
                    )
                )
            } else {
                innerTextField()
            }
        }
    )
}
