package huutai.dev.meetmino.core.design.component;

import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import huutai.dev.meetmino.core.design.theme.AppElevation;
import huutai.dev.meetmino.core.design.theme.AppShapes;
import huutai.dev.meetmino.core.design.theme.AppTheme;
import huutai.dev.meetmino.core.design.theme.Spacing;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aZ\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a\\\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007\u00a8\u0006\u0010"}, d2 = {"AppAlertDialog", "", "title", "", "message", "confirmText", "onConfirm", "Lkotlin/Function0;", "dismissText", "onDismiss", "showDialog", "", "AppConfirmDialog", "onCancel", "cancelText", "isDangerous", "app_debug"})
public final class AppDialogKt {
    
    /**
     * App Dialog Component
     * - Rounded corners (24dp)
     * - Soft shadow
     * - Centered, friendly appearance
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void AppAlertDialog(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm, @org.jetbrains.annotations.Nullable()
    java.lang.String dismissText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, boolean showDialog) {
    }
    
    /**
     * Simple Confirmation Dialog
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void AppConfirmDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancel, boolean showDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmText, @org.jetbrains.annotations.NotNull()
    java.lang.String cancelText, boolean isDangerous) {
    }
}