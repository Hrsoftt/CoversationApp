package com.example.conversationapp

import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.conversationapp.data.LocalMessageDataProvider
import com.example.conversationapp.data.Message
import com.example.conversationapp.ui.theme.ConversationAppTheme


@Composable
fun DirectMessageScreen (
    message: Message,
    modifier: Modifier = Modifier
    ){
    
    Box {
        Row(
            modifier
                .fillMaxWidth()
                .padding(8.dp)
                .align(Alignment.TopStart)
        ) {
            ProfilePicture(
                drawableResource = message.sender.avatar,
                description = message.sender.firstName,
                modifier = Modifier.padding(8.dp))
            Text(
                text = message.sender.fullName,
                modifier = Modifier.padding(8.dp))

        }
        Text(text = message.subject,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(bottom = 64.dp)
        )
    }
}


// var mess = for (message in LocalMessageDataProvider.allMessages)
@Composable
fun new(id: Long){
    for (message in LocalMessageDataProvider.allMessages){
        if (message.id == id) {
            DirectMessageScreen(message = message, Modifier.fillMaxSize())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ConversationAppTheme {
       new(id = 5L)
    }
}