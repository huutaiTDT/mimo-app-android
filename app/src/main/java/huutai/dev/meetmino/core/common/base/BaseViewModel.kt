package huutai.dev.meetmino.core.common.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow

/**
 * Base class for all ViewModels.
 * Provides common functionality like error handling and event broadcasting.
 */
abstract class BaseViewModel : ViewModel() {

    private val _errorEvent = Channel<String>(Channel.BUFFERED)
    val errorEvent: Flow<String> = _errorEvent.receiveAsFlow()

    /**
     * Emit an error message that will be shown to the user
     */
    protected suspend fun emitError(message: String) {
        _errorEvent.send(message)
    }

    /**
     * Default error message for general exceptions
     */
    protected fun getErrorMessage(exception: Exception): String {
        return exception.message ?: "An unexpected error occurred"
    }
}
