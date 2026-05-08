package huutai.dev.meetmino.screen.myMap

data class Waypoint(
    val name: String,
    val latitude: Float,
    val longitude: Float,
    val id: Int = 0,
    val date: String,
    val isPassed: Boolean = false
)
