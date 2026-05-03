package huutai.dev.meetmino.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class BottomItem(
    val title: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector,
    val route: String
)

@Composable
fun MeetMinoBottomBar(
    selectedIndex: Int,
    onSelect: (Int) -> Unit,
    navController: NavController
) {

    val items = listOf(
        BottomItem("Home", Icons.Default.Home, "home"),
        BottomItem("Journey", Icons.Default.Map, "journey"),
        BottomItem("Memory", Icons.Default.PhotoLibrary, "memory"),
        BottomItem("Profile", Icons.Default.Person, "profile")
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding(),
        contentAlignment = Alignment.BottomCenter
    ) {

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(88.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            shape = RoundedCornerShape(28.dp),
            color = Color.White,
            shadowElevation = 12.dp
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                BottomBarItem(
                    item = items[0],
                    selected = selectedIndex == 0
                ) {
                    onSelect(0)
                    navController.navigate(items[0].route)
                }

                BottomBarItem(
                    item = items[1],
                    selected = selectedIndex == 1
                ) {
                    onSelect(1)
                    navController.navigate(items[1].route)
                }

                Spacer(modifier = Modifier.width(70.dp))

                BottomBarItem(
                    item = items[2],
                    selected = selectedIndex == 2
                ) {
                    onSelect(2)
                    navController.navigate(items[2].route)
                }

                BottomBarItem(
                    item = items[3],
                    selected = selectedIndex == 3
                ) {
                    onSelect(3)
                    navController.navigate(items[3].route)
                }
            }
        }

        FloatingActionButton(
            onClick = {
                navController.navigate("add")
            },
            modifier = Modifier
                .padding(bottom = 34.dp)
                .size(68.dp),
            containerColor = Color(0xFF2ECC71),
            shape = CircleShape
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(34.dp)
            )
        }
    }
}

@Composable
fun BottomBarItem(
    item: BottomItem,
    selected: Boolean,
    onClick: () -> Unit
) {

    val scale by animateFloatAsState(
        targetValue = if (selected) 1.15f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy
        )
    )

    val color =
        if (selected) Color(0xFF2ECC71)
        else Color(0xFF8A8A8A)

    Box(
        modifier = Modifier
            .scale(scale)
            .padding(vertical = 10.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        ColumnItem(item, color, selected)
    }
}

@Composable
fun ColumnItem(
    item: BottomItem,
    color: Color,
    selected: Boolean
) {
    androidx.compose.foundation.layout.Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = item.icon,
            contentDescription = null,
            tint = color,
            modifier = Modifier.size(24.dp)
        )

        AnimatedVisibility(visible = selected) {
            Text(
                text = item.title,
                color = color,
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}