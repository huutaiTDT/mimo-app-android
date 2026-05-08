package huutai.dev.meetmino.screen.home

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Route
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import huutai.dev.meetmino.R
import huutai.dev.meetmino.core.design.component.AppCard
import huutai.dev.meetmino.core.design.component.AppChip
import huutai.dev.meetmino.core.design.component.AppDivider
import huutai.dev.meetmino.core.design.component.AppText
import huutai.dev.meetmino.core.design.component.AppTextVariant
import huutai.dev.meetmino.core.design.theme.AppShapes
import huutai.dev.meetmino.core.design.theme.AppTheme
import huutai.dev.meetmino.core.design.theme.MeetMinoTheme
import huutai.dev.meetmino.core.design.theme.Spacing
import huutai.dev.meetmino.screen.myMap.JourneyStats
import huutai.dev.meetmino.screen.myMap.Waypoint

data class NearbyLocation(
    val name: String,
    val distance: String,
    val img: Int
)

data class Memory(
    val img: Int,
    val title: String? = null,
    val duration: String? = null
)

@Composable
fun HomeScreen(
    navController : NavController,
    modifier: Modifier = Modifier,
    onFabClick: () -> Unit = {},
    onPrimaryClick: () -> Unit = {}
) {
    val isDrawerOpen = remember { mutableStateOf(false) }
    val currentTab = remember { mutableStateOf(0) } // 0: Home, 1: Journey
    
    val waypoints = listOf(
        Waypoint("Hà Nội", 21.0285f, 105.8542f, R.drawable.ob1, "12/04", true),
        Waypoint("Hạ Long", 20.9101f, 107.1839f, R.drawable.ob2, "14/04", true),
        Waypoint("Huế", 16.4671f, 107.5903f, R.drawable.ob3, "16/04", true),
        Waypoint("Đà Nẵng", 16.0544f, 108.2022f, R.drawable.ob4, "18/04", true),
        Waypoint("Nha Trang", 12.2383f, 109.1967f, R.drawable.ob1, "20/04", true),
        Waypoint("TP. Hồ Chí Minh", 10.7769f, 106.6869f, R.drawable.ob2, "24/04", true)
    )
    
    val journeyStats = JourneyStats(
        provincesVisited = 42,
        totalProvinces = 63,
        landmarksCount = 128,
        photosCount = 362,
        totalKm = 2847.5f
    )
    val nearbyLocations = listOf(
        NearbyLocation("Tháo Cầm Viên", "0.5 km", R.drawable.ob1),
        NearbyLocation("Sài Gòn Zoo", "0.8 km", R.drawable.ob2),
        NearbyLocation("Bitexco Financial", "1.2 km", R.drawable.ob3),
        NearbyLocation("War Remnants Museum", "1.5 km", R.drawable.ob4),
        NearbyLocation("Ben Thanh Market", "2.3 km", R.drawable.ob1)
    )
    
    val recentMemories = listOf(
        Memory(R.drawable.ob1, "Sample", null),
        Memory(R.drawable.ob2, "Coffee", "0:15"),
        Memory(R.drawable.ob3, "Nature", "0:20"),
        Memory(R.drawable.ob4, "View", null),
        Memory(R.drawable.ob1, "Food", null)
    )

    MeetMinoTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppTheme.colors.background)
        ) {
            // Main content column (fixed header + scrollable body)
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                // Scrollable content below header
                val scrollState = rememberScrollState()
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {
                    // Home Header (fixed
                    HomeHeader(
                        onNotificationClick = { },
                        onMenuClick = { isDrawerOpen.value = true }
                    )

                        TrackingMapComponent(
                        modifier = Modifier.fillMaxWidth(),
                        distanceKm = 3.26,
                        duration = "00:45:12",
                        avgSpeed = 28.6,
                        calories = 186,
                        isTracking = false,
                        onStartStop = { },
                        onCameraClick = { },
                        onFabClick = { }
                    )
                AppCard(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
                        Row(modifier = Modifier.fillMaxWidth().padding(14.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                        QuickActionItem(Icons.Default.Place, "Check In")
                        QuickActionItem(Icons.Default.CameraAlt, "Add Photo")
                        QuickActionItem(Icons.Default.Map, "My Trips")
                        QuickActionItem(Icons.Default.Place, "Bucket List")
                        QuickActionItem(Icons.Default.Add, "Stats")
                    }
                }


                    Spacer(modifier = Modifier.height(12.dp))
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    AppCard(modifier = Modifier.weight(1f).padding(horizontal = 10.dp)) {
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
                }

                Spacer(modifier = Modifier.height(Spacing.md))
                    AppText("Địa điểm gần đây", variant = AppTextVariant.Title, bold = true, modifier = Modifier.padding(horizontal = 10.dp))
                    Spacer(modifier = Modifier.height(4.dp))
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.padding(horizontal = 10.dp)
                    ) {
                        items(nearbyLocations) { location ->
                            NearbyLocationCard(location = location)
                        }
                    }

                    Spacer(modifier = Modifier.height(Spacing.md))
                    AppText("Ký ức gần đây", variant = AppTextVariant.Title, bold = true, modifier = Modifier.padding(horizontal = 10.dp))
                    Spacer(modifier = Modifier.height(12.dp))
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.padding(horizontal = 10.dp)
                    ) {
                        items(recentMemories) { memory ->
                            MemoryCard(memory = memory)
                        }
                    }

                    Spacer(modifier = Modifier.height(150.dp))

                }

            }

            // Drawer overlay + animation
            val overlayAlpha by animateFloatAsState(
                targetValue = if (isDrawerOpen.value) 0.3f else 0f,
                animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
                label = "overlay-alpha"
            )

            val drawerOffset by animateDpAsState(
                targetValue = if (isDrawerOpen.value) 0.dp else (-320).dp,
                animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing),
                label = "drawer-offset"
            )

            if (isDrawerOpen.value || overlayAlpha > 0) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = overlayAlpha))
                        .clickable(onClick = { isDrawerOpen.value = false })
                )
            }

            if (isDrawerOpen.value || drawerOffset > (-320).dp) {
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(x = drawerOffset)
                ) {
                    NavigationDrawer(
                        onMenuItemClick = { menuId ->
                            when (menuId) {
                                "profile" -> navController.navigate("profile") { launchSingleTop = true }
                                "trips" -> navController.navigate("journey") { launchSingleTop = true }
                                "favorites" -> { }
                                "saved_places" -> navController.navigate("journey") { launchSingleTop = true }
                                "photos" -> navController.navigate("memories") { launchSingleTop = true }
                                "achievements" -> { }
                                "settings" -> { }
                                "help" -> { }
                                "logout" -> { }
                            }
                        },
                        onClose = { isDrawerOpen.value = false }
                    )
                }
            }
        }
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

