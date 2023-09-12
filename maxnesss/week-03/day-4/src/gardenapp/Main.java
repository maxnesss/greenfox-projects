package gardenapp;

public class Main {
    public static void main(String[] args) {
        Garden myGarden = new Garden();

        myGarden.getStatus();
        myGarden.waterGarden(40);
        myGarden.getStatus();
        myGarden.waterGarden(70);
        myGarden.getStatus();



    }
}
