package carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    protected int ammoStorage;
    protected int healthPoints;
    protected List<Aircraft> listOfAircrafts = new ArrayList<>();

    Carrier(int ammoStorage, int healthPoints){
        this.ammoStorage = ammoStorage;
        this.healthPoints = healthPoints;
    }
    public void add(Aircraft aircraft){
        listOfAircrafts.add(aircraft);
    }
    public void fill(){

        for (int plane = 0; plane < listOfAircrafts.size(); plane++) {
            if (listOfAircrafts.get(plane).ammo ==0 && (ammoStorage>=listOfAircrafts.get(plane).maxAmmo)){
                listOfAircrafts.get(plane).refillAmmo(listOfAircrafts.get(plane).maxAmmo);
                ammoStorage -= listOfAircrafts.get(plane).maxAmmo;
            }// needs to add more functionality
        }
    }
    public void getStatus(){

        System.out.println("HP: "+ healthPoints + ", Aircraft count: "+ listOfAircrafts.size()+", Ammo storage: "+ammoStorage+", Total damage: "+ getTotalDamage());
        for (Aircraft plane :
                listOfAircrafts) {
            System.out.println(plane.getStatus());
        }
    }
    private int getTotalDamage(){
        int totalDamage = 0;
        for (Aircraft plane : listOfAircrafts) {
            totalDamage += plane.countDamage();
        }
        return totalDamage;
    }
    public void fight(Carrier enemyShip){
        int enemyFirePower = enemyShip.getTotalDamage();
        healthPoints -= enemyFirePower;
        if (healthPoints<=0){
            System.out.println("It's dead Jim :(");
        }

    }

}
