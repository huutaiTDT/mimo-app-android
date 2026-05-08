package huutai.dev.meetmino.screen.home

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.JointType
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.RoundCap
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState

/**
 * Real Google Map composable with route and markers similar to the mockup.
 */
@Composable
fun MapComposable(
    modifier: Modifier = Modifier,
    height: Dp = 380.dp
) {
    val routePoints = remember {
        listOf(
            LatLng(10.7768, 106.7009),
            LatLng(10.7776, 106.7051)
        )
    }

    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(LatLng(10.7795, 106.7125), 13.5f)
    }

    // Keep style simple and bright to resemble the provided visual.
    val mapStyleJson = """
        [
          {"featureType":"poi","stylers":[{"visibility":"off"}]},
          {"featureType":"transit","stylers":[{"visibility":"off"}]},
          {"featureType":"road","elementType":"labels.icon","stylers":[{"visibility":"off"}]},
          {"featureType":"administrative","elementType":"labels.text.fill","stylers":[{"color":"#7a8a9a"}]},
          {"featureType":"water","elementType":"geometry","stylers":[{"color":"#d6f0ff"}]}
        ]
    """.trimIndent()

    GoogleMap(
        modifier = modifier.height(height),
        cameraPositionState = cameraPositionState,
        properties = MapProperties(
            isMyLocationEnabled = false,
            mapStyleOptions = MapStyleOptions(mapStyleJson)
        ),
        uiSettings = MapUiSettings(
            mapToolbarEnabled = false,
            zoomControlsEnabled = false,
            compassEnabled = false,
            myLocationButtonEnabled = false,
            indoorLevelPickerEnabled = false
        ),
        onMapLoaded = {
            val boundsBuilder = com.google.android.gms.maps.model.LatLngBounds.builder()
            routePoints.forEach(boundsBuilder::include)
            val bounds = boundsBuilder.build()
            cameraPositionState.move(CameraUpdateFactory.newLatLngBounds(bounds, 120))
        }
    ) {
        Polyline(
            points = routePoints,
            color = Color(0xFF4DA6FF),
            width = 16f,
            geodesic = true,
            startCap = RoundCap(),
            endCap = RoundCap(),
            jointType = JointType.ROUND
        )

        routePoints.forEachIndexed { index, point ->
            Marker(
                state = MarkerState(point),
                title = when (index) {
                    0 -> "Start"
                    routePoints.lastIndex -> "Destination"
                    else -> "Waypoint"
                },
                icon = BitmapDescriptorFactory.defaultMarker(
                    when (index) {
                        0 -> BitmapDescriptorFactory.HUE_GREEN
                        routePoints.lastIndex -> BitmapDescriptorFactory.HUE_ORANGE
                        else -> BitmapDescriptorFactory.HUE_AZURE
                    }
                )
            )
        }
    }
}
