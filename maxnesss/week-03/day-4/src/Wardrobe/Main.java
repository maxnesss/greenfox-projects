package Wardrobe;

public class Main {

    public static void main(String[] args) {
        Underwear socks = new Underwear();
        Underwear pantsUs = new Underwear();
        Overwear shirt = new Overwear();
        shirt.wear();
        Wardrobe wardInBedroom = new Wardrobe();
        wardInBedroom.addCloth(socks);
        wardInBedroom.addCloth(pantsUs);
        wardInBedroom.addCloth(shirt);

        wardInBedroom.printInfo();
    }
}
