import java.util.Arrays;
import java.util.Collections;


// - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]
public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        // used this list method
        // not sure that's according the instructions
        // other way would be to make a temp
        Collections.swap(Arrays.asList(orders), 0, 2);


        System.out.println(Arrays.toString(orders));
    }
}