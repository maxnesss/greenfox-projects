package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method
        Thing no1 = new Thing("Get milk:");
        Thing no2 = new Thing("Remove the obstacles");
        Thing no3 = new Thing("Stand up");
        Thing no4 = new Thing("Eat lunch");

        no3.complete();
        no4.complete();

        fleet.add(no1);
        fleet.add(no2);
        fleet.add(no3);
        fleet.add(no4);

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}