@Composable
private fun NearbyLocationCard(
    location: NearbyLocation
) {
    Box(
        modifier = Modifier
            .size(width = 120.dp, height = 140.dp)
            .clip(AppShapes.Medium),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(
            painter = painterResource(id = location.img),
            contentDescription = location.name,
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.7f)
                        )
                    )
                )
                .padding(8.dp)
        ) {
            Column {
                AppText(
                    location.name,
                    variant = AppTextVariant.Caption,
                    color = Color.White,
                    bold = true
                )
                AppText(
                    location.distance,
                    variant = AppTextVariant.Caption,
                    color = Color.White.copy(alpha = 0.8f)
                )
            }
        }
    }
}

@Composable
private fun MemoryCard(
    memory: Memory
) {
    Box(
        modifier = Modifier
            .size(width = 120.dp, height = 140.dp)
            .clip(AppShapes.Medium),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            painter = painterResource(id = memory.img),
            contentDescription = memory.title,
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )

        if (memory.duration != null) {
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .background(
                        Color.Black.copy(alpha = 0.6f),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(horizontal = 6.dp, vertical = 4.dp),
                contentAlignment = Alignment.Center
            ) {
                AppText(
                    "▶ ${memory.duration}",
                    variant = AppTextVariant.Caption,
                    color = Color.White,
                    bold = true
                )
            }
        }
    }
}
