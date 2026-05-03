package huutai.dev.meetmino.core.design.component;

import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import huutai.dev.meetmino.core.design.theme.AppElevation;
import huutai.dev.meetmino.core.design.theme.AppGradients;
import huutai.dev.meetmino.core.design.theme.AppShapes;
import huutai.dev.meetmino.core.design.theme.AppTheme;
import huutai.dev.meetmino.core.design.theme.Spacing;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a<\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007\u001a2\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a2\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u000e"}, d2 = {"AppErrorButton", "", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "AppPrimaryButton", "isLoading", "AppSecondaryButton", "AppSuccessButton", "app_debug"})
public final class AppButtonKt {
    
    /**
     * Primary CTA Button
     * - Pill-shaped (full rounded)
     * - Green gradient
     * - Soft shadow
     * - Friendly, inviting style
     */
    @androidx.compose.runtime.Composable()
    public static final void AppPrimaryButton(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled, boolean isLoading) {
    }
    
    /**
     * Secondary Button
     * - Outlined style
     * - No gradient
     * - Subtle, friendly
     */
    @androidx.compose.runtime.Composable()
    public static final void AppSecondaryButton(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled) {
    }
    
    /**
     * Success Button (for confirmation, approval)
     */
    @androidx.compose.runtime.Composable()
    public static final void AppSuccessButton(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled) {
    }
    
    /**
     * Error/Danger Button
     */
    @androidx.compose.runtime.Composable()
    public static final void AppErrorButton(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled) {
    }
}