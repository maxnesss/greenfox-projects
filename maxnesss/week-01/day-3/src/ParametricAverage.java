import java.util.Scanner;

// Write a program that reads a number from the standard input.
// Next, the program will prompt the user to enter as many numbers
// as the value of the first number the user entered.
// Once the user enters all numbers the program will print
// their sum and average.
//
// Example:
//
// How many numbers would you like to enter: 6
// Enter number 1 of 6: 2
// Enter number 2 of 6: 3
// Enter number 3 of 6: 7
// Enter number 4 of 6: 9
// Enter number 5 of 6: 11
// Enter number 6 of 6: 0
// Sum: 32, Average: 5.333333333333333
//
public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to enter:");
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = scanner.nextInt();

        int sum = 0;
        int avarage = 0;

        for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.println("Enter number " + i + " of " + numberOfNumbers + ": ");
            sum += scanner.nextInt();
        }
        System.out.println("Sum:" + sum);
        System.out.println("Average:" + (float) sum / (float) numberOfNumbers);
    }
}