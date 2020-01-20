package com.example.email_validation

class Validate{
    companion object {
        fun validateEmail(email: String): Boolean {
            var emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
            return email.trim { it <= ' ' }.matches(emailPattern.toRegex())
        }

        fun validatePassword(password: String): Boolean {
            var passwordPattern =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{8,}\$"
            return password.trim { it <= ' ' }.matches(passwordPattern.toRegex())
        }

        fun validateEmailandPassword(email: String, password: String): Boolean {
            var emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
            var passwordPattern =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{8,}\$"
            return (email.trim { it <= ' ' }.matches(emailPattern.toRegex()) && password.trim { it <= ' ' }.matches(
                passwordPattern.toRegex()
            ))
        }

        fun validatePhoneNumberIN(phoneNumber: String): Boolean {
            var phoneNumberPattern = "^[6-9]\\d{9}\$"
            return (phoneNumber.trim { it <= ' ' }.matches(phoneNumberPattern.toRegex()))
        }

        fun validatePhoneNumberUS(phoneNumber: String): Boolean {
            var phoneNumberPatternUS = "^(\\([0-9]{3}\\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}\$"
            return (phoneNumber.trim { it <= ' ' }.matches(phoneNumberPatternUS.toRegex()))
        }

        fun validateFullName(fullName: String): Boolean {
            var fullNamePatter = "^[\\p{L} .'-]+$"
            return (fullName.trim { it <= ' ' }.matches(fullNamePatter.toRegex()))
        }
    }
}
