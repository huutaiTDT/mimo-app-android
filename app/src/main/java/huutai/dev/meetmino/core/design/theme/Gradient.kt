package huutai.dev.meetmino.core.design.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * Gradient System - Signature style for app
 * Soft UI + Green Gradient = App identity
 */
object AppGradients {
    // Primary green gradient (light theme)
    val PrimaryGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFF4CAF50),
            Color(0xFF2E7D32)
        )
    )

    // Dark primary gradient (dark theme)
    val DarkPrimaryGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFF81C784),
            Color(0xFF388E3C)
        )
    )

    // Success gradient
    val SuccessGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFF66BB6A),
            Color(0xFF4CAF50)
        )
    )

    // Error gradient
    val ErrorGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFFEF5350),
            Color(0xFFE53935)
        )
    )

    // Warning gradient
    val WarningGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFFFFA726),
            Color(0xFFFB8C00)
        )
    )

    // Blue gradient (map accent)
    val BlueGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFF4FC3F7),
            Color(0xFF0288D1)
        )
    )

    // Soft pastel map gradient (light mode)
    val MapGradientLight = Brush.linearGradient(
        colors = listOf(
            Color(0xFFF5F7F6).copy(alpha = 0.85f),
            Color(0xFFE8F5E9).copy(alpha = 0.85f)
        )
    )

    // Dark map gradient (dark mode)
    val MapGradientDark = Brush.linearGradient(
        colors = listOf(
            Color(0xFF0F172A).copy(alpha = 0.85f),
            Color(0xFF1E293B).copy(alpha = 0.85f)
        )
    )
}
