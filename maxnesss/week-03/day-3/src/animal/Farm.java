package animal;

import java.util.ArrayList;
import java.util.List;

/*
Reuse your Animal class
Create a Farm class
it has a list of Animals listOfAnimals
it has a limit that defines how many animals can be kept in the Farm and can be set when the Farm is created
it has two methods:
breed() -> creates a new animal if there's place for it
sell() -> removes the least hungry animal
 */
public class Farm {
    List<Animal> listOfAnimal = new ArrayList<>();
    int limit;

    Farm(int limit){
        this.limit = limit;
    }

    public void breed(){
        if (listOfAnimal.size()<limit){
            listOfAnimal.add(new Animal());
        }
    }
    public void sell(){
        int temp = 0;
        int index = 10;
        for (Animal animal:listOfAnimal){


            if (animal.hunger>temp){

                temp = animal.hunger;
                index = listOfAnimal.indexOf(animal);
            }
        }
        listOfAnimal.remove(index);

    }


}
