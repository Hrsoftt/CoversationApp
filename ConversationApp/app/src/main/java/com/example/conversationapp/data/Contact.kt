package com.example.conversationapp.data

import androidx.annotation.DrawableRes

data class Contact(
    val id: Long,
    val uid: Long,
    val firstName: String,
    val lastName: String,
    val number: String,
    val altNumber: String,
    @DrawableRes val avatar: Int,
    var isCurrentAccount: Boolean = false
) {
    val fullName: String = "$firstName $lastName"
}
