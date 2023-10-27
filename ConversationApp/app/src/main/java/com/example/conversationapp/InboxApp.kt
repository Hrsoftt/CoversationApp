package com.example.conversationapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.outlined.ChatBubbleOutline

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.example.conversationapp.components.EmptyComingSoon
import com.example.conversationapp.components.InboxMessageScreen


@Composable
fun InboxApp(
    inboxHomeUIState: InboxHomeUIState,
    closeDmScreen: () -> Unit,
    navigateToDm: (Long) -> Unit
){
    InboxAppContent(
        inboxHomeUIState = inboxHomeUIState,
        closeDmScreen = closeDmScreen,
        navigateToDm = navigateToDm
    )
}

@Composable
fun InboxAppContent(
    modifier: Modifier = Modifier,
    inboxHomeUIState: InboxHomeUIState,
    closeDmScreen: () -> Unit,
    navigateToDm: (Long) -> Unit,
) {

    val selectedDestination = remember { mutableStateOf(InboxRoute.INBOX) }

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        if (selectedDestination.value == InboxRoute.INBOX) {
            InboxMessageScreen(
                inboxHomeUIState = inboxHomeUIState,
                closeDmScreen = closeDmScreen,
                navigateToDetail = navigateToDm,
                modifier = Modifier.weight(1f)
            )
        } else {
            EmptyComingSoon(modifier = Modifier.weight(1f))
        }
        NavigationBar(modifier = Modifier.fillMaxWidth()) {
            TOP_LEVEL_DESTINATIONS.forEach { replyDestination ->
                NavigationBarItem(
                    selected = selectedDestination.value == replyDestination.route,
                    onClick = { selectedDestination.value = replyDestination.route },
                    icon = {
                        Icon(
                            imageVector = replyDestination.selectedIcon,
                            contentDescription = stringResource(id = replyDestination.iconTextId)
                        )
                    }
                )
            }
        }
    }
}



object InboxRoute {
    const val INBOX = "Inbox"
    const val ARTICLES = "Articles"
    const val DM = "DirectMessages"
    const val GROUPS = "Groups"
}

data class ReplyTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int
)

val TOP_LEVEL_DESTINATIONS = listOf(
    ReplyTopLevelDestination(
        route = InboxRoute.INBOX,
        selectedIcon = Icons.Default.Inbox,
        unselectedIcon = Icons.Default.Inbox,
        iconTextId = R.string.tab_inbox
    ),
    ReplyTopLevelDestination(
        route = InboxRoute.ARTICLES,
        selectedIcon = Icons.Default.Article,
        unselectedIcon = Icons.Default.Article,
        iconTextId = R.string.tab_article
    ),
    ReplyTopLevelDestination(
        route = InboxRoute.DM,
        selectedIcon = Icons.Outlined.ChatBubbleOutline,
        unselectedIcon = Icons.Outlined.ChatBubbleOutline,
        iconTextId = R.string.tab_inbox
    ),
    ReplyTopLevelDestination(
        route = InboxRoute.GROUPS,
        selectedIcon = Icons.Default.People,
        unselectedIcon = Icons.Default.People,
        iconTextId = R.string.tab_article
    )
)