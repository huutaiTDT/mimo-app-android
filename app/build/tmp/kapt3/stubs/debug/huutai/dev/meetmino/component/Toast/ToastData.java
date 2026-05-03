package huutai.dev.meetmino.component.Toast;

import androidx.compose.runtime.Composable;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lhuutai/dev/meetmino/component/Toast/ToastData;", "", "id", "", "type", "Lhuutai/dev/meetmino/component/Toast/ToastType;", "title", "", "message", "showButton", "", "buttonText", "onButtonClick", "Lkotlin/Function0;", "", "(JLhuutai/dev/meetmino/component/Toast/ToastType;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getButtonText", "()Ljava/lang/String;", "getId", "()J", "getMessage", "getOnButtonClick", "()Lkotlin/jvm/functions/Function0;", "getShowButton", "()Z", "getTitle", "getType", "()Lhuutai/dev/meetmino/component/Toast/ToastType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class ToastData {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final huutai.dev.meetmino.component.Toast.ToastType type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    private final boolean showButton = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String buttonText = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClick = null;
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.component.Toast.ToastType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.component.Toast.ToastData copy(long id, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.component.Toast.ToastType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showButton, @org.jetbrains.annotations.NotNull()
    java.lang.String buttonText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClick) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    public ToastData(long id, @org.jetbrains.annotations.NotNull()
    huutai.dev.meetmino.component.Toast.ToastType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showButton, @org.jetbrains.annotations.NotNull()
    java.lang.String buttonText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClick) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final huutai.dev.meetmino.component.Toast.ToastType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final boolean getShowButton() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getButtonText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnButtonClick() {
        return null;
    }
}