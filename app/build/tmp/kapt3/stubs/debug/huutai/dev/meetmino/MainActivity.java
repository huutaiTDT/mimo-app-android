package huutai.dev.meetmino;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.SystemBarStyle;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import dagger.hilt.android.AndroidEntryPoint;
import huutai.dev.meetmino.helper.NetworkStateMonitor;
import huutai.dev.meetmino.helper.OnboardingUtils;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0015J\b\u0010\u0012\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lhuutai/dev/meetmino/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "networkMonitor", "Lhuutai/dev/meetmino/helper/NetworkStateMonitor;", "onboardingUtils", "Lhuutai/dev/meetmino/helper/OnboardingUtils;", "getOnboardingUtils", "()Lhuutai/dev/meetmino/helper/OnboardingUtils;", "onboardingUtils$delegate", "Lkotlin/Lazy;", "ShowOnboardingScreen", "", "navController", "Landroidx/navigation/NavHostController;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    private huutai.dev.meetmino.helper.NetworkStateMonitor networkMonitor;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy onboardingUtils$delegate = null;
    
    public MainActivity() {
        super(0);
    }
    
    private final huutai.dev.meetmino.helper.OnboardingUtils getOnboardingUtils() {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalAnimationApi.class})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalAnimationApi.class, androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    private final void ShowOnboardingScreen(androidx.navigation.NavHostController navController, huutai.dev.meetmino.helper.OnboardingUtils onboardingUtils) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}