package huutai.dev.meetmino.core.design.component;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import huutai.dev.meetmino.core.design.theme.AppElevation;
import huutai.dev.meetmino.core.design.theme.AppShapes;
import huutai.dev.meetmino.core.design.theme.AppTheme;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0002\b\bH\u0007\u001a0\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0002\b\bH\u0007\u001a:\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0002\b\bH\u0007\u00a8\u0006\r"}, d2 = {"AppCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AppElevatedCard", "AppGradientCard", "brush", "Landroidx/compose/ui/graphics/Brush;", "app_debug"})
public final class AppCardKt {
    
    /**
     * App Card Component
     * - Rounded corners (24dp)
     * - Soft shadow (4dp)
     * - Padding: 16-20dp
     * - Light border for dark mode
     */
    @androidx.compose.runtime.Composable()
    public static final void AppCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
    
    /**
     * Elevated Card (stronger shadow for depth)
     */
    @androidx.compose.runtime.Composable()
    public static final void AppElevatedCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
    
    /**
     * Gradient Card (accent with gradient background)
     */
    @androidx.compose.runtime.Composable()
    public static final void AppGradientCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.Brush brush, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
}