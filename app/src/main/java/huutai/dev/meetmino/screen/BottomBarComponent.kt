package huutai.dev.meetmino.component

import androidx.compose.animation.core.animateFloatAsState
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PersonOutline
import androidx.compose.material.icons.outlined.Map
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

data class BottomBarItem(
    val route: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector
)

@Composable
fun BottomBarComponent(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    onCenterClick: () -> Unit = {}
) {

    val items = listOf(
        BottomBarItem("home", Icons.Default.Home),
        BottomBarItem("journey", Icons.Outlined.Map),
        BottomBarItem("memories", Icons.Default.FavoriteBorder),
        BottomBarItem("profile", Icons.Default.PersonOutline)
    )

    val currentRoute =
        navController.currentBackStackEntryFlow.collectAsState(
            initial = navController.currentBackStackEntry
        ).value?.destination?.route

    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.BottomCenter
    ) {

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp),
            shape = RoundedCornerShape(
                topStart = 28.dp,
                topEnd = 28.dp
            ),
            color = Color.White,
            shadowElevation = 16.dp
        ) {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 14.dp),
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

                Spacer(modifier = Modifier.width(72.dp))

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

        IconButton(
            onClick = onCenterClick,
            modifier = Modifier
                .offset(y = (-28).dp)
                .size(74.dp)
                .background(
                    brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                        listOf(
                            Color(0xFF66D63E),
                            Color(0xFF39B81C)
                        )
                    ),
                    shape = CircleShape
                )
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
                tint = Color.White,
                modifier = Modifier.size(34.dp)
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

    val color =
        if (selected) Color(0xFF39B81C)
        else Color(0xFF7A7A7A)

    Column(
        modifier = Modifier
            .width(58.dp)
            .padding(top = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        IconButton(
            onClick = onClick,
            modifier = Modifier.scale(scale)
        ) {
            Icon(
                imageVector = item.icon,
                contentDescription = item.route,
                tint = color
            )
        }

        androidx.compose.material3.Text(
            text = item.route.replaceFirstChar { it.uppercase() },
            style = MaterialTheme.typography.labelSmall,
            color = color
        )
    }
}