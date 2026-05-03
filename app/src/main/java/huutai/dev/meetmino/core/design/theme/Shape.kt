package huutai.dev.meetmino.core.design.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * Shape & Radius System
 * Soft, friendly, rounded UI elements (16–24dp)
 */
object AppShapes {
    val Small = RoundedCornerShape(8.dp)
    val Medium = RoundedCornerShape(16.dp)
    val Large = RoundedCornerShape(24.dp)
    val Pill = RoundedCornerShape(50.dp)
    val Circle = RoundedCornerShape(50)
}

/**
 * Material3 Shapes implementation
 */
val appShapes = Shapes(
    small = AppShapes.Small,
    medium = AppShapes.Medium,
    large = AppShapes.Large
)
