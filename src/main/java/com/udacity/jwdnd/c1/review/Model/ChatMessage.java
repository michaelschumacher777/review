package com.udacity.jwdnd.c1.review.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ChatMessage {
    private String userName;
    private String messageText;

    public ChatMessage(String userName) {
        this.userName = userName;
    }
}
