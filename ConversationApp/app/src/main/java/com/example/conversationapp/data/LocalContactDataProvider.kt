package com.example.conversationapp.data


import com.example.conversationapp.R

object LocalContactDataProvider {

    private val allUserContacts = listOf(
        Contact(
            id = 4L,
            uid = 1L,
            firstName = "Tracy",
            lastName = "Alvarez",
            number = "tracealvie@gmail.com",
            altNumber = "tracealvie@gravity.com",
            avatar = R.drawable.avatar_1
        ),
        Contact(
            id = 5L,
            uid = 2L,
            firstName = "Allison",
            lastName = "Trabucco",
            number = "atrabucco222@gmail.com",
            altNumber = "atrabucco222@work.com",
            avatar = R.drawable.avatar_3
        ),
        Contact(
            id = 6L,
            uid = 3L,
            firstName = "Ali",
            lastName = "Connors",
            number = "aliconnors@gmail.com",
            altNumber = "aliconnors@android.com",
            avatar = R.drawable.avatar_5
        ),
        Contact(
            id = 7L,
            uid = 4L,
            firstName = "Alberto",
            lastName = "Williams",
            number = "albertowilliams124@gmail.com",
            altNumber = "albertowilliams124@chromeos.com",
            avatar = R.drawable.avatar_0
        ),
        Contact(
            id = 8L,
            uid = 5L,
            firstName = "Kim",
            lastName = "Alen",
            number = "alen13@gmail.com",
            altNumber = "alen13@mountainview.gov",
            avatar = R.drawable.avatar_7
        ),
        Contact(
            id = 9L,
            uid = 6L,
            firstName = "Google",
            lastName = "Express",
            number = "express@google.com",
            altNumber = "express@gmail.com",
            avatar = R.drawable.avatar_express
        ),
        Contact(
            id = 10L,
            uid = 7L,
            firstName = "Sandra",
            lastName = "Adams",
            number = "sandraadams@gmail.com",
            altNumber = "sandraadams@textera.com",
            avatar = R.drawable.avatar_2
        ),
        Contact(
            id = 11L,
            uid = 8L,
            firstName = "Trevor",
            lastName = "Hansen",
            number = "trevorhandsen@gmail.com",
            altNumber = "trevorhandsen@express.com",
            avatar = R.drawable.avatar_8
        ),
        Contact(
            id = 12L,
            uid = 9L,
            firstName = "Sean",
            lastName = "Holt",
            number = "sholt@gmail.com",
            altNumber = "sholt@art.com",
            avatar = R.drawable.avatar_6
        ),
        Contact(
            id = 13L,
            uid = 10L,
            firstName = "Frank",
            lastName = "Hawkins",
            number = "fhawkank@gmail.com",
            altNumber = "fhawkank@thisisme.com",
            avatar = R.drawable.avatar_4
        )
    )

    fun getContactAccountByUid(accountId: Long): Contact {
        return allUserContacts.first { it.id == accountId }
    }
}
