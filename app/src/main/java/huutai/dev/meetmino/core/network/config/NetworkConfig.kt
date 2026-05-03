package huutai.dev.meetmino.core.network.config

import huutai.dev.meetmino.BuildConfig

/**
 * Network configuration with environment-specific settings
 */
object NetworkConfig {
    val BASE_URL: String = BuildConfig.BASE_URL
    const val CONNECT_TIMEOUT_SECONDS = 30L
    const val READ_TIMEOUT_SECONDS = 30L
    const val WRITE_TIMEOUT_SECONDS = 30L
    const val DEFAULT_RETRY_ATTEMPTS = 3
    const val RETRY_BACKOFF_MS = 100L
}
