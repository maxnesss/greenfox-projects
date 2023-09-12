package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    private int numberOfCalls = 0;

    @RequestMapping("greeting")
    public Greeting greeting(@RequestParam(required = false) String name){
        numberOfCalls++;
        return new Greeting(numberOfCalls,"Hello, "+name);
    }
}
