package huutai.dev.meetmino.screen.myMap

import android.content.Context
import com.google.android.gms.maps.model.LatLng
import org.json.JSONArray
import org.json.JSONObject

fun loadProvinceMaps(context: Context): List<ProvinceMapItem> {
    val provinces = mutableListOf<ProvinceMapItem>()

    for (index in 1..96) {
        val fileName = "%02d.json".format(index)
        val json = runCatching { loadAssetText(context, fileName) }.getOrNull() ?: continue
        provinces += parseProvinceJson(json)
    }

    return provinces
}

fun parseProvinceJson(json: String): ProvinceMapItem {
    val obj = JSONObject(json)
    val id = obj.optString("level1_id").ifBlank { "00" }
    val name = obj.optString("name").ifBlank { "Unknown" }
    val coordinates = obj.optJSONArray("coordinates") ?: JSONArray()
    val rings = extractRings(coordinates)
    val bounds = calculateBounds(rings)
    return ProvinceMapItem(
        id = id,
        name = name,
        rings = rings,
        bounds = bounds
    )
}

fun extractRings(node: JSONArray): List<List<LatLng>> {
    if (node.length() == 0) return emptyList()

    val first = node.opt(0) ?: return emptyList()
    if (first !is JSONArray) return emptyList()

    val firstChild = first.opt(0)
    return when {
        firstChild is Number -> listOf(parseRing(node))
        firstChild is JSONArray -> buildList {
            for (i in 0 until node.length()) {
                val child = node.optJSONArray(i) ?: continue
                addAll(extractRings(child))
            }
        }
        else -> emptyList()
    }
}

fun parseRing(coords: JSONArray): List<LatLng> {
    val points = mutableListOf<LatLng>()

    for (index in 0 until coords.length()) {
        val point = coords.getJSONArray(index)
        val lng = point.getDouble(0)
        val lat = point.getDouble(1)
        points.add(LatLng(lat, lng))
    }

    return points
}

fun calculateBounds(rings: List<List<LatLng>>): ProvinceBounds {
    var minLat = Double.POSITIVE_INFINITY
    var maxLat = Double.NEGATIVE_INFINITY
    var minLng = Double.POSITIVE_INFINITY
    var maxLng = Double.NEGATIVE_INFINITY

    rings.flatten().forEach { point ->
        minLat = minOf(minLat, point.latitude)
        maxLat = maxOf(maxLat, point.latitude)
        minLng = minOf(minLng, point.longitude)
        maxLng = maxOf(maxLng, point.longitude)
    }

    if (!minLat.isFinite()) {
        return ProvinceBounds(0.0, 0.0, 0.0, 0.0)
    }

    return ProvinceBounds(minLat, maxLat, minLng, maxLng)
}

fun loadAssetText(context: Context, fileName: String): String {
    return context.assets.open(fileName).bufferedReader().use { it.readText() }
}
