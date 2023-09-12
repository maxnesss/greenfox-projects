package Wardrobe;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private List<Cloth> listOfClothes = new ArrayList<>();
    public void addCloth(Cloth cloth){
        listOfClothes.add(cloth);
    }
    public void printInfo(){
        for (Cloth cloth : listOfClothes) {
            cloth.getInfo();
        }
    }
    public void washAllClothes(){
        for (Cloth cloth: listOfClothes) {
            cloth.wash();
        }
    }
    public void repairAllClothes(){
        for (Cloth cloth: listOfClothes){
            cloth.repair();
        }
    }
    public void purge(){
        for (Cloth cloth : listOfClothes) {
            if(cloth.getCondition() == 0){
                listOfClothes.remove(cloth);
            }
        }
    }

}
