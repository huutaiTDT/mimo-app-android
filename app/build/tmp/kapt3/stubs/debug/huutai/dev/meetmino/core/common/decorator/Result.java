package huutai.dev.meetmino.core.common.decorator;

/**
 * Represents the result of an asynchronous operation.
 * Can be in one of three states: Success, Error, or Loading.
 *
 * Usage:
 * ```
 * result.fold(
 *    onSuccess = { data -> / * handle success * / },
 *    onError = { exception, message -> / * handle error * / },
 *    onLoading = { / * handle loading * / }
 * )
 * ```
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0018\u0019\u001aB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003J[\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00050\u00072\u001e\b\u0002\u0010\b\u001a\u0018\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\u00050\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000eH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0000\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00050\u0007\u0082\u0001\u0003\u001b\u001c\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001e"}, d2 = {"Lhuutai/dev/meetmino/core/common/decorator/Result;", "T", "", "()V", "fold", "R", "onSuccess", "Lkotlin/Function1;", "onError", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onLoading", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "()Ljava/lang/Object;", "isError", "", "isLoading", "isSuccess", "map", "transform", "Error", "Loading", "Success", "Lhuutai/dev/meetmino/core/common/decorator/Result$Error;", "Lhuutai/dev/meetmino/core/common/decorator/Result$Loading;", "Lhuutai/dev/meetmino/core/common/decorator/Result$Success;", "app_debug"})
public abstract class Result<T extends java.lang.Object> {
    
    private Result() {
        super();
    }
    
    /**
     * Transform success data to another type
     */
    @org.jetbrains.annotations.NotNull()
    public final <R extends java.lang.Object>huutai.dev.meetmino.core.common.decorator.Result<R> map(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        return null;
    }
    
    /**
     * Get the data or null if not success
     */
    @org.jetbrains.annotations.Nullable()
    public final T getOrNull() {
        return null;
    }
    
    /**
     * Execute different blocks based on result state
     */
    public final <R extends java.lang.Object>R fold(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super java.lang.String, ? extends R> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends R> onLoading) {
        return null;
    }
    
    /**
     * Returns true if result is Success
     */
    public final boolean isSuccess() {
        return false;
    }
    
    /**
     * Returns true if result is Error
     */
    public final boolean isError() {
        return false;
    }
    
    /**
     * Returns true if result is Loading
     */
    public final boolean isLoading() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\r\u0010\r\u001a\u00060\u0004j\u0002`\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0007H\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lhuutai/dev/meetmino/core/common/decorator/Result$Error;", "Lhuutai/dev/meetmino/core/common/decorator/Result;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/Exception;Ljava/lang/String;)V", "getException", "()Ljava/lang/Exception;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error extends huutai.dev.meetmino.core.common.decorator.Result {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final huutai.dev.meetmino.core.common.decorator.Result.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lhuutai/dev/meetmino/core/common/decorator/Result$Loading;", "Lhuutai/dev/meetmino/core/common/decorator/Result;", "", "()V", "app_debug"})
    public static final class Loading extends huutai.dev.meetmino.core.common.decorator.Result {
        @org.jetbrains.annotations.NotNull()
        public static final huutai.dev.meetmino.core.common.decorator.Result.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lhuutai/dev/meetmino/core/common/decorator/Result$Success;", "T", "Lhuutai/dev/meetmino/core/common/decorator/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lhuutai/dev/meetmino/core/common/decorator/Result$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends huutai.dev.meetmino.core.common.decorator.Result<T> {
        private final T data = null;
        
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final huutai.dev.meetmino.core.common.decorator.Result.Success<T> copy(T data) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(T data) {
        }
        
        public final T getData() {
            return null;
        }
    }
}