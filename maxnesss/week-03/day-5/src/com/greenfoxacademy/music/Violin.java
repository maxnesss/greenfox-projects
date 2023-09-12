package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{



    public Violin(){
        super("Violin",4);
    }


    @Override
    public void sound() {
        System.out.println(this.name + ", a "+this.numberOfStrings+"-stringed instrument that goes Screech.");

    }
}
