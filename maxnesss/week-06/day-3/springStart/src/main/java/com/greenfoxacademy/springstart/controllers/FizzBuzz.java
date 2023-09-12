package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FizzBuzz {
    private int count = 0;

    @GetMapping("/fizzbuzz")
    public String fizzBuzz(Model model) {
        count++;
        if (count % 3 == 0 && count % 5 == 0) {
            model.addAttribute("number","Woof");
            model.addAttribute("fontSize","48");
        } else if (count % 3 == 0) {
            model.addAttribute("number","Fizz");
        } else if (count % 5 == 0) {
            model.addAttribute("number","Buzz");
        } else {
            model.addAttribute("number",count);
        }


        return "fizzbuzz";
    }

}
