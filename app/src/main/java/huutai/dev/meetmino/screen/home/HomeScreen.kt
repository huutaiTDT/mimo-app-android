package huutai.dev.meetmino.screen

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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Route
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import huutai.dev.meetmino.component.BottomBarComponent
import huutai.dev.meetmino.core.design.component.AppCard
import huutai.dev.meetmino.core.design.component.AppChip
import huutai.dev.meetmino.core.design.component.AppDivider
import huutai.dev.meetmino.core.design.component.AppPrimaryButton
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.component.AppTopBar
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.Spacing

/**
 * Home screen inspired by provided mockup image.
 * Uses existing app components and theme assets.
 */
@Composable
fun HomeScreen(
    navController : NavController,
    modifier: Modifier = Modifier,
    onFabClick: () -> Unit = {},
    onPrimaryClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 104.dp)
        ) {
            AppTopBar(title = "Hi, Shubham 👋", actions = emptyList())

            Spacer(modifier = Modifier.height(Spacing.sm))

            AppText("Good Morning!", variant = AppTextVariant.Display, color = AppTheme.colors.primaryVariant, bold = true)
            AppText("Ready for a new adventure?", variant = AppTextVariant.Body, color = AppTheme.colors.textSecondary)

            Spacer(modifier = Modifier.height(Spacing.lg))

            Box(modifier = Modifier.fillMaxWidth().height(170.dp)) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .size(130.dp)
                        .clip(CircleShape)
                        .background(Brush.radialGradient(listOf(Color(0xFFD6F7D0), Color(0xFF9BD770))))
                        .shadow(14.dp, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(Icons.Default.CameraAlt, contentDescription = "mascot", tint = Color(0xFF2E7D32), modifier = Modifier.size(42.dp))
                }

                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(x = (-16).dp, y = 10.dp)
                        .clip(AppShapes.Pill)
                        .background(Color.White.copy(alpha = 0.55f))
                        .padding(horizontal = 12.dp, vertical = 8.dp)
                ) {
                    AppText("Mood History", variant = AppTextVariant.Caption)
                }

                AppCard(modifier = Modifier.align(Alignment.BottomStart).width(220.dp)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        AppText("How are you feeling today?", variant = AppTextVariant.Title, bold = true)
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                            MoodBubble("😍", "Amazing")
                            MoodBubble("🙂", "Happy")
                            MoodBubble("😌", "Calm")
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(Spacing.md))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                AppCard(modifier = Modifier.weight(1.15f).height(176.dp)) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Brush.linearGradient(listOf(Color(0xFF3CAB4D), Color(0xFF6ED36B))))
                            .padding(16.dp)
                    ) {
                        Column(modifier = Modifier.align(Alignment.TopStart)) {
                            AppText("Today’s Journey", variant = AppTextVariant.Title, color = Color.White, bold = true)
                            Spacer(modifier = Modifier.height(10.dp))
                            AppText("3", variant = AppTextVariant.Display, color = Color.White, extraBold = true)
                            AppText("Places visited", variant = AppTextVariant.Body, color = Color.White.copy(alpha = 0.92f))
                            Spacer(modifier = Modifier.height(8.dp))
                            AppText("12.4 km", variant = AppTextVariant.Title, color = Color.White, bold = true)
                            AppText("Distance traveled", variant = AppTextVariant.Body, color = Color.White.copy(alpha = 0.92f))
                        }
                        Box(modifier = Modifier.align(Alignment.BottomEnd).size(72.dp).clip(CircleShape).background(Color.White.copy(alpha = 0.16f)), contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.Route, contentDescription = null, tint = Color.White)
                        }
                    }
                }

                AppCard(modifier = Modifier.weight(0.9f).height(176.dp)) {
                    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.SpaceBetween) {
                        Column {
                            AppText("Check-in Streak", variant = AppTextVariant.Title, bold = true)
                            Spacer(modifier = Modifier.height(12.dp))
                            AppText("7", variant = AppTextVariant.Display, extraBold = true)
                            AppText("Days", variant = AppTextVariant.Body, color = AppTheme.colors.textSecondary)
                        }
                        Box(modifier = Modifier.align(Alignment.End).size(68.dp).clip(AppShapes.Large).background(Color(0xFFEAF7E8)), contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.Add, contentDescription = null, tint = AppTheme.colors.primary)
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(Spacing.md))

            AppText("Quick Actions", variant = AppTextVariant.Title, bold = true)
            Spacer(modifier = Modifier.height(12.dp))

            AppCard(modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier.fillMaxWidth().padding(14.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    QuickActionItem(Icons.Default.Place, "Check In")
                    QuickActionItem(Icons.Default.CameraAlt, "Add Photo")
                    QuickActionItem(Icons.Default.Map, "My Trips")
                    QuickActionItem(Icons.Default.Place, "Bucket List")
                    QuickActionItem(Icons.Default.Add, "Stats")
                }
            }

            Spacer(modifier = Modifier.height(Spacing.md))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                AppCard(modifier = Modifier.weight(1f)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            AppText("Recent Trip", variant = AppTextVariant.Title, bold = true)
                            Spacer(modifier = Modifier.weight(1f))
                            AppText("View All", variant = AppTextVariant.Caption, color = AppTheme.colors.textSecondary)
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(modifier = Modifier.size(62.dp).clip(AppShapes.Medium).background(Color(0xFFDDEDD7)), contentAlignment = Alignment.Center) {
                                Icon(Icons.Default.Route, contentDescription = null, tint = AppTheme.colors.primary)
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                AppText("Goa Trip", variant = AppTextVariant.Title, bold = true)
                                AppText("12 - 16 May 2024", variant = AppTextVariant.Body, color = AppTheme.colors.textSecondary)
                                Spacer(modifier = Modifier.height(8.dp))
                                AppChip(text = "Completed")
                            }
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                        AppDivider(alpha = 0.6f)
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
                            Column { AppText("5", variant = AppTextVariant.Title, bold = true); AppText("Places", variant = AppTextVariant.Caption, color = AppTheme.colors.textSecondary) }
                            Column { AppText("32", variant = AppTextVariant.Title, bold = true); AppText("Photos", variant = AppTextVariant.Caption, color = AppTheme.colors.textSecondary) }
                            Column { AppText("12", variant = AppTextVariant.Title, bold = true); AppText("Check-ins", variant = AppTextVariant.Caption, color = AppTheme.colors.textSecondary) }
                        }
                    }
                }

                AppCard(modifier = Modifier.weight(0.9f)) {
                    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.SpaceBetween) {
                        AppText("AI Travel Buddy", variant = AppTextVariant.Title, bold = true)
                        AppText("Mino is here to help you plan better and enjoy more!", variant = AppTextVariant.Body, color = AppTheme.colors.textSecondary)
                        AppPrimaryButton(text = "Chat with Mino", onClick = onPrimaryClick, modifier = Modifier.fillMaxWidth())
                    }
                }
            }

            Spacer(modifier = Modifier.height(Spacing.md))

            AppText("Recent Memories", variant = AppTextVariant.Title, bold = true)
            Spacer(modifier = Modifier.height(12.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                repeat(5) {
                    Box(modifier = Modifier.size(width = 100.dp, height = 120.dp).clip(AppShapes.Medium).background(Brush.linearGradient(listOf(Color(0xFFBEE3F8), Color(0xFF8CC7F2)))))
                }
            }
        }

        BottomBarComponent(
            navController = navController,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(horizontal = 12.dp, vertical = 8.dp),
            onCenterClick = onFabClick
        )
    }
}

@Composable
private fun MoodBubble(
    emoji: String,
    label: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(Color(0xFFF7F7F2)),
            contentAlignment = Alignment.Center
        ) {
            AppText(emoji, variant = AppTextVariant.Title)
        }

        Spacer(modifier = Modifier.height(6.dp))
        AppText(label, variant = AppTextVariant.Caption, color = AppTheme.colors.textSecondary)
    }
}

@Composable
private fun QuickActionItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(54.dp)
                .clip(AppShapes.Medium)
                .background(Color(0xFFF8FBF5)),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = icon, contentDescription = label, tint = AppTheme.colors.primary)
        }

        Spacer(modifier = Modifier.height(8.dp))
        AppText(label, variant = AppTextVariant.Caption, color = AppTheme.colors.textPrimary)
    }
}

