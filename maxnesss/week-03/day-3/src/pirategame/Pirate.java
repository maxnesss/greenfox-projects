package pirategame;

public class Pirate {
    public int intoxication;
    public boolean alive = true;
    public boolean isCaptain = false;

    Pirate(){
        this.intoxication = 0;
    }
    public void drinkSomeRum(){
        if (!alive){
            pirateIsDead();
            return;
        }
        intoxication +=1;
    }
    public void howsItGoingMate(){
        if (!alive){
            pirateIsDead();
            return;
        }
        if (this.intoxication<5){
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.intoxication = 0;
        }
    }
    public void brawl(Pirate pirate){
        if (!alive || !pirate.alive){
            pirateIsDead();
            return;
        }

        int chance = (int)(Math.random() * 3);
        if (chance==0){
            die();
        } else if (chance == 1) {
            System.out.println("Pirate 1 Won\nThe other...not");
            pirate.die();
        }
    }

    public void die(){
        pirateIsDead();
        alive = false;

    }
    private void pirateIsDead(){
        System.out.println("He's dead...........");
    }


}
