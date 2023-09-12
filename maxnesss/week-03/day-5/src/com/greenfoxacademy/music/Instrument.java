package com.greenfoxacademy.music;

public abstract class Instrument {
    protected String name;
    Instrument(String name){
        this.name = name;
    }



    public abstract void play();
}
