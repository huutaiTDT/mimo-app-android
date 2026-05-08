package huutai.dev.meetmino.component

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PersonOutline
import androidx.compose.material.icons.outlined.Map
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import huutai.dev.meetmino.Screen
import huutai.dev.meetmino.core.design.component.AppCard
import huutai.dev.meetmino.core.design.component.AppFloatingActionButton
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.theme.AppTheme

data class BottomBarItem(
    val route: String,
    val label: String,
    val icon: ImageVector
)

@Composable
fun BottomBarComponent(
    navController: NavController,
    modifier: Modifier = Modifier,
    onCenterClick: () -> Unit = {}
) {

    val items = listOf(
        BottomBarItem("home", "Home", Icons.Default.Home),
        BottomBarItem(Screen.JourneyMap.route, "Journey", Icons.Outlined.Map),
        BottomBarItem("memories", "Memory", Icons.Default.FavoriteBorder),
        BottomBarItem("profile", "Profile", Icons.Default.PersonOutline)
    )

    val currentRoute =
        navController.currentBackStackEntryFlow.collectAsState(
            initial = navController.currentBackStackEntry
        ).value?.destination?.route

    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.BottomCenter
    ) {

        AppCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 6.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                BottomItem(
                    item = items[0],
                    selected = currentRoute == items[0].route
                ) {
                    navController.navigate(items[0].route) {
                        launchSingleTop = true
                    }
                }

                BottomItem(
                    item = items[1],
                    selected = currentRoute == items[1].route
                ) {
                    navController.navigate(items[1].route) {
                        launchSingleTop = true
                    }
                }

                Spacer(modifier = Modifier.width(74.dp))

                BottomItem(
                    item = items[2],
                    selected = currentRoute == items[2].route
                ) {
                    navController.navigate(items[2].route) {
                        launchSingleTop = true
                    }
                }

                BottomItem(
                    item = items[3],
                    selected = currentRoute == items[3].route
                ) {
                    navController.navigate(items[3].route) {
                        launchSingleTop = true
                    }
                }
            }
        }

        val addBob by rememberInfiniteTransition(label = "add-bob").animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 1200, easing = FastOutSlowInEasing),
                repeatMode = RepeatMode.Reverse
            ),
            label = "add-bob-value"
        )

        Box(
            modifier = Modifier
                .offset(y = (-30f + (addBob * 6f)).dp)
                .size(72.dp)
                .scale(1f + (addBob * 0.05f))
        ) {
            AppFloatingActionButton(
                icon = Icons.Default.CameraAlt,
                contentDescription = "Add",
                onClick = onCenterClick,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
private fun BottomItem(
    item: BottomBarItem,
    selected: Boolean,
    onClick: () -> Unit
) {

    val scale by animateFloatAsState(
        targetValue = if (selected) 1.15f else 1f,
        label = ""
    )

    val color = if (selected) AppTheme.colors.primary else AppTheme.colors.textSecondary

    Column(
        modifier = Modifier
            .width(58.dp)
            .padding(top = 6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier.scale(scale),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                onClick = onClick,
                modifier = Modifier.size(38.dp)
            ) {
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.route,
                    tint = color
                )
            }
        }

        AppText(
            text = item.label,
            variant = AppTextVariant.Caption,
            color = color
        )
    }
}