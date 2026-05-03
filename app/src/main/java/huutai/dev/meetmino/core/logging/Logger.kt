package huutai.dev.meetmino.core.logging

/**
 * Interface for logging abstraction.
 * Allows switching between different logging implementations (Timber, custom, etc.)
 */
interface Logger {
    fun d(tag: String, message: String)
    fun i(tag: String, message: String)
    fun w(tag: String, message: String)
    fun e(tag: String, message: String, throwable: Throwable? = null)
    fun v(tag: String, message: String)

    /**
     * Log a formatted message
     */
    fun log(priority: Int, tag: String, message: String, throwable: Throwable? = null)

    companion object {
        const val VERBOSE = 2
        const val DEBUG = 3
        const val INFO = 4
        const val WARN = 5
        const val ERROR = 6
    }
}
