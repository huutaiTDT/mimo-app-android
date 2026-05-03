package huutai.dev.meetmino.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import kotlinx.coroutines.flow.StateFlow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lhuutai/dev/meetmino/helper/NetworkStateMonitor;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_isConnected", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "isConnected", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "register", "", "unregister", "app_debug"})
public final class NetworkStateMonitor {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isConnected = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isConnected = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.ConnectivityManager connectivityManager = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.ConnectivityManager.NetworkCallback networkCallback = null;
    
    public NetworkStateMonitor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isConnected() {
        return null;
    }
    
    public final void register() {
    }
    
    public final void unregister() {
    }
}