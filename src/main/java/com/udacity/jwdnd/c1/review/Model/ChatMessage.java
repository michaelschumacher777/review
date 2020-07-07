package com.udacity.jwdnd.c1.review.Model;

public class ChatMessage {
    private int messageId;
    private String username;
    private String messagetext;

    public ChatMessage(String userName) {
        this.username = userName;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessagetext() {
        return messagetext;
    }

    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }
}
