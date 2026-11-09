package com.example.aiassistant.controller;

import com.example.aiassistant.service.AiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService){
        this.aiService=aiService;
    }

    @GetMapping("/openai")
    public String askingQuestion(@RequestParam String question){
        return aiService.askQuestion(question);
    }
}
