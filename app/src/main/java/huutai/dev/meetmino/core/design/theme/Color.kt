package huutai.dev.meetmino.core.design.theme

import androidx.compose.ui.graphics.Color

/**
 * Light Theme Colors - Soft, friendly, minimalist palette
 * Primary green gradient (#4CAF50 → #2E7D32)
 */
object LightColors {
    // Primary colors
    val Primary = Color(0xFF4CAF50)
    val PrimaryVariant = Color(0xFF2E7D32)
    val Secondary = Color(0xFF66BB6A)

    // Background & Surface
    val Background = Color(0xFFF5F7F6)
    val Surface = Color(0xFFFFFFFF)
    val Card = Color(0xFFFFFFFF)

    // Text colors
    val TextPrimary = Color(0xFF263238)
    val TextSecondary = Color(0xFF607D8B)
    val TextHint = Color(0xFF9E9E9E)

    // Border
    val Border = Color(0xFFE0E0E0)

    // Accent colors
    val Blue = Color(0xFF4FC3F7)
    val Yellow = Color(0xFFFFD54F)
    val Red = Color(0xFFEF5350)

    // State colors
    val Success = Color(0xFF4CAF50)
    val Error = Color(0xFFE53935)
    val Warning = Color(0xFFFFA726)
    val Info = Color(0xFF29B6F6)

    // Semantic
    val Disabled = Color(0xFFBDBDBD)
    val Divider = Color(0xFFEEEEEE)
}

/**
 * Dark Theme Colors - Deep, desaturated, high contrast
 * Primary green gradient (#81C784 → #388E3C)
 */
object DarkColors {
    // Primary colors
    val Primary = Color(0xFF81C784)
    val PrimaryVariant = Color(0xFF388E3C)
    val Secondary = Color(0xFFA5D6A7)

    // Background & Surface
    val Background = Color(0xFF0F172A)
    val Surface = Color(0xFF1E293B)
    val Card = Color(0xFF1E293B)

    // Text colors
    val TextPrimary = Color(0xFFE2E8F0)
    val TextSecondary = Color(0xFF94A3B8)
    val TextHint = Color(0xFF64748B)

    // Border
    val Border = Color(0xFF334155)

    // Accent colors
    val Blue = Color(0xFF38BDF8)
    val Yellow = Color(0xFFFACC15)
    val Red = Color(0xFFF87171)

    // State colors
    val Success = Color(0xFF4ADE80)
    val Error = Color(0xFFF87171)
    val Warning = Color(0xFFFBBF24)
    val Info = Color(0xFF06B6D4)

    // Semantic
    val Disabled = Color(0xFF64748B)
    val Divider = Color(0xFF334155)
}

/**
 * Semantic color mapping - use these throughout the app
 */
data class AppColorScheme(
    val primary: Color,
    val primaryVariant: Color,
    val secondary: Color,
    val background: Color,
    val surface: Color,
    val card: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textHint: Color,
    val border: Color,
    val blue: Color,
    val yellow: Color,
    val red: Color,
    val success: Color,
    val error: Color,
    val warning: Color,
    val info: Color,
    val disabled: Color,
    val divider: Color
)

fun lightColorScheme() = AppColorScheme(
    primary = LightColors.Primary,
    primaryVariant = LightColors.PrimaryVariant,
    secondary = LightColors.Secondary,
    background = LightColors.Background,
    surface = LightColors.Surface,
    card = LightColors.Card,
    textPrimary = LightColors.TextPrimary,
    textSecondary = LightColors.TextSecondary,
    textHint = LightColors.TextHint,
    border = LightColors.Border,
    blue = LightColors.Blue,
    yellow = LightColors.Yellow,
    red = LightColors.Red,
    success = LightColors.Success,
    error = LightColors.Error,
    warning = LightColors.Warning,
    info = LightColors.Info,
    disabled = LightColors.Disabled,
    divider = LightColors.Divider
)

fun darkColorScheme() = AppColorScheme(
    primary = DarkColors.Primary,
    primaryVariant = DarkColors.PrimaryVariant,
    secondary = DarkColors.Secondary,
    background = DarkColors.Background,
    surface = DarkColors.Surface,
    card = DarkColors.Card,
    textPrimary = DarkColors.TextPrimary,
    textSecondary = DarkColors.TextSecondary,
    textHint = DarkColors.TextHint,
    border = DarkColors.Border,
    blue = DarkColors.Blue,
    yellow = DarkColors.Yellow,
    red = DarkColors.Red,
    success = DarkColors.Success,
    error = DarkColors.Error,
    warning = DarkColors.Warning,
    info = DarkColors.Info,
    disabled = DarkColors.Disabled,
    divider = DarkColors.Divider
)
