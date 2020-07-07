package com.udacity.jwdnd.c1.review.Model;

public class ChatForm {
    private String userName;
    private String messageText;
    private String messageType;

    public ChatForm(String userName, String messageText, String messageType) {
        this.userName = userName;
        this.messageText = messageText;
        this.messageType = messageType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
