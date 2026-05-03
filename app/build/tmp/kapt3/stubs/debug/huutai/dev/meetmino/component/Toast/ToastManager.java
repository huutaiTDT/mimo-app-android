package huutai.dev.meetmino.component.Toast;

import androidx.compose.runtime.Composable;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u0011JL\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lhuutai/dev/meetmino/component/Toast/ToastManager;", "", "()V", "_toasts", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lhuutai/dev/meetmino/component/Toast/ToastData;", "dismissJobs", "", "", "Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "toasts", "", "getToasts", "()Ljava/util/List;", "dismissToast", "", "id", "dispose", "showToast", "type", "Lhuutai/dev/meetmino/component/Toast/ToastType;", "title", "", "message", "duration", "showButton", "", "buttonText", "onButtonClick", "Lkotlin/Function0;", "app_debug"})
public final class ToastManager {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.snapshots.SnapshotStateList<huutai.dev.meetmino.component.Toast.ToastData> _toasts = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<huutai.dev.meetmino.component.Toast.ToastData> toasts = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Long, kotlinx.coroutines.Job> dismissJobs = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public ToastManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<huutai.dev.meetmino.component.Toast.ToastData> getToasts() {
        return null;
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.component.Toast.ToastType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, long duration, boolean showButton, @org.jetbrains.annotations.NotNull()
    java.lang.String buttonText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClick) {
    }
    
    public final void dismissToast(long id) {
    }
    
    /**
     * Clean up all resources when ToastManager is no longer needed
     * Call this in your app's cleanup or when the composable is disposed
     */
    public final void dispose() {
    }
}