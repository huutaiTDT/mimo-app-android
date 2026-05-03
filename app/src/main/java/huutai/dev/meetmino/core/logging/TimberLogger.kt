package huutai.dev.meetmino.core.logging

import android.util.Log
import huutai.dev.meetmino.BuildConfig
import timber.log.Timber

/**
 * Timber-based implementation of Logger interface
 */
class TimberLogger : Logger {

    init {
        val isDebug = BuildConfig.DEBUG

        // Remove all planted trees first
        Timber.uprootAll()

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

    override fun e(
        tag: String,
        message: String,
        throwable: Throwable?
    ) {
        if (throwable != null) {
            Timber.tag(tag).e(throwable, message)
        } else {
            Timber.tag(tag).e(message)
        }
    }

    override fun v(tag: String, message: String) {
        Timber.tag(tag).v(message)
    }

    override fun log(
        priority: Int,
        tag: String,
        message: String,
        throwable: Throwable?
    ) {
        Timber.tag(tag)

        if (throwable != null) {
            Timber.log(priority, throwable, message)
        } else {
            Timber.log(priority, message)
        }
    }

    /**
     * Debug tree
     */
    private class DebugTree : Timber.Tree() {
        override fun log(
            priority: Int,
            tag: String?,
            message: String,
            t: Throwable?
        ) {
            Log.println(priority, tag ?: "Debug", message)

            t?.printStackTrace()
        }
    }

    /**
     * Release tree
     */
    private class ReleaseTree : Timber.Tree() {
        override fun log(
            priority: Int,
            tag: String?,
            message: String,
            t: Throwable?
        ) {
            if (priority >= Log.WARN) {
                Log.println(
                    priority,
                    tag ?: "Release",
                    message
                )
            }
        }
    }
}