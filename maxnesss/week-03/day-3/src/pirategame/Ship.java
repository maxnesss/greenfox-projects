package pirategame;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    public List<Pirate> listOfCrew = new ArrayList<>();

    public void fillShip() {

        int numberOfCrew = (int) (Math.random() * 112) + 1;
        for (int i = 0; i <= numberOfCrew; i++) {
            listOfCrew.add(new Pirate());
        }
        listOfCrew.get(0).isCaptain = true;
    }

    public void status() {
        if (listOfCrew.get(0).alive) {
            System.out.println("Captain of the ship is alive");
            System.out.println("He had " + listOfCrew.get(0).intoxication + " drinks.");
        } else {
            System.out.println("Captain of the ship is dead");
        }

        System.out.println("The crew has " + (listOfCrew.size()-1) + " members of whom " + countAliveCrew() + " are alive.");
    }
    public boolean batteEnemy(Ship enemy){
        int score = countAliveCrew() - listOfCrew.get(0).intoxication;
        int enemyScore = enemy.countAliveCrew() - enemy.listOfCrew.get(0).intoxication;


        if (score>enemyScore) {
            party();
            enemy.loosingBattle();
            return true;
        } else{
            loosingBattle();
            enemy.party();

            return false;
        }

    }
    public void loosingBattle(){
        int causalities = (int)(Math.random()*listOfCrew.size());
        for (int i = 1; i <= causalities ; i++) {
            listOfCrew.get(i).alive = false;
        }
    }
    public void party(){
        for (Pirate pirate : listOfCrew) {
            pirate.intoxication += (int)(Math.random()*5);
        }
    }
    public int countAliveCrew(){
        int numberOfAlivePirates =-1;
        for (Pirate pirate : listOfCrew) {
            if (pirate.alive){
                numberOfAlivePirates++;
            }
        }
        return numberOfAlivePirates;
    }

}
