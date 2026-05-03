package huutai.dev.meetmino.core.design.component;

import androidx.compose.material3.FloatingActionButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import huutai.dev.meetmino.core.design.theme.AppElevation;
import huutai.dev.meetmino.core.design.theme.AppTheme;
import huutai.dev.meetmino.core.design.theme.Spacing;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a:\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a2\u0010\u000e\u001a\u00020\u00012\u001e\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00110\u00102\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u0012"}, d2 = {"AppExtendedFloatingActionButton", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "AppFloatingActionButton", "contentDescription", "AppFloatingActionButtonCluster", "items", "", "Lkotlin/Pair;", "app_debug"})
public final class AppFloatingActionButtonKt {
    
    /**
     * App Floating Action Button (FAB)
     * - Green primary color
     * - Soft shadow (8dp)
     * - Smooth transitions
     */
    @androidx.compose.runtime.Composable()
    public static final void AppFloatingActionButton(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull()
    java.lang.String contentDescription, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled) {
    }
    
    /**
     * Extended FAB with label
     */
    @androidx.compose.runtime.Composable()
    public static final void AppExtendedFloatingActionButton(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled) {
    }
    
    /**
     * Floating Action Button Group (bottom-right corner)
     */
    @androidx.compose.runtime.Composable()
    public static final void AppFloatingActionButtonCluster(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<androidx.compose.ui.graphics.vector.ImageVector, ? extends kotlin.jvm.functions.Function0<kotlin.Unit>>> items, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}