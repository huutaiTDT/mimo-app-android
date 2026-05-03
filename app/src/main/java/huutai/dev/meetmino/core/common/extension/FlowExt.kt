package huutai.dev.meetmino.core.common.extension

import huutai.dev.meetmino.core.common.decorator.Result
import huutai.dev.meetmino.core.common.decorator.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Convert Flow<Result<T>> to Flow<UiState<T>>
 * Useful for transforming data layer results to presentation layer UI states
 */
fun <T> Flow<Result<T>>.toUiState(): Flow<UiState<T>> = map { result ->
    result.fold(
        onSuccess = { UiState.Success(it) },
        onError = { _, msg -> UiState.Error(msg) },
        onLoading = { UiState.Loading }
    )
}

/**
 * Catch exceptions and convert them to UiState.Error
 */
fun <T> Flow<UiState<T>>.catchToError(
    fallbackMessage: String = "An error occurred"
): Flow<UiState<T>> = map { state ->
    state
}.catch { exception ->
    emit(UiState.Error(exception.message ?: fallbackMessage))
}

/**
 * Import for catch extension
 */
import kotlinx.coroutines.flow.catch
