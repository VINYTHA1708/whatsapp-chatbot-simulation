package com.example.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {

        if (message == null) {
            return "I didn't understand";
        }

        if (message.equalsIgnoreCase("hi")) {
            return "Hello";
        } else if (message.equalsIgnoreCase("bye")) {
            return "Goodbye";
        } else {
            return "Sorry, I don't understand";
        }
    }
}