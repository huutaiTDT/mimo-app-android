package huutai.dev.meetmino.core.design.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.darkColorScheme as materialDarkColorScheme
import androidx.compose.material3.lightColorScheme as materialLightColorScheme

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
    materialLightColorScheme(
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
    materialDarkColorScheme(
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

    val appColorScheme =
        if (darkTheme) darkColorScheme()
        else lightColorScheme()
    CompositionLocalProvider(
        LocalAppColors provides appColorScheme,
    ) {
        MaterialTheme(
            colorScheme = materialColors,
            typography = appTypography,
            shapes = appShapes,
            content = {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            AppTheme.colors.background
                        )
                ) {
                    content()
                }
            },
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