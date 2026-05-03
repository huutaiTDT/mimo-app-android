package huutai.dev.meetmino.core.common.di;

import huutai.dev.meetmino.core.analytics.Analytics;
import huutai.dev.meetmino.core.analytics.NoOpAnalytics;
import huutai.dev.meetmino.core.logging.Logger;
import huutai.dev.meetmino.core.logging.TimberLogger;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

/**
 * Hilt module for providing core dependencies (Logger, Analytics, etc.)
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lhuutai/dev/meetmino/core/common/di/CoreModule;", "", "()V", "provideAnalytics", "Lhuutai/dev/meetmino/core/analytics/Analytics;", "provideLogger", "Lhuutai/dev/meetmino/core/logging/Logger;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class CoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final huutai.dev.meetmino.core.common.di.CoreModule INSTANCE = null;
    
    private CoreModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.core.logging.Logger provideLogger() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.core.analytics.Analytics provideAnalytics() {
        return null;
    }
}