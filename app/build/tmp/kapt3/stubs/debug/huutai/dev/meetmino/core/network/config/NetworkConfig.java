package huutai.dev.meetmino.core.network.config;

import huutai.dev.meetmino.BuildConfig;

/**
 * Network configuration with environment-specific settings
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lhuutai/dev/meetmino/core/network/config/NetworkConfig;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "CONNECT_TIMEOUT_SECONDS", "", "DEFAULT_RETRY_ATTEMPTS", "", "READ_TIMEOUT_SECONDS", "RETRY_BACKOFF_MS", "WRITE_TIMEOUT_SECONDS", "app_debug"})
public final class NetworkConfig {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "http://192.168.1.3:3000/";
    public static final long CONNECT_TIMEOUT_SECONDS = 30L;
    public static final long READ_TIMEOUT_SECONDS = 30L;
    public static final long WRITE_TIMEOUT_SECONDS = 30L;
    public static final int DEFAULT_RETRY_ATTEMPTS = 3;
    public static final long RETRY_BACKOFF_MS = 100L;
    @org.jetbrains.annotations.NotNull()
    public static final huutai.dev.meetmino.core.network.config.NetworkConfig INSTANCE = null;
    
    private NetworkConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
}