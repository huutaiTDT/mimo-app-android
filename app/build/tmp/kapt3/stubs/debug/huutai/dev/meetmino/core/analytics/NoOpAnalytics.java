package huutai.dev.meetmino.core.analytics;

/**
 * No-op implementation of Analytics.
 * Used when Firebase Analytics is not available or during testing.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\u001c\u0010\n\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016\u00a8\u0006\u0016"}, d2 = {"Lhuutai/dev/meetmino/core/analytics/NoOpAnalytics;", "Lhuutai/dev/meetmino/core/analytics/Analytics;", "()V", "logEvent", "", "eventName", "", "params", "", "", "logException", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "logScreenView", "screenName", "setUserId", "userId", "setUserProperty", "key", "value", "app_debug"})
public final class NoOpAnalytics implements huutai.dev.meetmino.core.analytics.Analytics {
    
    public NoOpAnalytics() {
        super();
    }
    
    @java.lang.Override()
    public void logScreenView(@org.jetbrains.annotations.NotNull()
    java.lang.String screenName) {
    }
    
    @java.lang.Override()
    public void logEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
    }
    
    @java.lang.Override()
    public void setUserProperty(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public void logException(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}