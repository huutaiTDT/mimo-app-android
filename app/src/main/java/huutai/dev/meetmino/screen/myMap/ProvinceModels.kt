package huutai.dev.meetmino.screen.myMap

import com.google.android.gms.maps.model.LatLng

data class ProvinceMapItem(
    val id: String,
    val name: String,
    val rings: List<List<LatLng>>,
    val bounds: ProvinceBounds
)

data class ProvinceBounds(
    val minLat: Double,
    val maxLat: Double,
    val minLng: Double,
    val maxLng: Double
) {
    val centerLat: Double = (minLat + maxLat) / 2.0
    val centerLng: Double = (minLng + maxLng) / 2.0
}

data class Waypoint2(
    val name: String,
    val lat: Double,
    val lng: Double,
    val date: String
)
