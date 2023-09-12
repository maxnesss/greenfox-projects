package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{



    public BassGuitar(){
        super("Bass Guitar",4);
    }
    public BassGuitar(int numberOfStrings){
        super("Bass Guitar",numberOfStrings);
    }


    @Override
    public void sound() {
        System.out.println(this.name + ", a "+this.numberOfStrings+"-stringed instrument that goes Duum-duum-duum.");

    }
}
