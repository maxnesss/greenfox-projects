package sharpie;
/*
Create SharpieSet class
it contains a list of Sharpie, named listOfSharpies
it has a method that adds a new Sharpie to the set: add(sharpie)
it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
it has a method that removes all unusable Sharpies: removeTrash()
 */

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> listOfSharpies = new ArrayList<>();


    public void add(Sharpie sharpie){
        listOfSharpies.add(sharpie);
    }

    public int countUsable() {
        int usable = 0;
        for (int pencil = 0; pencil < listOfSharpies.size(); pencil++) {
            if (listOfSharpies.get(pencil).inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }
    public void removeTrash(){
        for (int pencil = 0; pencil < listOfSharpies.size(); pencil++) {
            if (listOfSharpies.get(pencil).inkAmount > 0) {
                listOfSharpies.remove(pencil);
            }
        }
    }


}


