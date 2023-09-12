package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWebController {
    private int counter = 0;
    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        counter++;
        model.addAttribute("name", name);
        model.addAttribute("counter", counter);
        return "greeting";
    }
}
