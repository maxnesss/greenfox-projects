package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> listOfPlants = new ArrayList<>();

    Garden(){
        // adding elements to our garden
        listOfPlants.add(new Flower("yellow"));
        listOfPlants.add(new Flower("blue"));
        listOfPlants.add(new Tree("purple"));
        listOfPlants.add(new Tree("orange"));
    }
    public void getStatus(){
        for (Plant plant : listOfPlants) {
            plant.getStatus();
        }
    }
    public void waterGarden(int amountOfWater){
        System.out.println("Watering with "+ amountOfWater);
        for (Plant plant : listOfPlants) {
            if (plant.needsWater()) {
                plant.gettingWater((int) (amountOfWater / listOfPlants.size()));
            }
        }
    }
}
