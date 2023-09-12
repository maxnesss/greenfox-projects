//  Create the usual class wrapper (Factorial) and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
//
// - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
    public static int calculateFactorial(int userNumber){
        int factorial = 1;
        // starts with 0 . multiplies all the numbers together up to user number
        for(int number = 1; number<= userNumber; number++){
            factorial *= number;
        }
        return factorial;
    }

}
