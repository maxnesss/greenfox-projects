package com.example.trialtrialexam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/notes-form")
    public String form(){
        return "html/notes-form.html";
    }
    @GetMapping("/notes-main")
    public String mainPage(){
        return "html/notes-main.html";
    }

}
