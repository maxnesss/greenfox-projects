package pirategame;

public class Main {
    public static void main(String[] args) {
        Pirate piratePeter = new Pirate();
        Pirate pirateJohn = new Pirate();
        Pirate piratePete = new Pirate();

        Ship aurora = new Ship();
        aurora.fillShip();

        Ship santaMaria = new Ship();
        santaMaria.fillShip();


        System.out.println(aurora.batteEnemy(santaMaria));
        santaMaria.status();
        aurora.status();




    }
}
