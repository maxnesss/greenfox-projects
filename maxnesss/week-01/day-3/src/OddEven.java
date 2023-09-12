// Write a program that reads a number from the standard input,
// then prints "Odd" if the number is odd, or "Even" if it is even
//
// Please enter a number: 7
// Odd

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        // creates a condition that prints if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }

    }
}
