package huutai.dev.meetmino.core.analytics

/**
 * Interface for analytics abstraction.
 * Allows switching between different analytics providers.
 */
interface Analytics {
    fun logScreenView(screenName: String)
    fun logEvent(eventName: String, params: Map<String, Any>? = null)
    fun setUserProperty(key: String, value: String)
    fun setUserId(userId: String)
    fun logException(exception: Exception, message: String)
}
