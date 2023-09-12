// Write a program prompts the user for 5 integers in a row,
// then it prints their sum and their average:
//
// Please enter a number: 3
// Please enter a number: 7
// Please enter a number: 1
// Please enter a number: 6
// Please enter a number: 5
// Sum: 22, Average: 4.4
//

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asks for 5 numbers
        System.out.println("Please enter number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter number: ");
        int number3 = scanner.nextInt();
        System.out.println("Please enter number: ");
        int number4 = scanner.nextInt();
        System.out.println("Please enter number: ");
        int number5 = scanner.nextInt();

        // sums the numbers
        double sum = number1 + number2 + number3 + number4 + number5;
        // makes average from the sum
        double average = sum / 5;

        System.out.println("Sum: " + sum + " Average: " + average);

    }


}
