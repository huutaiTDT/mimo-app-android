package huutai.dev.meetmino.helper;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import huutai.dev.meetmino.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012\u00a8\u0006\u0015"}, d2 = {"Lhuutai/dev/meetmino/helper/ScreenTransitionHelper;", "", "()V", "finishActivityWithAnimation", "", "activity", "Landroid/app/Activity;", "finishActivityWithAnimationLeftToRight", "finishActivityWithAnimationRightToLeft", "replaceFragmentWithAnimation", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "startActivityWithAnimationBottomToTop", "currentActivity", "targetActivity", "Ljava/lang/Class;", "startActivityWithAnimationLeftToRight", "startActivityWithAnimationRightToLeft", "app_debug"})
public final class ScreenTransitionHelper {
    @org.jetbrains.annotations.NotNull()
    public static final huutai.dev.meetmino.helper.ScreenTransitionHelper INSTANCE = null;
    
    private ScreenTransitionHelper() {
        super();
    }
    
    public final void startActivityWithAnimationBottomToTop(@org.jetbrains.annotations.NotNull()
    android.app.Activity currentActivity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> targetActivity) {
    }
    
    public final void startActivityWithAnimationRightToLeft(@org.jetbrains.annotations.NotNull()
    android.app.Activity currentActivity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> targetActivity) {
    }
    
    public final void startActivityWithAnimationLeftToRight(@org.jetbrains.annotations.NotNull()
    android.app.Activity currentActivity, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> targetActivity) {
    }
    
    public final void finishActivityWithAnimationRightToLeft(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void finishActivityWithAnimationLeftToRight(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void finishActivityWithAnimation(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void replaceFragmentWithAnimation(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int containerId) {
    }
}