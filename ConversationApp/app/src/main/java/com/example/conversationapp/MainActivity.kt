package com.example.conversationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.conversationapp.data.LocalMessageDataProvider
import com.example.conversationapp.data.Message
import com.example.conversationapp.ui.theme.ConversationAppTheme
import kotlin.reflect.KProperty

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConversationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val inboxLazyListState = rememberLazyListState()
                    InboxMessageList(emails = mail.emails, inboxLazyListState = inboxLazyListState)
                }
            }
        }
    }
}
//

val emails = LocalMessageDataProvider.allMessages


val mail = InboxHomeUIState(
    emails = emails,
    selectedEmail = emails.first()
)
data class InboxHomeUIState(
    val emails: List<Message> = emptyList(),
    val selectedEmail: Message? = null,
    val isDetailOnlyOpen: Boolean = false,
    val loading: Boolean = false,
    val error: String? = null
)

@Composable
fun InboxMessageList(
    emails: List<Message>,
    inboxLazyListState: LazyListState,
    //selectedEmail: Message? = null,
    modifier: Modifier = Modifier,
   // navigateToDetail: (Long) -> Unit
) {
    LazyColumn(modifier = modifier, state = inboxLazyListState) {
//        item {
//            ReplySearchBar(modifier = Modifier.fillMaxWidth())
//        }
        items(items = emails, key = { it.id }) { email ->
            InboxScreen(
                message = email,
  //              isSelected = email.id == selectedEmail?.id
            )
//            { emailId ->
//                navigateToDetail(emailId)
//            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ConversationAppTheme {
//        Greeting("Android")
//    }
//}