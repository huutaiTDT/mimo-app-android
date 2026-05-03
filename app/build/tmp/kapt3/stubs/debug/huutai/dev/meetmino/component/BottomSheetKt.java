package huutai.dev.meetmino.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\b\f\u00a2\u0006\u0002\b\rH\u0007\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"CustomBottomSheet", "", "isVisible", "", "onDismiss", "Lkotlin/Function0;", "title", "", "showCloseButton", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "rememberBottomSheetController", "Lhuutai/dev/meetmino/component/BottomSheetController;", "app_debug"})
public final class BottomSheetKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void CustomBottomSheet(boolean isVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.Nullable()
    java.lang.String title, boolean showCloseButton, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
    
    /**
     * A composable function that provides a controller for the bottom sheet.
     *
     * @return A BottomSheetController that can be used to show and hide the bottom sheet
     */
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public static final huutai.dev.meetmino.component.BottomSheetController rememberBottomSheetController() {
        return null;
    }
}