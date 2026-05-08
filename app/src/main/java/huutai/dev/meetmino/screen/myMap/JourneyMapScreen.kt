package huutai.dev.meetmino.screen.myMap

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Backpack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.MyLocation
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import huutai.dev.meetmino.core.design.theme.AppTheme
import kotlinx.coroutines.delay

@Composable
fun JourneyMapScreen(navController: NavController) {
    val context = LocalContext.current

    var provinces by remember {
        mutableStateOf<List<ProvinceMapItem>>(emptyList())
    }

    var selectedProvince by remember { mutableStateOf<ProvinceMapItem?>(null) }
    var selectedWaypoint by remember { mutableStateOf<Waypoint2?>(null) }

    var isLoaded by remember { mutableStateOf(false) }
    var centerTrigger by remember { mutableStateOf(0) }
    
    LaunchedEffect(Unit) {
        delay(1000L)
        provinces = loadProvinceMaps(context)
        isLoaded = true
    }

    val waypoints = listOf(
        Waypoint2("Hà Nội", 21.0285, 105.8542, "12/04"),
        Waypoint2("Hạ Long", 20.9101, 107.1839, "14/04"),
        Waypoint2("Huế", 16.4671, 107.5903, "16/04"),
        Waypoint2("Đà Nẵng", 16.0544, 108.2022, "18/04"),
        Waypoint2("Nha Trang", 12.2383, 109.1967, "20/04"),
        Waypoint2("TP.HCM", 10.7769, 106.6869, "24/04"),
        Waypoint2("Hoàng Sa", 16.5, 112.0, "Quần đảo"),
        Waypoint2("Trường Sa", 8.5, 111.0, "Quần đảo")
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                // Full-screen background gradient
                val w = size.width
                val h = size.height
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFFF8FBFD), Color(0xFFDFF4FF)),
                        startY = 0f,
                        endY = h
                    ),
                    size = androidx.compose.ui.geometry.Size(w, h)
                )

                // Soft cloud-like blobs
                val blobColor = Color(0xFFFFFFFF).copy(alpha = 0.06f)
                val blobs = listOf(
                    androidx.compose.ui.geometry.Offset(w * 0.2f, h * 0.15f),
                    androidx.compose.ui.geometry.Offset(w * 0.75f, h * 0.12f),
                    androidx.compose.ui.geometry.Offset(w * 0.5f, h * 0.6f),
                    androidx.compose.ui.geometry.Offset(w * 0.25f, h * 0.8f)
                )
                blobs.forEachIndexed { i, center ->
                    drawCircle(
                        color = blobColor,
                        radius = kotlin.math.min(w, h) * (0.18f - i * 0.02f),
                        center = center
                    )
                }

                // Subtle vignette
                drawRect(
                    brush = Brush.radialGradient(
                        colors = listOf(Color.Transparent, Color(0x1A000000)),
                        center = androidx.compose.ui.geometry.Offset(w / 2f, h / 2f),
                        radius = kotlin.math.max(w, h)
                    ),
                    size = androidx.compose.ui.geometry.Size(w, h)
                )
            }
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            ProvinceScreenHeader(
                totalProvinces = provinces.size,
                selectedProvince = selectedProvince
            )



            if (!isLoaded) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 16.dp, vertical = 12.dp), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CircularProgressIndicator()
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Đang tải bản đồ...", style = MaterialTheme.typography.bodyMedium, color = Color(0xFF5F748A))
                    }
                }
            } else {
                    VietnamProvinceCanvasMap(
                        provinces = provinces,
                        waypoints = waypoints,
                        modifier = Modifier.fillMaxSize(),
                        onProvinceSelected = { selectedProvince = it },
                        centerTrigger = centerTrigger,
                        selectedWaypoint = selectedWaypoint
                    )
            }

        }
        Box(modifier = Modifier.align(Alignment.BottomCenter).padding(
            bottom = 30.dp, start = 10.dp, end = 10.dp
        )) {
            JourneyTimeline(
                waypoints = waypoints,
                selectedWaypoint = selectedWaypoint,
                onWaypointSelected = { waypoint ->
                    selectedWaypoint = waypoint
                    // Find matching province by name
                    val matchingProvince = provinces.find { province ->
                        province.name.contains(waypoint.name, ignoreCase = true) ||
                        waypoint.name.contains(province.name, ignoreCase = true)
                    }
                    if (matchingProvince != null) {
                        selectedProvince = matchingProvince
                    }
                    // Focus map on the waypoint
                    centerTrigger++
                }
            )
        }
        // Overlay stats card at left-center of screen
        StatsCard(
            provincesVisited = waypoints.count { it.name != "Hoàng Sa" && it.name != "Trường Sa" },
            totalProvinces = provinces.size,
            landmarksCount = (waypoints.count { it.name != "Hoàng Sa" && it.name != "Trường Sa" } * 3),
            photosCount = (waypoints.count { it.name != "Hoàng Sa" && it.name != "Trường Sa" } * 10),
            totalKm = 1200f,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(start = 12.dp, top = 20.dp)
        )

        FloatingActionButton(
            onClick = { centerTrigger++ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(bottom = 250.dp, end = 20.dp)
                .size(56.dp),
            containerColor = AppTheme.colors.textPrimary,
            contentColor = AppTheme.colors.background
        ) {
            Icon(
                imageVector = Icons.Outlined.MyLocation,
                contentDescription = "Center map",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
private fun StatsCard(
    provincesVisited: Int,
    totalProvinces: Int,
    landmarksCount: Int,
    photosCount: Int,
    totalKm: Float,
    modifier: Modifier = Modifier
) {
    androidx.compose.material3.Surface(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .widthIn(max = 140.dp)
            .background(AppTheme.colors.background.copy(alpha = 0.92f))
            .padding(16.dp),
        color = Color.Transparent
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            // Stats Item 1: Provinces
            StatsItem(
                icon = Icons.Default.LocationOn,
                iconBackgroundColor = Color(0xFFE8F5E9),
                iconTintColor = Color(0xFF4CAF50),
                mainText = "$provincesVisited / $totalProvinces",
                subText = "Tỉnh / Thành"
            )

            // Stats Item 2: Landmarks
            StatsItem(
                icon = Icons.Default.Backpack,
                iconBackgroundColor = Color(0xFFE3F2FD),
                iconTintColor = Color(0xFF2196F3),
                mainText = "$landmarksCount",
                subText = "Địa điểm"
            )

            // Stats Item 3: Attractions
            StatsItem(
                icon = Icons.Default.Star,
                iconBackgroundColor = Color(0xFFFFF9C4),
                iconTintColor = Color(0xFFFBC02D),
                mainText = "128",
                subText = "Địa điểm"
            )

            // Stats Item 4: Photos
            StatsItem(
                icon = Icons.Default.PhotoCamera,
                iconBackgroundColor = Color(0xFFF3E5F5),
                iconTintColor = Color(0xFF9C27B0),
                mainText = "$photosCount",
                subText = "Ảnh & Video"
            )
        }
    }
}

@Composable
private fun StatsItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    iconBackgroundColor: Color,
    iconTintColor: Color,
    mainText: String,
    subText: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        // Icon in circle background
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(iconBackgroundColor, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = subText,
                tint = iconTintColor,
                modifier = Modifier.size(20.dp)
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        // Text content
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = mainText,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color(0xFF1A1A1A)
            )
            Text(
                text = subText,
                style = MaterialTheme.typography.bodySmall,
                fontSize = 12.sp,
                color = Color(0xFF757575)
            )
        }
    }
}

