package com.csjmdevelopers.quick_chat.listeners;

import com.csjmdevelopers.quick_chat.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
