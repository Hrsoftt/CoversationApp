package com.example.conversationapp

import androidx.lifecycle.ViewModel
import com.example.conversationapp.data.LocalMessageDataProvider
import com.example.conversationapp.data.Message
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class InboxViewModel : ViewModel() {

    // UI state exposed to the UI
    private val _uiState = MutableStateFlow(InboxHomeUIState(loading = true))
    val uiState: StateFlow<InboxHomeUIState> = _uiState

    init {
        initEmailList()
    }

    private fun initEmailList() {
        val messages = LocalMessageDataProvider.allMessages
        _uiState.value = InboxHomeUIState(
            messages = messages,
            selectedMessage = messages.first()
        )
    }

    fun setSelectedMessage(emailId: Long) {
        /**
         * We only set isDmOnlyOpen to true when it's only single pane layout
         */
        val message = uiState.value.messages.find { it.id == emailId }
        _uiState.value = _uiState.value.copy(
            selectedMessage = message,
            isDmOnlyOpen = true
        )
    }

    fun closeDetailScreen() {
        _uiState.value = _uiState
            .value.copy(
                isDmOnlyOpen = false,
                selectedMessage = _uiState.value.messages.first()
            )
    }
}

data class InboxHomeUIState(
    val messages: List<Message> = emptyList(),
    val selectedMessage: Message? = null,
    val isDmOnlyOpen: Boolean = false,
    val loading: Boolean = false,
    val error: String? = null
)
