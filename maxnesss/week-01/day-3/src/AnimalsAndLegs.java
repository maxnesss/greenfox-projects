// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// Print how many legs all the animals have in total
//
// Example
//
// Please enter the number of chickens: 4
// Please enter the number of pigs: 2
// The number of legs: 16
//

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // chicken
        System.out.println("Enter the number of chicken: ");
        int numberOfChicken = scanner.nextInt();

        // pigs
        System.out.println("Enter the number of pigs: ");
        int numberOfPigs = scanner.nextInt();

        // total number of legs: chicken*2 + pigs*4
        int numberOfLegs = (numberOfChicken * 2) + (numberOfPigs * 4);

        System.out.println(numberOfLegs);


    }
}