@Composable
private fun ProvinceScreenHeader(
    totalProvinces: Int,
    selectedProvince: ProvinceMapItem?
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Text(
            text = "Khám phá mọi miền đất nước",
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF5F748A)
        )

        Spacer(modifier = Modifier.height(12.dp))

        androidx.compose.foundation.layout.Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Tổng: $totalProvinces tỉnh", style = MaterialTheme.typography.labelMedium, color = Color(0xFF1565C0))
            Text(text = selectedProvince?.name ?: "Chưa chọn tỉnh", style = MaterialTheme.typography.labelMedium, color = Color(0xFF5F748A))
        }
    }
}

@Composable
private fun JourneyTimeline(
    waypoints: List<Waypoint2>,
    selectedWaypoint: Waypoint2? = null,
    onWaypointSelected: (Waypoint2) -> Unit = {}
) {
    val screenWidthDp = LocalConfiguration.current.screenWidthDp
    val compactTimeline = screenWidthDp <= 375
    val itemWidth = if (compactTimeline) 82.dp else 100.dp
    val circleSize = if (compactTimeline) 64.dp else 80.dp
    val iconSize = if (compactTimeline) 32.dp else 40.dp
    val connectorWidth = if (compactTimeline) 16.dp else 24.dp
    val addButtonSize = if (compactTimeline) 64.dp else 80.dp
    val titleFontSize = if (compactTimeline) 12.sp else 13.sp
    val dateFontSize = if (compactTimeline) 10.sp else 11.sp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(AppTheme.colors.background.copy(alpha = 0.85f))
            .padding(horizontal = 0.dp, vertical = 12.dp)
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Hành trình của bạn",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A1A1A)
            )
            Text(
                text = "Xem tất cả >",
                style = MaterialTheme.typography.bodySmall,
                color = Color(0xFF2196F3),
                fontWeight = FontWeight.SemiBold
            )
        }

        // Horizontal scrollable timeline
        val scrollState = rememberScrollState()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            waypoints.forEachIndexed { index, waypoint ->
                val isSelected = selectedWaypoint?.name == waypoint.name
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .width(itemWidth)
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            if (isSelected) Color(0xFFE3F2FD).copy(alpha = 0.6f) else Color.Transparent
                        )
                        .clickable { onWaypointSelected(waypoint) }
                ) {
                    // Timeline item
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.size(circleSize)
                    ) {
                        // Circle background
                        Box(
                            modifier = Modifier
                                .size(circleSize)
                                .background(
                                    color = if (isSelected) Color(0xFF2196F3) else Color(0xFFE3F2FD),
                                    shape = CircleShape
                                )
                        )
                        
                        // Image/Icon placeholder
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = waypoint.name,
                            tint = if (isSelected) Color.White else Color(0xFF2196F3),
                            modifier = Modifier.size(iconSize)
                        )

                        // Checkmark for visited
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .background(Color(0xFF4CAF50), shape = CircleShape)
                                .align(Alignment.BottomEnd),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "Visited",
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Location name
                    Text(
                        text = waypoint.name,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                        fontSize = titleFontSize,
                        color = if (isSelected) Color(0xFF2196F3) else Color(0xFF1A1A1A),
                        maxLines = 1
                    )

                    // Date
                    Text(
                        text = waypoint.date,
                        style = MaterialTheme.typography.labelSmall,
                        fontSize = dateFontSize,
                        color = if (isSelected) Color(0xFF2196F3) else Color(0xFF757575),
                        maxLines = 1
                    )
                }

                // Connecting line (except for last item)
                if (index < waypoints.size - 1) {
                    Box(
                        modifier = Modifier
                            .width(connectorWidth)
                            .height(2.dp)
                            .background(Color(0xFF4CAF50))
                            .align(Alignment.CenterVertically)
                    )
                }
            }

            // Add button
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(addButtonSize)
                    .clip(CircleShape)
                    .background(Color(0xFFF5F5F5))
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add",
                    tint = Color(0xFF9E9E9E),
                    modifier = Modifier.size(if (compactTimeline) 26.dp else 32.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}

