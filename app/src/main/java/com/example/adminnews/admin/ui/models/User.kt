package com.example.adminnews.admin.ui.models

data class User(
    val uid: String,
    val fullName: String,
    val email: String,
    val countryCode: String,
    val userRole: Boolean
)
