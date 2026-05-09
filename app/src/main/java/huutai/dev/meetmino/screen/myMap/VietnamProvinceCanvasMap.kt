package huutai.dev.meetmino.screen.myMap

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import kotlinx.coroutines.launch
import kotlin.math.floor
import kotlin.math.min

@Composable
fun VietnamProvinceCanvasMap(
    provinces: List<ProvinceMapItem>,
    waypoints: List<Waypoint2>,
    modifier: Modifier = Modifier,
    onProvinceSelected: (ProvinceMapItem?) -> Unit = {},
    centerTrigger: Int = 0,
    selectedWaypoint: Waypoint2? = null
) {
    var canvasSize by remember { mutableStateOf(androidx.compose.ui.geometry.Size.Zero) }
    var selectedProvinceId by remember { mutableStateOf<String?>(null) }

    val scope = rememberCoroutineScope()
    val scaleAnim = remember { Animatable(1.0f) }
    val panOffsetAnim = remember { Animatable(Offset.Zero, Offset.VectorConverter) }
    val bounds = remember(provinces) {
        calculateGlobalBounds(provinces)
    }

    // Zoom to selected waypoint with 3x zoom and focus on it
    LaunchedEffect(selectedWaypoint) {
        if (selectedWaypoint != null && canvasSize.width > 0f && canvasSize.height > 0f) {
            val targetScale = 3.0f
            // Calculate waypoint screen position
            val waypointOffset = latLngToOffset(
                lat = selectedWaypoint.lat,
                lng = selectedWaypoint.lng,
                width = canvasSize.width,
                height = canvasSize.height,
                bounds = bounds
            )
            // Center the waypoint on screen
            val targetPan = Offset(
                canvasSize.width / 2f - waypointOffset.x * targetScale,
                canvasSize.height / 2f - waypointOffset.y * targetScale
            )

            launch {
                scaleAnim.animateTo(
                    targetValue = targetScale,
                    animationSpec = tween(durationMillis = 600, easing = FastOutSlowInEasing)
                )
            }
            launch {
                panOffsetAnim.animateTo(
                    targetValue = targetPan,
                    animationSpec = tween(durationMillis = 700, easing = FastOutSlowInEasing)
                )
            }
        }
    }

    // Reset to center when centerTrigger changes
    LaunchedEffect(centerTrigger) {
        if (centerTrigger > 0 && canvasSize.width > 0f && canvasSize.height > 0f && selectedWaypoint == null) {
            val targetScale = 1.0f
            val targetPan = Offset(canvasSize.width * (1 - targetScale) / 2f, canvasSize.height * (1 - targetScale) / 2f)

            launch {
                scaleAnim.animateTo(
                    targetValue = targetScale,
                    animationSpec = tween(durationMillis = 500, easing = FastOutSlowInEasing)
                )
            }
            launch {
                panOffsetAnim.animateTo(
                    targetValue = targetPan,
                    animationSpec = tween(durationMillis = 500, easing = FastOutSlowInEasing)
                )
            }
        }
    }

    // Track visited provinces from waypoints
    val visitedWaypointNames = remember(waypoints) {
        waypoints.map { it.name }.filter { it != "Hoàng Sa" && it != "Trường Sa" }.toSet()
    }

    val isProvinceVisited: (ProvinceMapItem) -> Boolean = { province ->
        visitedWaypointNames.any { waypointName ->
            province.name.contains(waypointName, ignoreCase = true) ||
            waypointName.contains(province.name, ignoreCase = true)
        }
    }

    val transformableState = rememberTransformableState { zoomChange, panChange, _ ->
        scope.launch {
            val newScale = (scaleAnim.value * zoomChange).coerceIn(0.5f, 6f)
            scaleAnim.snapTo(newScale)
            panOffsetAnim.snapTo(panOffsetAnim.value + panChange)
        }
    }

    val provinceBounds = remember(provinces) {
        calculateGlobalBounds(provinces)
    }

    val provincePaths = remember(provinces, canvasSize, bounds) {
        if (canvasSize.width <= 0f || canvasSize.height <= 0f) {
            emptyList()
        } else {
            provinces.mapNotNull { province ->
                buildProvinceRenderItem(
                    province = province,
                    canvasSize = canvasSize,
                    bounds = bounds
                )
            }
        }
    }

    val routePoints by remember(waypoints, canvasSize, bounds) {
        derivedStateOf {
            if (canvasSize.width <= 0f || canvasSize.height <= 0f) {
                emptyList()
            } else {
                waypoints.map {
                    latLngToOffset(
                        lat = it.lat,
                        lng = it.lng,
                        width = canvasSize.width,
                        height = canvasSize.height,
                        bounds = bounds
                    )
                }
            }
        }
    }

    val spatialIndex = remember(provincePaths, canvasSize) {
        buildSpatialHashIndex(provincePaths, canvasSize, gridSize = 8)
    }

    // Initialize panOffset so the (possibly scaled) map is centered on screen once size is known.
    LaunchedEffect(canvasSize) {
        if (canvasSize.width > 0f && canvasSize.height > 0f && panOffsetAnim.value == Offset.Zero) {
            panOffsetAnim.snapTo(Offset(canvasSize.width * (1 - scaleAnim.value) / 2f, canvasSize.height * (1 - scaleAnim.value) / 2f))
        }
    }

    val scale = scaleAnim.value
    val panOffset = panOffsetAnim.value

    Box(
        modifier = modifier
            .onSizeChanged { canvasSize = androidx.compose.ui.geometry.Size(it.width.toFloat(), it.height.toFloat()) }
            .transformable(state = transformableState)
            .pointerInput(provincePaths, spatialIndex, scale, panOffset) {
                detectTapGestures { tapPoint ->
                    if (canvasSize.width <= 0f || canvasSize.height <= 0f) return@detectTapGestures

                    // Inverse transform of graphicsLayer (top-left origin): translation + scale.
                    val mappedPoint = Offset(
                        x = (tapPoint.x - panOffset.x) / scale,
                        y = (tapPoint.y - panOffset.y) / scale
                    )

                    val candidates = spatialIndex.findCandidates(mappedPoint)

                    var found: ProvinceRenderItem? = null
                    for (shape in candidates) {
                        if (!shape.bounds.contains(mappedPoint)) continue
                        if (shape.hitRings.any { ring -> pointInPolygon(mappedPoint, ring) }) {
                            found = shape
                            break
                        }
                    }

                    if (found != null) {
                        selectedProvinceId = found.province.id
                        onProvinceSelected(found.province)
                    } else {
                        selectedProvinceId = null
                        onProvinceSelected(null)
                    }
                }
            }
            .graphicsLayer {
                transformOrigin = TransformOrigin(0f, 0f)
                scaleX = scale
                scaleY = scale
                translationX = panOffset.x
                translationY = panOffset.y
            }
            .drawWithCache {
                onDrawBehind {
                    // Background is now drawn at full-screen in JourneyMapScreen, so canvas focuses on map content only
                    
                    // Draw provinces after background
                    provincePaths.forEach { shape ->
                        val isSelected = shape.province.id == selectedProvinceId
                        val visited = isProvinceVisited(shape.province)
                        val isSelectedWaypoint = selectedWaypoint?.name?.let { wpName ->
                            shape.province.name.contains(wpName, ignoreCase = true) ||
                            wpName.contains(shape.province.name, ignoreCase = true)
                        } ?: false

                        shape.paths.forEach { path ->
                            // Color logic: selectedWaypoint > visited > default
                            val (fillColor, strokeColor) = when {
                                isSelectedWaypoint -> Pair(Color(0xFFFF9800), Color(0xFFF57C00)) // Orange for selected waypoint
                                visited -> Pair(Color(0xFF43A047), Color(0xFF2E7D32)) // Green for visited
                                else -> Pair(Color(0xFFBDBDBD), Color(0xFF9E9E9E))
                            }

                            drawPath(
                                path = path,
                                color = fillColor,
                                style = Fill
                            )

                            drawPath(
                                path = path,
                                color = strokeColor,
                                style = Stroke(
                                    width = 1f,
                                    cap = StrokeCap.Round,
                                    join = StrokeJoin.Round
                                )
                            )

                            if (isSelected) {
                                drawPath(
                                    path = path,
                                    color = Color(0x331E88E5)
                                )
                            }
                        }
                    }

                    routePoints.forEachIndexed { index, point ->
                        drawCircle(
                            color = Color.White,
                            radius = 16f,
                            center = point
                        )

                        val waypoint = if (index < waypoints.size) waypoints[index] else null
                        val isSelectedMarker = waypoint?.name == selectedWaypoint?.name
                        val innerColor = when {
                            isSelectedMarker -> Color(0xFFFF9800) // Orange for selected
                            index < waypoints.size && visitedWaypointNames.contains(waypoints[index].name) -> Color(0xFF43A047) // Green for visited
                            else -> Color(0xFF90A4AE) // Gray for unvisited
                        }

                        drawCircle(
                            color = innerColor,
                            radius = 12f,
                            center = point
                        )

                        drawCircle(
                            color = Color.White,
                            radius = 4f,
                            center = point
                        )

                        // Vẽ ghi chú chỉ cho Hoàng Sa và Trường Sa
                        if (index < waypoints.size) {
                            val waypointName = waypoints[index].name
                            if (waypointName == "Hoàng Sa" || waypointName == "Trường Sa") {
                                val waypointDate = waypoints[index].date
                                drawContext.canvas.nativeCanvas.apply {
                                    val paint = android.graphics.Paint().apply {
                                        color = android.graphics.Color.BLACK
                                        textSize = 28f
                                        isAntiAlias = true
                                        typeface = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD)
                                    }
                                    val shadowPaint = android.graphics.Paint().apply {
                                        color = android.graphics.Color.WHITE
                                        textSize = 28f
                                        isAntiAlias = true
                                        typeface = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD)
                                        setShadowLayer(4f, 0f, 0f, android.graphics.Color.argb(128, 0, 0, 0))
                                    }
                                    // Draw shadow/outline first
                                    drawText(waypointName, point.x + 24f, point.y - 12f, shadowPaint)
                                    // Draw text on top
                                    drawText(waypointName, point.x + 24f, point.y - 12f, paint)
                                    // Draw date
                                    drawText(waypointDate, point.x + 24f, point.y + 10f, paint)
                                }
                            }
                        }
                    }
                }
            }
    ) {
        // Tooltip removed for lower allocation and draw overhead.
    }
}

