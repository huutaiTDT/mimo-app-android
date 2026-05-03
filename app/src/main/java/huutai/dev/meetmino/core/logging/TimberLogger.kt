package huutai.dev.meetmino.core.logging

import android.util.Log
import timber.log.Timber

/**
 * Timber-based implementation of Logger interface.
 * Handles debug and release logging appropriately.
 */
class TimberLogger : Logger {

    init {
        // Initialize Timber with appropriate trees
        val isDebug = huutai.dev.tracking.BuildConfig.DEBUG
        if (!Timber.forest().isEmpty()) {
            Timber.uproot() // Clear any existing trees
        }
        
        if (isDebug) {
            Timber.plant(DebugTree())
        } else {
            Timber.plant(ReleaseTree())
        }
    }

    override fun d(tag: String, message: String) {
        Timber.tag(tag).d(message)
    }

    override fun i(tag: String, message: String) {
        Timber.tag(tag).i(message)
    }

    override fun w(tag: String, message: String) {
        Timber.tag(tag).w(message)
    }

    override fun e(tag: String, message: String, throwable: Throwable?) {
        if (throwable != null) {
            Timber.tag(tag).e(throwable, message)
        } else {
            Timber.tag(tag).e(message)
        }
    }

    override fun v(tag: String, message: String) {
        Timber.tag(tag).v(message)
    }

    override fun log(priority: Int, tag: String, message: String, throwable: Throwable?) {
        Timber.log(priority, throwable, message, tag)
    }

    /**
     * Debug tree - logs everything with full details
     */
    private class DebugTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            Log.println(priority, tag, message)
            if (t != null) {
                t.printStackTrace()
            }
        }
    }

    /**
     * Release tree - logs only warnings and errors, no stack traces for security
     */
    private class ReleaseTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.WARN || priority == Log.ERROR) {
                Log.println(priority, tag ?: "Release", message)
            }
        }
    }
}
