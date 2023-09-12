import java.util.*;

public class ElementFinder {
    public static void main(String... args) {

        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Add a method called `containsSeven` that checks if the `listOfNumbers` contains the number 7
        // If it does the method should return "Hoorray" otherwise return "Noooooo"

        // The output should be "Noooooo"
        System.out.println(containsSeven(listOfNumbers));

        // Add a method called `containsSevenDifferent` which implements the same behavior differently
        // (e.g. using different list methods)

        // The output should be "Noooooo", again!
        // System.out.println(containsSevenDifferent(listOfNumbers));
    }
    public static String containsSeven(ArrayList<Integer> list){
        if(list.contains(7)){
            return "Horray";
        }else{
            return "Noooooo";
        }
    }
    public static String containsSevenDifferent(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {

        }
    }

}