private data class ProvinceRenderItem(
    val province: ProvinceMapItem,
    val paths: List<Path>,
    val hitRings: List<List<Offset>>,
    val bounds: Rect
)

private data class SpatialHashIndex(
    val gridSize: Int,
    val cellWidth: Float,
    val cellHeight: Float,
    val grid: Map<Pair<Int, Int>, List<ProvinceRenderItem>>
) {
    fun findCandidates(point: Offset): List<ProvinceRenderItem> {
        if (cellWidth <= 0f || cellHeight <= 0f) return emptyList()

        val x = floor(point.x / cellWidth).toInt().coerceIn(0, gridSize - 1)
        val y = floor(point.y / cellHeight).toInt().coerceIn(0, gridSize - 1)
        return grid[x to y].orEmpty()
    }
}

// point-in-polygon ray-casting
private fun pointInPolygon(point: Offset, polygon: List<Offset>): Boolean {
    var inside = false
    var j = polygon.size - 1
    for (i in polygon.indices) {
        val xi = polygon[i].x
        val yi = polygon[i].y
        val xj = polygon[j].x
        val yj = polygon[j].y

        val intersect = ((yi > point.y) != (yj > point.y)) &&
                (point.x < (xj - xi) * (point.y - yi) / (yj - yi + 0.0f) + xi)
        if (intersect) inside = !inside
        j = i
    }
    return inside
}

