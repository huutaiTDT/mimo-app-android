package huutai.dev.meetmino
import android.app.Application
import androidx.camera.camera2.Camera2Config
import androidx.camera.core.CameraXConfig
import dagger.hilt.android.HiltAndroidApp
import huutai.dev.meetmino.core.logging.Logger
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application(), CameraXConfig.Provider {

    @Inject
    lateinit var logger: Logger

    override fun onCreate() {
        super.onCreate()
        
        // Initialize Timber logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        
        logger.d("MyApplication", "App initialized - ${BuildConfig.BUILD_TYPE} build")
        logger.i("MyApplication", "Base URL: ${BuildConfig.BASE_URL}")
    }

    override fun getCameraXConfig(): CameraXConfig {
        return CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig())
            .build()
    }
}

