package huutai.dev.meetmino.core.analytics

/**
 * No-op implementation of Analytics.
 * Used when Firebase Analytics is not available or during testing.
 */
class NoOpAnalytics : Analytics {
    override fun logScreenView(screenName: String) {
        // No-op
    }

    override fun logEvent(eventName: String, params: Map<String, Any>?) {
        // No-op
    }

    override fun setUserProperty(key: String, value: String) {
        // No-op
    }

    override fun setUserId(userId: String) {
        // No-op
    }

    override fun logException(exception: Exception, message: String) {
        // No-op
    }
}
