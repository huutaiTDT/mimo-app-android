package huutai.dev.meetmino.component.Toast

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ToastManager {
    private val _toasts = mutableStateListOf<ToastData>()
    val toasts: List<ToastData> = _toasts
    
    // Track dismiss jobs to prevent memory leaks
    private val dismissJobs = mutableMapOf<Long, Job>()
    private val scope = CoroutineScope(Dispatchers.Main)

    fun showToast(
        type: ToastType,
        title: String,
        message: String,
        duration: Long = 3000L,
        showButton: Boolean = false,
        buttonText: String = "Button",
        onButtonClick: () -> Unit = {}
    ) {
        val toast = ToastData(
            id = System.currentTimeMillis(),
            type = type,
            title = title,
            message = message,
            showButton = showButton,
            buttonText = buttonText,
            onButtonClick = onButtonClick
        )
        _toasts.add(toast)

        // Cancel any existing dismiss job for this toast
        dismissJobs[toast.id]?.cancel()

        // Auto dismiss after duration using controlled scope
        dismissJobs[toast.id] = scope.launch {
            delay(duration)
            dismissToast(toast.id)
            dismissJobs.remove(toast.id)
        }
    }

    fun dismissToast(id: Long) {
        dismissJobs[id]?.cancel()
        dismissJobs.remove(id)
        _toasts.removeAll { it.id == id }
    }
    
    /**
     * Clean up all resources when ToastManager is no longer needed
     * Call this in your app's cleanup or when the composable is disposed
     */
    fun dispose() {
        dismissJobs.values.forEach { it.cancel() }
        dismissJobs.clear()
        _toasts.clear()
        scope.cancel()
    }
}

data class ToastData(
    val id: Long,
    val type: ToastType,
    val title: String,
    val message: String,
    val showButton: Boolean = false,
    val buttonText: String = "Button",
    val onButtonClick: () -> Unit = {}
)

@Composable
fun ToastContainer(toastManager: ToastManager) {
    Column {
        toastManager.toasts.forEach { toast ->
            CustomToast(
                type = toast.type,
                title = toast.title,
                message = toast.message,
                showButton = toast.showButton,
                buttonText = toast.buttonText,
                onButtonClick = toast.onButtonClick,
                onDismiss = { toastManager.dismissToast(toast.id) }
            )
        }
    }
}