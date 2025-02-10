package br.diogo.forum.core.valueObjects

import java.util.regex.Pattern

data class Email(val email: String) {
    init {
        require(isValidEmail(email)) { "Invalid e-mail" }
    }

    companion object {
        private val EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
        )

        fun isValidEmail(email: String): Boolean {
            return EMAIL_PATTERN.matcher(email).matches()
        }
    }

    override fun toString(): String {
        return this.email
    }
}
