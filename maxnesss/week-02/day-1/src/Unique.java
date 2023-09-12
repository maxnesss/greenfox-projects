        // Create a function that takes an array of numbers as a parameter
        // and returns an array of integers where every integer is unique
        // (occurs only once)

        // Example
        // System.out.println(Arrays.toString(findUniqueItems(new int[] { 1, 11, 34, 11, 52, 61, 1, 34 })));
        // should print: `[1, 11, 34, 52, 61]`
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findUniqueItems(new int[] { 1, 11, 34, 11, 52, 61, 1, 34 })));
    }
    public static int[] findUniqueItems(int[] userArray){
        int finalArrayLenght = userArray.length;

        for (int element = 0; element<userArray.length;element++) {
            for (int element2 = 0; element2<userArray.length;element2++){
                if (element == element2) {

                } else if (userArray[element] == userArray[element2]){
                    userArray[element] = 0;
                    finalArrayLenght--;
                }
            }
        }
        int[] finalArray = new int[finalArrayLenght];
        int i =0;
        for (int element = 0; element< userArray.length;element++){
            if (userArray[element] !=0){
                finalArray[i] = userArray[element];
                i++;
            }
        }
        return finalArray;
    }
}