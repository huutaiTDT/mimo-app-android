package huutai.dev.meetmino.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Train
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import huutai.dev.meetmino.R
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.theme.AppTheme

data class DrawerMenuItem(
    val id: String,
    val label: String,
    val icon: ImageVector,
    val onClick: () -> Unit
)

@Composable
fun NavigationDrawer(
    modifier: Modifier = Modifier,
    onMenuItemClick: (String) -> Unit = {},
    onClose: () -> Unit = {}
) {
    val menuItems = listOf(
        DrawerMenuItem("profile", "My Profile", Icons.Default.AccountCircle) { onMenuItemClick("profile") },
        DrawerMenuItem("trips", "My Trips", Icons.Default.Train) { onMenuItemClick("trips") },
        DrawerMenuItem("favorites", "Favorites", Icons.Default.FavoriteBorder) { onMenuItemClick("favorites") },
        DrawerMenuItem("saved_places", "Saved Places", Icons.Default.Map) { onMenuItemClick("saved_places") },
        DrawerMenuItem("photos", "My Photos", Icons.Default.CameraAlt) { onMenuItemClick("photos") },
        DrawerMenuItem("achievements", "Achievements", Icons.Default.Star) { onMenuItemClick("achievements") },
    )

    Column(
        modifier = modifier
            .fillMaxHeight()
            .width(280.dp)
            .background(AppTheme.colors.surface)
            .verticalScroll(rememberScrollState())
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ob1),
                contentDescription = "Profile Background",
                modifier = Modifier.matchParentSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(
                        androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                androidx.compose.ui.graphics.Color.Black.copy(alpha = 0.2f),
                                androidx.compose.ui.graphics.Color.Black.copy(alpha = 0.5f)
                            )
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(
                            AppTheme.colors.primaryVariant.copy(alpha = 0.3f)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Default.AccountCircle,
                        contentDescription = "Profile",
                        tint = androidx.compose.ui.graphics.Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                AppText(
                    "Shubham",
                    variant = AppTextVariant.Title,
                    color = androidx.compose.ui.graphics.Color.White,
                    bold = true
                )
                AppText(
                    "shubham@example.com",
                    variant = AppTextVariant.Body,
                    color = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.8f)
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Menu Items
        Column(modifier = Modifier.padding(horizontal = 8.dp)) {
            menuItems.forEach { item ->
                DrawerMenuItemComponent(
                    item = item,
                    onClick = {
                        item.onClick()
                        onClose()
                    }
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                color = AppTheme.colors.border.copy(alpha = 0.3f)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Settings
            DrawerMenuItemComponent(
                item = DrawerMenuItem(
                    "settings",
                    "Settings",
                    Icons.Default.Settings
                ) { onMenuItemClick("settings") },
                onClick = {
                    onMenuItemClick("settings")
                    onClose()
                }
            )

            // Help
            DrawerMenuItemComponent(
                item = DrawerMenuItem(
                    "help",
                    "Help & Support",
                    Icons.Default.HelpOutline
                ) { onMenuItemClick("help") },
                onClick = {
                    onMenuItemClick("help")
                    onClose()
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                color = AppTheme.colors.border.copy(alpha = 0.3f)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Logout
            DrawerMenuItemComponent(
                item = DrawerMenuItem(
                    "logout",
                    "Logout",
                    Icons.Default.Logout
                ) { onMenuItemClick("logout") },
                onClick = {
                    onMenuItemClick("logout")
                    onClose()
                },
                isDestructive = true
            )

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun DrawerMenuItemComponent(
    item: DrawerMenuItem,
    onClick: () -> Unit,
    isDestructive: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = item.label,
            tint = if (isDestructive) androidx.compose.ui.graphics.Color(0xFFFF6B6B) else AppTheme.colors.primary,
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        AppText(
            item.label,
            variant = AppTextVariant.Body,
            color = if (isDestructive) androidx.compose.ui.graphics.Color(0xFFFF6B6B) else AppTheme.colors.textPrimary
        )
    }
}
