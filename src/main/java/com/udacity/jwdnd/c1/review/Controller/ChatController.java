package com.udacity.jwdnd.c1.review.Controller;

import com.udacity.jwdnd.c1.review.Model.ChatForm;
import com.udacity.jwdnd.c1.review.Services.MessageService;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatPage(ChatForm chatForm, Model model) {
        System.out.println("We are in getChatPage!");
        model.addAttribute("chatMessages", this.messageService.getMessages());
        return "chat";
    }

    @PostMapping
    public String postChatMessage(ChatForm chatForm, Model model) {
        System.out.println("We are in postChatMessage");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            chatForm.setUserName(authentication.getName());
        } else {
            chatForm.setUserName("unknown");
        }

        this.messageService.addMessage(chatForm);
        chatForm.setMessageText("");  // Why do we clear this???
        model.addAttribute("chatMessages", this.messageService.getMessages());
        return "chat";
    }

    @ModelAttribute
    public String[] allMessageTypes () {
        return new String[] {"Say", "Shout", "Whisper"};
    }
}
