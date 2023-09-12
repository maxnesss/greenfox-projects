package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument{

    protected int numberOfStrings;

    StringedInstrument(String name, int numberOfStrings){
        super(name);
        this.numberOfStrings = numberOfStrings;

    }



    public abstract void sound();

    @Override
    public void play(){
        sound();
    }

}
