package huutai.dev.meetmino.core.analytics;

/**
 * Interface for analytics abstraction.
 * Allows switching between different analytics providers.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\n\u0010\t\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H&\u00a8\u0006\u0014"}, d2 = {"Lhuutai/dev/meetmino/core/analytics/Analytics;", "", "logEvent", "", "eventName", "", "params", "", "logException", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "logScreenView", "screenName", "setUserId", "userId", "setUserProperty", "key", "value", "app_debug"})
public abstract interface Analytics {
    
    public abstract void logScreenView(@org.jetbrains.annotations.NotNull()
    java.lang.String screenName);
    
    public abstract void logEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params);
    
    public abstract void setUserProperty(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    public abstract void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    public abstract void logException(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    /**
     * Interface for analytics abstraction.
     * Allows switching between different analytics providers.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}