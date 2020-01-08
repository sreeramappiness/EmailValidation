package com.example.email_validation

class Validate{
    lateinit var emailPattern: String
    fun validateEmail(email: String): String{
        emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+"
        return if(email.trim { it <= ' ' }.matches(emailPattern.toRegex())){
            "true"
        }else {
            "false"
        }
    }
}