package huutai.dev.meetmino.core.design.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.appTypography

enum class AppTextVariant {
    Display,
    Heading,
    Title,
    Body,
    Label,
    Caption
}

@Composable
fun AppText(
    text: String,
    modifier: Modifier = Modifier,
    variant: AppTextVariant = AppTextVariant.Body,
    color: androidx.compose.ui.graphics.Color = AppTheme.colors.textPrimary,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    bold: Boolean = false,
    extraBold: Boolean = false
) {
    val baseStyle = when (variant) {
        AppTextVariant.Display -> appTypography.headlineLarge
        AppTextVariant.Heading -> appTypography.headlineMedium
        AppTextVariant.Title -> appTypography.titleLarge
        AppTextVariant.Body -> appTypography.bodyLarge
        AppTextVariant.Label -> appTypography.labelLarge
        AppTextVariant.Caption -> appTypography.bodySmall.copy(fontSize = 11.sp)
    }

    Text(
        text = text,
        modifier = modifier,
        style = baseStyle.copy(
            fontWeight = when {
                extraBold -> androidx.compose.ui.text.font.FontWeight.ExtraBold
                bold -> androidx.compose.ui.text.font.FontWeight.Bold
                else -> baseStyle.fontWeight
            }
        ),
        color = color,
        textAlign = textAlign,
        maxLines = maxLines,
        overflow = overflow
    )
}