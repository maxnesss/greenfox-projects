// Create the usual class wrapper (Sum) and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero
// to the given parameter
//
// Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int userNumber){
        int sum = 0;
        // add every number from 0 to user number together
        for (int number = 0; number<= userNumber; number++){
            sum += number;
        }
        return sum;
    }
}
