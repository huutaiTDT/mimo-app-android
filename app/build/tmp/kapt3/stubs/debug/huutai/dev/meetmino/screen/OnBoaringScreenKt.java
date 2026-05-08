package huutai.dev.meetmino.screen;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.ContentScale;
import huutai.dev.meetmino.R;
import huutai.dev.meetmino.core.design.component.AppTextVariant;
import huutai.dev.meetmino.core.design.theme.AppTheme;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\"\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003\u001a\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015\u00a8\u0006\u0016"}, d2 = {"BottomCTA", "", "isLast", "", "onNext", "Lkotlin/Function0;", "onFinish", "modifier", "Landroidx/compose/ui/Modifier;", "OnboardingPage", "item", "Lhuutai/dev/meetmino/screen/OnboardingPageData;", "pageOffset", "", "OnboardingScreen", "onFinishOnboarding", "OnboardingTopBar", "pageCount", "", "currentPage", "onboardingData", "", "app_debug"})
public final class OnBoaringScreenKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<huutai.dev.meetmino.screen.OnboardingPageData> onboardingData() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void OnboardingScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinishOnboarding) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void OnboardingPage(@org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.screen.OnboardingPageData item, float pageOffset) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void OnboardingTopBar(int pageCount, int currentPage, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BottomCTA(boolean isLast, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinish, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}