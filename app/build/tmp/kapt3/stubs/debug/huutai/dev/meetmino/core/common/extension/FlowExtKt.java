package huutai.dev.meetmino.core.common.extension;

import huutai.dev.meetmino.core.common.decorator.Result;
import huutai.dev.meetmino.core.common.decorator.UiState;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00070\u0001\u00a8\u0006\b"}, d2 = {"catchToError", "Lkotlinx/coroutines/flow/Flow;", "Lhuutai/dev/meetmino/core/common/decorator/UiState;", "T", "fallbackMessage", "", "toUiState", "Lhuutai/dev/meetmino/core/common/decorator/Result;", "app_debug"})
public final class FlowExtKt {
    
    /**
     * Convert Flow<Result<T>> to Flow<UiState<T>>
     * Useful for transforming data layer results to presentation layer UI states
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<huutai.dev.meetmino.core.common.decorator.UiState<T>> toUiState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends huutai.dev.meetmino.core.common.decorator.Result<? extends T>> $this$toUiState) {
        return null;
    }
    
    /**
     * Catch exceptions and convert them to UiState.Error
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<huutai.dev.meetmino.core.common.decorator.UiState<T>> catchToError(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends huutai.dev.meetmino.core.common.decorator.UiState<? extends T>> $this$catchToError, @org.jetbrains.annotations.NotNull()
    java.lang.String fallbackMessage) {
        return null;
    }
}