private fun buildProvinceRenderItem(
    province: ProvinceMapItem,
    canvasSize: androidx.compose.ui.geometry.Size,
    bounds: ProvinceBounds
): ProvinceRenderItem? {
    if (canvasSize.width <= 0f || canvasSize.height <= 0f || province.rings.isEmpty()) return null

    val screenRings = province.rings.map { ring ->
        ring.map { point ->
            latLngToOffset(
                lat = point.latitude,
                lng = point.longitude,
                width = canvasSize.width,
                height = canvasSize.height,
                bounds = bounds
            )
        }
    }

    val paths = screenRings.map { ring ->
        Path().apply {
            ring.forEachIndexed { i, p ->
                if (i == 0) moveTo(p.x, p.y) else lineTo(p.x, p.y)
            }
            close()
        }
    }

    // compute bounding rect for quick hit-testing
    var minX = Float.POSITIVE_INFINITY
    var minY = Float.POSITIVE_INFINITY
    var maxX = Float.NEGATIVE_INFINITY
    var maxY = Float.NEGATIVE_INFINITY

    screenRings.flatten().forEach { p ->
        minX = minOf(minX, p.x)
        minY = minOf(minY, p.y)
        maxX = maxOf(maxX, p.x)
        maxY = maxOf(maxY, p.y)
    }

    val boundsRect = if (minX.isFinite()) Rect(minX, minY, maxX, maxY) else Rect(0f, 0f, 0f, 0f)

    return ProvinceRenderItem(
        province = province,
        paths = paths,
        hitRings = screenRings,
        bounds = boundsRect
    )
}

