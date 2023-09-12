package com.greenfoxacademy.springstart.controllers;

public class Greeting {
    private int greetCount;
    private String name;

    public Greeting(int greetCount, String name) {
        this.greetCount = greetCount;
        this.name = name;
    }

    public int getGreetCount() {
        return greetCount;
    }

    public String getName() {
        return name;
    }
}
