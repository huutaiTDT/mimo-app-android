package huutai.dev.meetmino.core.common.extension

import android.util.Patterns

/**
 * Check if string is a valid email
 */
fun String.isValidEmail(): Boolean {
    return this.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

/**
 * Check if string is a valid phone number (basic validation)
 */
fun String.isValidPhone(): Boolean {
    return this.isNotEmpty() && this.length >= 10 && this.all { it.isDigit() }
}

/**
 * Check if string is a valid URL
 */
fun String.isValidUrl(): Boolean {
    return this.isNotEmpty() && Patterns.WEB_URL.matcher(this).matches()
}

/**
 * Get domain from URL
 */
fun String.getDomain(): String? {
    return try {
        val url = java.net.URL(this)
        url.host
    } catch (e: Exception) {
        null
    }
}

/**
 * Truncate string to max length with ellipsis
 */
fun String.truncate(maxLength: Int, suffix: String = "..."): String {
    return if (this.length > maxLength) {
        this.take(maxLength - suffix.length) + suffix
    } else {
        this
    }
}
