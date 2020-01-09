package com.example.email_validation

class Validate{
    companion object {

        fun validateEmail(email: String): Boolean {
            var emailPattern: String
            emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
            return email.trim { it <= ' ' }.matches(emailPattern.toRegex())
        }

        fun validatePassword(password: String): Boolean {
            var passwordPattern: String
            passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{8,}\$"
            return password.trim { it <= ' ' }.matches(passwordPattern.toRegex())
        }

        fun validateEmailandPassword(email: String, password: String): Boolean {
            var emailPattern: String
            var passwordPattern: String
            emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
            passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{8,}\$"
            return (email.trim { it <= ' ' }.matches(emailPattern.toRegex()) && password.trim { it <= ' ' }.matches(
                passwordPattern.toRegex()
            ))
        }
    }
}