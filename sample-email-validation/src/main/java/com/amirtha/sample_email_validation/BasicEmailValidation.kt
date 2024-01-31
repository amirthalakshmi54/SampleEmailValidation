package com.amirtha.sample_email_validation


fun isBasicEmailValidation(email: String): Boolean {
    val pattern = Regex("[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,}")
    return pattern.matches(email)
}