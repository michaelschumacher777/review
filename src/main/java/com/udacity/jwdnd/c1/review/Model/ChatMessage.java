package com.udacity.jwdnd.c1.review.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ChatMessage {
    private int messageId;
    private String username;
    private String messagetext;

    public ChatMessage(String userName) {
        this.username = userName;
    }
}
