package com.example.conversationapp.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.conversationapp.InboxHomeUIState
import com.example.conversationapp.InboxScreen
import com.example.conversationapp.data.Message

@Composable
fun InboxMessageScreen(
    inboxHomeUIState: InboxHomeUIState,
    closeDmScreen: () -> Unit,
    navigateToDetail: (Long) -> Unit,
    modifier: Modifier = Modifier
){
    val inboxLazyListState = rememberLazyListState()
    Box(modifier = modifier.fillMaxSize()) {
        InboxMessageListContent(
            inboxHomeUIState = inboxHomeUIState,
            inboxLazyListState = inboxLazyListState,
            closeDmScreen = closeDmScreen,
            navigateToDetail = navigateToDetail
        )
    }

}

@Composable
fun InboxMessageListContent(
    inboxHomeUIState: InboxHomeUIState,
    modifier: Modifier = Modifier,
    inboxLazyListState: LazyListState,
    closeDmScreen: () -> Unit,
    navigateToDetail: (Long) -> Unit
){

    if (inboxHomeUIState.selectedMessage != null && inboxHomeUIState.isDmOnlyOpen){
        BackHandler {
            closeDmScreen()
        }
        ReplyEmailDetail(message = inboxHomeUIState.selectedMessage){
            closeDmScreen()
        }
    }else{
        InboxMessageList(messages = inboxHomeUIState.messages,
            inboxLazyListState = inboxLazyListState,
            navigateToDetail = navigateToDetail,
            modifier = modifier
        )
    }
}

@Composable
fun InboxMessageList(
    messages: List<Message>,
    inboxLazyListState: LazyListState,
    selectedMessage: Message? = null,
    modifier: Modifier = Modifier,
    navigateToDetail: (Long) -> Unit
) {
    LazyColumn(modifier = modifier, state = inboxLazyListState) {
        item {
            InboxSearchBar(modifier = Modifier.fillMaxWidth())
        }
        items(items = messages, key = { it.id }) { message ->
            InboxScreen(
                message = message,
                isSelected = message.id == selectedMessage?.id
            )
            { messageId ->
                navigateToDetail(messageId)
            }
        }
    }
}


@Composable
fun ReplyEmailDetail(
    message: Message,
    isFullScreen: Boolean = true,
    modifier: Modifier = Modifier.fillMaxSize(),
    onBackPressed: () -> Unit = {}
){
    DirectMessageAppBar(message = message, isFullScreen = isFullScreen) {
        onBackPressed()
    }
    DirectMessageScreen(message = message, modifier = modifier)
}