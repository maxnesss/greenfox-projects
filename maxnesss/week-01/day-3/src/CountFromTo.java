// Create a program that asks for two numbers. If the second number
// is not greater than the first the program should print:
// "The second number should be bigger"
//
// Otherwise it should output all integers between the first and
// the second number (excluding the second number)
//
// Example:
//
// Please enter the first number: 3
// Please enter the second number: 6
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // number input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt();

        // if the second number is bigger. it prints all the numbers between.
        if (secondNumber < firstNumber) {
            System.out.println("Second number should be bigger than the first number");
        } else {
            for (int fNumber = firstNumber; fNumber < secondNumber; fNumber++) {
                System.out.println(fNumber);
            }
        }

    }
}