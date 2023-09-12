package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{



    public ElectricGuitar(){
        super("Electric guitar",6);
    }
    public ElectricGuitar(int numberOfStrings){
        super("Electric guitar",numberOfStrings);
    }


    @Override
    public void sound() {
        System.out.println(this.name + ", a "+this.numberOfStrings+"-stringed instrument that goes Twang.");

    }
}
