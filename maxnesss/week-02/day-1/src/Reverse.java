import java.util.Arrays;
import java.util.Collections;

// - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]
public class Reverse {
    //
    // Work in progress
    //
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};


        // temp is created
        // first number is placed to temp
        // first number is exchanged for last number
        // to the position of last number the temp is places
        // loops through and stops in the middle or just before
        for(int i = 0; i < numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));




    }
}