        // "Saturn" is missing from the planetList below
        // Insert it into the correct position (should go between Jupiter and Uranus)
        // "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"
        // Create a method called "putSaturn()" which has a list parameter and returns the correct list

        // Expected output: [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarSystem {
    public static void main(String... args) {

        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(putSaturn(planetList));
    }
    public static String putSaturn(ArrayList<String> planetList){
        planetList.add(5,"Saturn");

        return planetList.toString();
    }
}