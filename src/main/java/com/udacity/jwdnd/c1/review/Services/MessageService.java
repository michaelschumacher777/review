package com.udacity.jwdnd.c1.review.Services;

import com.udacity.jwdnd.c1.review.Mapper.MessagesMapper;
import com.udacity.jwdnd.c1.review.Model.ChatForm;
import com.udacity.jwdnd.c1.review.Model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MessageService {

    private MessagesMapper messagesMapper;

    public MessageService(MessagesMapper messagesMapper) {
        this.messagesMapper = messagesMapper;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean.");
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage newChatMessage = new ChatMessage(chatForm.getUserName());
        switch (chatForm.getMessageType()) {
            case "Say":
                newChatMessage.setMessagetext(chatForm.getMessageText());
                break;
            case "Shout":
                newChatMessage.setMessagetext(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                newChatMessage.setMessagetext(chatForm.getMessageText().toLowerCase());
                break;
        }
        messagesMapper.addMessage(newChatMessage);
    }

    public List<ChatMessage> getMessages() {
        List<ChatMessage> chats = messagesMapper.findAllMessages();
        return chats;
    }
}