private fun buildSpatialHashIndex(
    provinceItems: List<ProvinceRenderItem>,
    canvasSize: androidx.compose.ui.geometry.Size,
    gridSize: Int
): SpatialHashIndex {
    if (canvasSize.width <= 0f || canvasSize.height <= 0f || gridSize <= 0) {
        return SpatialHashIndex(gridSize = gridSize.coerceAtLeast(1), cellWidth = 0f, cellHeight = 0f, grid = emptyMap())
    }

    val cellWidth = canvasSize.width / gridSize
    val cellHeight = canvasSize.height / gridSize
    val cells = mutableMapOf<Pair<Int, Int>, MutableList<ProvinceRenderItem>>()

    provinceItems.forEach { item ->
        val minCellX = floor(item.bounds.left / cellWidth).toInt().coerceIn(0, gridSize - 1)
        val maxCellX = floor(item.bounds.right / cellWidth).toInt().coerceIn(0, gridSize - 1)
        val minCellY = floor(item.bounds.top / cellHeight).toInt().coerceIn(0, gridSize - 1)
        val maxCellY = floor(item.bounds.bottom / cellHeight).toInt().coerceIn(0, gridSize - 1)

        for (x in minCellX..maxCellX) {
            for (y in minCellY..maxCellY) {
                cells.getOrPut(x to y) { mutableListOf() }.add(item)
            }
        }
    }

    return SpatialHashIndex(
        gridSize = gridSize,
        cellWidth = cellWidth,
        cellHeight = cellHeight,
        grid = cells
    )
}

private fun calculateGlobalBounds(provinces: List<ProvinceMapItem>): ProvinceBounds {
    var minLat = Double.POSITIVE_INFINITY
    var maxLat = Double.NEGATIVE_INFINITY
    var minLng = Double.POSITIVE_INFINITY
    var maxLng = Double.NEGATIVE_INFINITY

    provinces.forEach { province ->
        province.rings.flatten().forEach { point ->
            minLat = minOf(minLat, point.latitude)
            maxLat = maxOf(maxLat, point.latitude)
            minLng = minOf(minLng, point.longitude)
            maxLng = maxOf(maxLng, point.longitude)
        }
    }

    if (!minLat.isFinite()) {
        return ProvinceBounds(8.0, 24.0, 102.0, 110.0)
    }

    val latPadding = (maxLat - minLat) * 0.04
    val lngPadding = (maxLng - minLng) * 0.04
    return ProvinceBounds(
        minLat = minLat - latPadding,
        maxLat = maxLat + latPadding,
        minLng = minLng - lngPadding,
        maxLng = maxLng + lngPadding
    )
}

private fun latLngToOffset(
    lat: Double,
    lng: Double,
    width: Float,
    height: Float,
    bounds: ProvinceBounds
): Offset {
    val lngSpan = bounds.maxLng - bounds.minLng
    val latSpan = bounds.maxLat - bounds.minLat

    if (!lngSpan.isFinite() || !latSpan.isFinite() || lngSpan <= 0.0 || latSpan <= 0.0) {
        return Offset(0f, 0f)
    }

    val widthF = width.toDouble()
    val heightF = height.toDouble()

    val scale = min(widthF / lngSpan, heightF / latSpan)

    val mapWidthPx = (lngSpan * scale).toFloat()
    val mapHeightPx = (latSpan * scale).toFloat()

    val offsetX = ((width - mapWidthPx) / 2f)
    val offsetY = ((height - mapHeightPx) / 2f)

    val x = ((lng - bounds.minLng) * scale).toFloat() + offsetX
    val y = ((bounds.maxLat - lat) * scale).toFloat() + offsetY

    return Offset(x, y)
}
