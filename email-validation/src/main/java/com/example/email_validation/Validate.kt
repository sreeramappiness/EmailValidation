package com.example.email_validation

class Validate{
    lateinit var emailPattern: String
    fun validateEmail(email: String): Boolean{
        emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
        return email.trim { it <= ' ' }.matches(emailPattern.toRegex())
    }
}