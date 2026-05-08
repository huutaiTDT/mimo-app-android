package huutai.dev.meetmino.screen.home

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.MyLocation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.R
import huutai.dev.meetmino.core.design.component.AppCard
import huutai.dev.meetmino.core.design.component.AppPrimaryButton
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.theme.AppTheme

/**
 * TrackingMapComponent - placeholder map area + stats card + actions
 * - distanceKm: Double
 * - duration: String (HH:MM:SS)
 * - avgSpeed: Double
 * - calories: Int
 */
@Composable
fun TrackingMapComponent(
    modifier: Modifier = Modifier,
    distanceKm: Double = 3.26,
    duration: String = "00:45:12",
    avgSpeed: Double = 28.6,
    calories: Int = 186,
    isTracking: Boolean = false,
    onStartStop: () -> Unit = {},
    onCameraClick: () -> Unit = {},
    onFabClick: () -> Unit = {}
) {
    val mascotTransition = rememberInfiniteTransition(label = "mascot-transition")
    val mascotBob by mascotTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2200),
            repeatMode = RepeatMode.Reverse
        ),
        label = "mascot-bob"
    )

    val mascotScale by mascotTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2200),
            repeatMode = RepeatMode.Reverse
        ),
        label = "mascot-scale"
    )

    Box(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(580.dp)
        ) {
            MapComposable(modifier = Modifier.matchParentSize())

            Box(
                modifier = Modifier
                    .matchParentSize()
            )

            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .fillMaxWidth()
                    .height(88.dp)
                    .background(
                        androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                AppTheme.colors.background,
                                AppTheme.colors.background.copy(alpha = 0.92f),
                                AppTheme.colors.background.copy(alpha = 0.54f),
                                AppTheme.colors.background.copy(alpha = 0.24f),
                                Color.Transparent
                            )
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .height(96.dp)
                    .background(
                        androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                AppTheme.colors.background.copy(alpha = 0.24f),
                                AppTheme.colors.background.copy(alpha = 0.54f),
                                AppTheme.colors.background.copy(alpha = 0.88f),
                                AppTheme.colors.background
                            )
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MapFloatingControlButton(
                    icon = Icons.Default.MyLocation,
                    contentDescription = "Center map"
                )
                MapFloatingControlButton(
                    icon = Icons.Default.Layers,
                    contentDescription = "Map layers"
                )
                MapFloatingControlButton(
                    label = "3D",
                    contentDescription = "3D view"
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 14.dp)
        ) {
            Column(modifier = Modifier.align(Alignment.TopStart).padding(end = 132.dp)) {
                AppText("Good Morning!", variant = AppTextVariant.Body, bold = true)
                AppText(
                    "Ready for a new adventure?",
                    variant = AppTextVariant.Caption,
                    color = AppTheme.colors.textSecondary
                )
            }

            Image(
                painter = painterResource(R.drawable.welcome),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 18.dp, y = (-24).dp - (6 * mascotBob).dp)
                    .graphicsLayer {
                        scaleX = mascotScale
                        scaleY = mascotScale
                    }
                    .size(138.dp),
                contentScale = ContentScale.Fit
            )
        }

        // overlay UI elements (status chip, stats card, actions) are drawn on top
        Box(modifier = Modifier.matchParentSize()) {
            // top-left status chip
            AppCard(modifier = Modifier.padding(12.dp).width(220.dp)) {
                Row(modifier = Modifier.padding(12.dp), horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                    AppText("☀️ 28°C", variant = AppTextVariant.Body, bold = true)
                    Spacer(modifier = Modifier.width(4.dp))
                    AppText("Nắng đẹp để khám phá", variant = AppTextVariant.Caption, color = AppTheme.colors.textSecondary)
                }
            }

            AppCard(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 12.dp, top = 24.dp)
                    .width(150.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(18.dp)) {
                    TrackingMetricRow(
                        icon = "🏃",
                        value = "3.26 km",
                        label = "Đã di chuyển"
                    )
                    TrackingMetricRow(
                        icon = "🕒",
                        value = "00:45:12",
                        label = "Thời gian"
                    )
                    TrackingMetricRow(
                        icon = "⚡",
                        value = "28.6 km/h",
                        label = "Tốc độ TB"
                    )
                    TrackingMetricRow(
                        icon = "🔥",
                        value = "186 kcal",
                        label = "Calories"
                    )
                }
            }


            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                AppPrimaryButton(
                    text = if (isTracking) "Dừng" else "Bắt Đầu",
                    onClick = onStartStop,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 24.dp)
                        .width(180.dp)
                )
                IconButton(
                    onClick = onCameraClick,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(end = 22.dp, bottom = 24.dp)
                        .size(56.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                ) {
                    Icon(
                        Icons.Default.CameraAlt,
                        contentDescription = "Camera",
                        tint = AppTheme.colors.primary
                    )
                }
            }
        }
    }
}

@Composable
private fun TrackingMetricRow(
    icon: String,
    value: String,
    label: String
) {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(AppTheme.colors.primary.copy(alpha = 0.12f)),
            contentAlignment = Alignment.Center
        ) {
            AppText(icon, variant = AppTextVariant.Caption)
        }

        Column {
            AppText(value, variant = AppTextVariant.Body, bold = true)
            AppText(label, variant = AppTextVariant.Caption, color = AppTheme.colors.textSecondary)
        }
    }
}

@Composable
private fun MapFloatingControlButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector? = null,
    label: String? = null,
    contentDescription: String
) {
    Box(
        modifier = Modifier
            .size(52.dp)
            .clip(CircleShape)
            .background(AppTheme.colors.background),
        contentAlignment = Alignment.Center
    ) {
        when {
            icon != null -> Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = AppTheme.colors.textPrimary
            )
            label != null -> AppText(
                text = label,
                variant = AppTextVariant.Title,
                bold = true,
                color = AppTheme.colors.textPrimary
            )
        }
    }
}
