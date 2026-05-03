package huutai.dev.meetmino.core.common.decorator

/**
 * Represents the result of an asynchronous operation.
 * Can be in one of three states: Success, Error, or Loading.
 *
 * Usage:
 * ```
 * result.fold(
 *     onSuccess = { data -> /* handle success */ },
 *     onError = { exception, message -> /* handle error */ },
 *     onLoading = { /* handle loading */ }
 * )
 * ```
 */
sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error(
        val exception: Exception,
        val message: String = exception.message ?: "Unknown error"
    ) : Result<Nothing>()

    object Loading : Result<Nothing>()

    /**
     * Transform success data to another type
     */
    fun <R> map(transform: (T) -> R): Result<R> = when (this) {
        is Success -> Success(transform(data))
        is Error -> this
        is Loading -> Loading
    }

    /**
     * Get the data or null if not success
     */
    fun getOrNull(): T? = (this as? Success)?.data

    /**
     * Execute different blocks based on result state
     */
    inline fun <R> fold(
        onSuccess: (T) -> R,
        onError: (Exception, String) -> R = { _, message -> throw Exception(message) },
        onLoading: () -> R = { throw UnsupportedOperationException("Loading state not handled") }
    ): R = when (this) {
        is Success -> onSuccess(data)
        is Error -> onError(exception, message)
        is Loading -> onLoading()
    }

    /**
     * Returns true if result is Success
     */
    fun isSuccess(): Boolean = this is Success

    /**
     * Returns true if result is Error
     */
    fun isError(): Boolean = this is Error

    /**
     * Returns true if result is Loading
     */
    fun isLoading(): Boolean = this is Loading
}
