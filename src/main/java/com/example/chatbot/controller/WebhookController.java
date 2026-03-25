package com.example.chatbot.controller;

import com.example.chatbot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public Map<String, String> receiveMessage(@RequestBody Map<String, String> request) {

        String message = request.get("message");

        System.out.println("Incoming message: " + message);

        String reply = chatService.getReply(message);

        Map<String, String> response = new HashMap<>();
        response.put("reply", reply);

        return response;
    }
}