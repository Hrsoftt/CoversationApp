package com.example.conversationapp.data


data class Message(
    val id: Long,
    val sender: Contact,
    //val recipients: List<Contact> = emptyList(),
    val subject: String,
    val body: String,
    //val attachments: List<EmailAttachment> = emptyList(),
    var isImportant: Boolean = false,
    var isStarred: Boolean = false,
    //var mailbox: MailboxType = MailboxType.INBOX,
    val createdAt: String,
//    val threads: List<Message> = emptyList()
)