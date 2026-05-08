package huutai.dev.meetmino.screen

import android.annotation.SuppressLint
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.R
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing
import kotlinx.coroutines.delay

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun SplashScreen(
    onNavigate: () -> Unit
) {
    val titleScale = remember { Animatable(0.9f) }
    val heroScale = remember { Animatable(0.92f) }
    val contentAlpha = remember { Animatable(0f) }
    val progressValue = remember { Animatable(0f) }

    val floatingTransition = rememberInfiniteTransition(label = "heroFloat")
    val floatY by floatingTransition.animateFloat(
        initialValue = -4f,
        targetValue = 4f,
        animationSpec = infiniteRepeatable(
            animation = tween(1400, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "floatY"
    )

    LaunchedEffect(Unit) {
        titleScale.animateTo(1f, tween(300, easing = FastOutSlowInEasing))
        heroScale.animateTo(1f, tween(450, easing = FastOutSlowInEasing))
        contentAlpha.animateTo(1f, tween(200))
        // Progress loading animation: complete in 2.5 seconds
        progressValue.animateTo(1f, tween(1500, easing = FastOutSlowInEasing))
        delay(200)
        onNavigate()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash),
            contentDescription = "Splash Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = Spacing.md,
                    vertical = Spacing.md
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Spacer(modifier = Modifier.height(Spacing.lg))

            // Title Section with decorative leaves
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .scale(titleScale.value)
                    .alpha(contentAlpha.value)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.9f),
                    contentAlignment = Alignment.Center
                ) {
                    // Leaf decorations
                    AppText(
                        text = "🍃",
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 16.dp, y = (-8).dp)
                            .scale(0.8f),
                        variant = AppTextVariant.Title
                    )

                    AppText(
                        text = "🍃",
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .offset(x = (-12).dp, y = 4.dp)
                            .scale(0.7f),
                        variant = AppTextVariant.Title
                    )

                    AppText(
                        text = "Meet Mino",
                        color = AppTheme.colors.primary,
                        textAlign = TextAlign.Center,
                        variant = AppTextVariant.Display,
                        bold = true
                    )

                    AppText(
                        text = "🍃",
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .offset(x = (-6).dp, y = (-16).dp)
                            .scale(0.75f),
                        variant = AppTextVariant.Title
                    )

                    AppText(
                        text = "🍃",
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(x = 20.dp, y = 8.dp)
                            .scale(0.6f),
                        variant = AppTextVariant.Title
                    )
                }
                
                // Decorative underline accent
                Spacer(modifier = Modifier.height(4.dp))
                Box(
                    modifier = Modifier
                        .width(160.dp)
                        .height(3.dp)
                        .clip(AppShapes.Pill)
                        .background(
                            AppTheme.colors.primary
                        )
                )

                Spacer(modifier = Modifier.height(Spacing.md))

                AppText(
                    text = "Track every journey. Share every moment.\nCheck in everywhere.",
                    color = AppTheme.colors.textPrimary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.alpha(contentAlpha.value),
                    variant = AppTextVariant.Body
                )
            }

            Spacer(modifier = Modifier.height(Spacing.lg))
            
            // Progress Loading Indicator
            LinearProgressIndicator(
                progress = { progressValue.value },
                modifier = Modifier
                    .fillMaxWidth(0.72f)
                    .height(20.dp)
                    .clip(AppShapes.Pill),
                color = AppTheme.colors.primary,
                trackColor = AppTheme.colors.background,
                drawStopIndicator = {}
            )

            Spacer(modifier = Modifier.height(Spacing.md))
        }
    }
}

