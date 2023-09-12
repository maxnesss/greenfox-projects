package flyable;

public abstract class Vehicle {
    private int yearOfConstruction;
    private String countryMade;
    private String fuel;
    Vehicle(int yearOfConstruction, String countryMade, String fuel){
        this.yearOfConstruction = yearOfConstruction;
        this.countryMade = countryMade;
        this.fuel = fuel;
    }
}
