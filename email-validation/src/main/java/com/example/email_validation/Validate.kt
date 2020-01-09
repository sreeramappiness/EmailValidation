package com.example.email_validation

class Validate{
    lateinit var emailPattern: String
    fun validateEmail(email: String): Boolean{
        emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
        return email.trim { it <= ' ' }.matches(emailPattern.toRegex())
    }

    lateinit var passwordPattern: String
    fun validatePassword(password: String): Boolean{
        passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{8,}\$"
        return password.trim { it <= ' ' }.matches(passwordPattern.toRegex())
    }

    fun validateEmailandPassword(email: String, password: String):Boolean{
        return (email.trim { it <= ' ' }.matches(emailPattern.toRegex()) && password.trim { it <= ' ' }.matches(passwordPattern.toRegex()))
    }
}