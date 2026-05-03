package huutai.dev.meetmino.core.common.decorator

/**
 * Base sealed class for UI state management.
 * Represents different states that a UI can be in.
 */
sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Success<T>(val data: T) : UiState<T>()
    data class Error(val message: String) : UiState<Nothing>()

    fun <R> map(transform: (T) -> R): UiState<R> = when (this) {
        is Success -> Success(transform(data))
        is Error -> this
        is Loading -> Loading
    }

    fun getOrNull(): T? = (this as? Success)?.data

    fun isLoading(): Boolean = this is Loading
    fun isSuccess(): Boolean = this is Success
    fun isError(): Boolean = this is Error
}
