import java.util.*;

public class Matchmaking {
    public static void main(String... args) {

        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }
    public static String match(ArrayList<String> girlsList, ArrayList<String>boysList){
        ArrayList<String> finalList = new ArrayList<>();

        for (int i = 0; i < boysList.size()-1; i++) {
            finalList.add(girlsList.get(i) + " - " +boysList.get(i));
        }
        return finalList.toString();

    }
}