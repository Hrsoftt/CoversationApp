package com.example.conversationapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.conversationapp.data.Message
import com.example.conversationapp.ui.theme.ConversationAppTheme


@Composable
fun InboxScreen(
    message: Message,
    //isSelected: Boolean = false,
    modifier: Modifier = Modifier,
    //navigateToDetail: (Long) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
       //     .semantics { selected = isSelected }
            .clickable { /*navigateToDetail(message.id)*/ }
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            ProfilePicture(
                drawableResource = message.sender.avatar,
                description =message.sender.firstName )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp, vertical = 4.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = message.sender.firstName)
                Text(message.subject)
            }
            Text(text = "7/14/23")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun InboxPreview() {
    ConversationAppTheme {
        //InboxScreen()
    }
}