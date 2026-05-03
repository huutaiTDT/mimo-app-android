package huutai.dev.meetmino;

import android.app.Application;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraXConfig;
import dagger.hilt.android.HiltAndroidApp;
import huutai.dev.meetmino.core.logging.Logger;
import timber.log.Timber;
import javax.inject.Inject;

@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lhuutai/dev/meetmino/MyApplication;", "Landroid/app/Application;", "Landroidx/camera/core/CameraXConfig$Provider;", "()V", "logger", "Lhuutai/dev/meetmino/core/logging/Logger;", "getLogger", "()Lhuutai/dev/meetmino/core/logging/Logger;", "setLogger", "(Lhuutai/dev/meetmino/core/logging/Logger;)V", "getCameraXConfig", "Landroidx/camera/core/CameraXConfig;", "onCreate", "", "app_debug"})
public final class MyApplication extends android.app.Application implements androidx.camera.core.CameraXConfig.Provider {
    @javax.inject.Inject()
    public huutai.dev.meetmino.core.logging.Logger logger;
    
    public MyApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.core.logging.Logger getLogger() {
        return null;
    }
    
    public final void setLogger(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.core.logging.Logger p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.camera.core.CameraXConfig getCameraXConfig() {
        return null;
    }
}