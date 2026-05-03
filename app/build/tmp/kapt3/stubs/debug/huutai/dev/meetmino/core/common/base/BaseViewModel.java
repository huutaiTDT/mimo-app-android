package huutai.dev.meetmino.core.common.base;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.Flow;

/**
 * Base class for all ViewModels.
 * Provides common functionality like error handling and event broadcasting.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0084@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00052\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lhuutai/dev/meetmino/core/common/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_errorEvent", "Lkotlinx/coroutines/channels/Channel;", "", "errorEvent", "Lkotlinx/coroutines/flow/Flow;", "getErrorEvent", "()Lkotlinx/coroutines/flow/Flow;", "emitError", "", "message", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getErrorMessage", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<java.lang.String> _errorEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> errorEvent = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getErrorEvent() {
        return null;
    }
    
    /**
     * Emit an error message that will be shown to the user
     */
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Object emitError(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Default error message for general exceptions
     */
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
        return null;
    }
}