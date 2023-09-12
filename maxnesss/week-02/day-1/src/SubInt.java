        // Create a function that takes a number (a digit) and an array of integers
        // as parameters and returns the indices of the integers in the array
        // which contain the given digit or returns an empty array
        // (if no number in the array contains the given digit)

        // Examples:
        // System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] { 1, 11, 34, 52, 61 })));
        // should print: `[0, 1, 4]`
        // System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] { 1, 11, 34, 52, 61 })));
        // should print: '[]'

        // Note: We are using Arrays.toString() function to print the returned array
        // You could just as well iterate over the array and print its items one by one
import java.util.Arrays;

public class SubInt {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMatchingIndexes(4,new int[]{5,4,6,44,7,34,5})));
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] { 1, 11, 34, 52, 61 })));
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] { 1, 11, 34, 52, 61 })));
    }

    public static int[] findMatchingIndexes(int number, int[] arrayOfNo){



        String[] arrayOfStrings = new String[arrayOfNo.length];
        //converts int number to String number
        String stringNumber = "" + number;
        //converts int array to String array
        for (int element = 0; element<arrayOfNo.length;element++){
            arrayOfStrings[element] = "" + arrayOfNo[element]; // QQQQQQQQQQ is there some better way?
        }

        //need to find out how big the result array should be
        int lenghtOfFinal = 0;
        for (int element = 0; element<arrayOfStrings.length;element++){
            if (arrayOfStrings[element].contains(stringNumber)){
                lenghtOfFinal++;
            }
        }
        // create finall array of needed size
        int[] finalArray = new int[lenghtOfFinal];
        // temp variable for index in final array
        int i = 0;
        // make final int array
        for (int element = 0; element<arrayOfStrings.length;element++){

            if (arrayOfStrings[element].contains(stringNumber)){
                if (i<finalArray.length) {

                    finalArray[i] = element;
                    i++;
                }
            }
        }
        // returns final array
        return finalArray;
    }
}
