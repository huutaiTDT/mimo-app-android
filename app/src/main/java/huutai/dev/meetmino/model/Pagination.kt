package huutai.dev.meetmino.model

data class Pagination<T>(
    val skip: Int,
    val take: Int,
    val where: T
)
