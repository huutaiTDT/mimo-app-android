package huutai.dev.meetmino.core.design.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * App custom colors
 */
val LocalAppColors = staticCompositionLocalOf<AppColorScheme> {
    error("LocalAppColors not provided")
}

/**
 * Material 3 Light Theme
 */
private val LightMaterialColors: ColorScheme =
    lightColorScheme(
        primary = LightColors.Primary,
        onPrimary = Color.White,

        secondary = LightColors.Secondary,
        onSecondary = Color.White,

        tertiary = LightColors.Blue,
        onTertiary = Color.White,

        background = LightColors.Background,
        onBackground = LightColors.TextPrimary,

        surface = LightColors.Surface,
        onSurface = LightColors.TextPrimary,

        error = LightColors.Error,
        onError = Color.White,

        outline = LightColors.Border
    )

/**
 * Material 3 Dark Theme
 */
private val DarkMaterialColors: ColorScheme =
    darkColorScheme(
        primary = DarkColors.Primary,
        onPrimary = Color.Black,

        secondary = DarkColors.Secondary,
        onSecondary = Color.Black,

        tertiary = DarkColors.Blue,
        onTertiary = Color.Black,

        background = DarkColors.Background,
        onBackground = DarkColors.TextPrimary,

        surface = DarkColors.Surface,
        onSurface = DarkColors.TextPrimary,

        error = DarkColors.Error,
        onError = Color.Black,

        outline = DarkColors.Border
    )

/**
 * Main Theme
 */
@Composable
fun MeetMinoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val materialColors =
        if (darkTheme) DarkMaterialColors
        else LightMaterialColors

    val customColors =
        if (darkTheme) DarkColors
        else LightColors

    CompositionLocalProvider(
        LocalAppColors provides customColors as AppColorScheme
    ) {
        MaterialTheme(
            colorScheme = materialColors,
            typography = appTypography,
            shapes = appShapes,
            content = content
        )
    }
}

/**
 * Access custom theme colors
 */
object AppTheme {

    val colors: AppColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalAppColors.current
}