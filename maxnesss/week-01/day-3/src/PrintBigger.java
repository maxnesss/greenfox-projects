// Write a program that asks for two numbers and prints the bigger one.
// If they are equal, it prints the second one.
//
// Example
//
// Please enter a number: 5
// Please enter a number: 13
// 13

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // number input:
        System.out.println("Please enter a number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter a second number: ");
        int secondNUmber = scanner.nextInt();

        // conditions:
        if (firstNumber > secondNUmber) {
            System.out.println("First number is bigger");
        } else {
            System.out.println("Second number is bigger");
        }
    }
}
