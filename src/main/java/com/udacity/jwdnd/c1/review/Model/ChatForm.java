package com.udacity.jwdnd.c1.review.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ChatForm {
    private String userName;
    private String messageText;
    private String messageType;

    public ChatForm(String userName, String messageText, String messageType) {
        this.userName = userName;
        this.messageText = messageText;
        this.messageType = messageType;
    }
}
