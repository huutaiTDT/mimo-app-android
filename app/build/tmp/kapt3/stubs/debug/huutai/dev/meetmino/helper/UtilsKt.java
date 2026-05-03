package huutai.dev.meetmino.helper;

import android.content.Context;
import androidx.compose.animation.core.Easing;
import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n\u001a\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n\u001a\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\nH\u0003\u001a\b\u0010\u0015\u001a\u00020\u0002H\u0007\u001a\b\u0010\u0016\u001a\u00020\u0002H\u0007\u001a\b\u0010\u0017\u001a\u00020\u0018H\u0007\u001a\b\u0010\u0019\u001a\u00020\u0002H\u0007\u001a\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n\u001a\n\u0010\u001d\u001a\u00020\n*\u00020\f\u001a\u0011\u0010\u001e\u001a\u00020\u0001*\u00020\u0002H\u0007\u00a2\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0003\u00a2\u0006\u0002\u0010!\u001a\u0015\u0010\"\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020%H\u0086\u0002\u001a\u000f\u0010&\u001a\u00020\u0001*\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u001a\u000f\u0010\'\u001a\u00020\u0006*\u00020\u0002\u00a2\u0006\u0002\u0010\b\u001a\"\u0010(\u001a\u00020%*\u00020)2\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020%2\u0006\u0010$\u001a\u00020%\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006,"}, d2 = {"sdp", "Landroidx/compose/ui/unit/Dp;", "", "getSdp", "(I)F", "textSdp", "Landroidx/compose/ui/unit/TextUnit;", "getTextSdp", "(I)J", "formatDate", "", "date", "Ljava/util/Date;", "formatPrice", "price", "currency", "getFeatureIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "feature", "getFieldId", "id", "getScreenDensity", "getScreenHeight", "getScreenSizeType", "Lhuutai/dev/meetmino/helper/ScreenSizeType;", "getScreenWidth", "isValidEmail", "", "email", "getTimeAgo", "sdpGet", "density", "Landroidx/compose/ui/unit/Density;", "(ILandroidx/compose/ui/unit/Density;)J", "times", "Landroidx/compose/foundation/layout/PaddingValues;", "value", "", "toSdp", "toSsp", "transform", "Landroidx/compose/animation/core/Easing;", "from", "to", "app_debug"})
public final class UtilsKt {
    
    public static final float transform(@org.jetbrains.annotations.NotNull()
    androidx.compose.animation.core.Easing $this$transform, float from, float to, float value) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.foundation.layout.PaddingValues times(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues $this$times, float value) {
        return null;
    }
    
    public static final float toSdp(int $this$toSdp) {
        return 0.0F;
    }
    
    public static final long toSsp(int $this$toSsp) {
        return 0L;
    }
    
    @androidx.compose.runtime.Composable()
    public static final float sdpGet(int $this$sdpGet) {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable()
    private static final int getFieldId(java.lang.String id) {
        return 0;
    }
    
    @androidx.compose.runtime.Composable()
    public static final float getSdp(int $this$sdp) {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable()
    private static final long textSdp(int $this$textSdp, androidx.compose.ui.unit.Density density) {
        return 0L;
    }
    
    @androidx.compose.runtime.Composable()
    public static final long getTextSdp(int $this$textSdp) {
        return 0L;
    }
    
    @androidx.compose.runtime.Composable()
    public static final int getScreenHeight() {
        return 0;
    }
    
    @androidx.compose.runtime.Composable()
    public static final int getScreenWidth() {
        return 0;
    }
    
    @androidx.compose.runtime.Composable()
    public static final int getScreenDensity() {
        return 0;
    }
    
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public static final huutai.dev.meetmino.helper.ScreenSizeType getScreenSizeType() {
        return null;
    }
    
    public static final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTimeAgo(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$getTimeAgo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.graphics.vector.ImageVector getFeatureIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String feature) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDate(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return null;
    }
}