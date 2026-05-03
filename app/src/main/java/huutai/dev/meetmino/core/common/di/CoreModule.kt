package huutai.dev.meetmino.core.common.di

import huutai.dev.meetmino.core.analytics.Analytics
import huutai.dev.meetmino.core.analytics.NoOpAnalytics
import huutai.dev.meetmino.core.logging.Logger
import huutai.dev.meetmino.core.logging.TimberLogger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hilt module for providing core dependencies (Logger, Analytics, etc.)
 */
@Module
@InstallIn(SingletonComponent::class)
object CoreModule {

    @Singleton
    @Provides
    fun provideLogger(): Logger = TimberLogger()

    @Singleton
    @Provides
    fun provideAnalytics(): Analytics = NoOpAnalytics()
    // TODO: Replace NoOpAnalytics with FirebaseAnalyticsImpl after Firebase setup
}
