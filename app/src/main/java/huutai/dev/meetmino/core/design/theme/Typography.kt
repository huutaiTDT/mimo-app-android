package huutai.dev.meetmino.core.design.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Typography System
 * Modern sans-serif with clear hierarchy: bold headers, soft body text
 */
val appTypography = Typography(
    // Headlines
    headlineLarge = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),

    // Titles
    titleLarge = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 26.sp,
        letterSpacing = 0.1.sp
    ),
    titleSmall = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 24.sp,
        letterSpacing = 0.1.sp
    ),

    // Body text (main content)
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),

    // Labels & small text
    labelLarge = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontSize = 11.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
