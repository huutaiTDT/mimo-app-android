package huutai.dev.meetmino.screen.myMap

import androidx.compose.ui.geometry.Offset
import com.google.android.gms.maps.model.LatLng
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Simplify polygon using Douglas-Peucker algorithm
 * Giảm số điểm từ 5000+ xuống 300 điểm
 */
object PolygonSimplifier {

    /**
     * Simplify polygon ring với tolerance
     * Default tolerance = 0.0001 lat/lng (tương đương ~10m trên bản đồ)
     */
    fun simplifyRing(
        ring: List<LatLng>,
        tolerance: Double = 0.0001
    ): List<LatLng> {
        if (ring.size <= 2) return ring
        return douglasPeucker(ring, tolerance)
    }

    /**
     * Simplify offset points (screen coordinates)
     */
    fun simplifyOffsets(
        points: List<Offset>,
        tolerance: Float = 1.5f
    ): List<Offset> {
        if (points.size <= 2) return points
        return douglasPeuckerOffsets(points, tolerance)
    }

    /**
     * Douglas-Peucker algorithm cho lat/lng
     */
    private fun douglasPeucker(
        points: List<LatLng>,
        epsilon: Double
    ): List<LatLng> {
        var dmax = 0.0
        var index = 0

        for (i in 1 until points.size - 1) {
            val d = perpendicularDistance(points[i], points[0], points[points.size - 1])
            if (d > dmax) {
                index = i
                dmax = d
            }
        }

        return if (dmax > epsilon) {
            val rec1 = douglasPeucker(points.subList(0, index + 1), epsilon)
            val rec2 = douglasPeucker(points.subList(index, points.size), epsilon)
            rec1.dropLast(1) + rec2
        } else {
            listOf(points[0], points[points.size - 1])
        }
    }

    /**
     * Douglas-Peucker algorithm cho screen coordinates (Offset)
     */
    private fun douglasPeuckerOffsets(
        points: List<Offset>,
        epsilon: Float
    ): List<Offset> {
        var dmax = 0.0f
        var index = 0

        for (i in 1 until points.size - 1) {
            val d = perpendicularDistanceOffsets(points[i], points[0], points[points.size - 1])
            if (d > dmax) {
                index = i
                dmax = d
            }
        }

        return if (dmax > epsilon) {
            val rec1 = douglasPeuckerOffsets(points.subList(0, index + 1), epsilon)
            val rec2 = douglasPeuckerOffsets(points.subList(index, points.size), epsilon)
            rec1.dropLast(1) + rec2
        } else {
            listOf(points[0], points[points.size - 1])
        }
    }

    /**
     * Tính khoảng cách từ điểm đến đường thẳng
     */
    private fun perpendicularDistance(
        point: LatLng,
        lineStart: LatLng,
        lineEnd: LatLng
    ): Double {
        val numerator = abs(
            (lineEnd.latitude - lineStart.latitude) * point.longitude -
            (lineEnd.longitude - lineStart.longitude) * point.latitude +
            lineEnd.longitude * lineStart.latitude -
            lineEnd.latitude * lineStart.longitude
        )

        val denominator = sqrt(
            (lineEnd.latitude - lineStart.latitude).pow(2) +
            (lineEnd.longitude - lineStart.longitude).pow(2)
        )

        return if (denominator == 0.0) 0.0 else numerator / denominator
    }

    /**
     * Tính khoảng cách từ điểm đến đường thẳng (Offset)
     */
    private fun perpendicularDistanceOffsets(
        point: Offset,
        lineStart: Offset,
        lineEnd: Offset
    ): Float {
        val numerator = abs(
            (lineEnd.y - lineStart.y) * point.x -
            (lineEnd.x - lineStart.x) * point.y +
            lineEnd.x * lineStart.y -
            lineEnd.y * lineStart.x
        )

        val denominator = sqrt(
            (lineEnd.y - lineStart.y).pow(2) +
            (lineEnd.x - lineStart.x).pow(2)
        )

        return if (denominator == 0f) 0f else numerator / denominator
    }
}
