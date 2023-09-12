// Write a program that reads a number from the standard input and
// then draws a diamond of the specified height
//
// Example:
//
// Please enter the diamond height: 4
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// Note: the height of the diamond is taken from its base
// (where it is the widest) to the top.
// The total number of lines produced is 2*height-1

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.println("Enter the diamond height: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        draw(height);
    }

    public static void draw(int size) {

        int inineration = -1;
        // -------
        // Pyramid
        // -------

        // cycles through the cycle for each layer of the pyramid
        for (int y = size; y > 0; y--) {

            // prints desired number of spaces of each line
            // starts with number which is equal to the height of the pyramid
            for (int i = y; i > 0; i--) {
                System.out.print(" ");
            }
            // prints desired number of stars
            inineration += 2;
            for (int z = 1; z <= inineration; z++) {
                System.out.print("*");
            }
            // prints new line
            System.out.println(" ");
        }
        //-------
        //Diamond
        //-------
        // cycles through the cycle for each layer of the pyramid
        int itinery2 = 2;
        for (int y = 1; y <= size; y++) {

            // prints desired number of spaces of each line
            // starts with number which is equal to the height of the pyramid
            for (int x = 1; x <= itinery2; x++) {
                System.out.print(" ");
            }
            itinery2 += 1;
            // prints desired number of stars
            inineration -= 2;
            for (int z = 1; z <= inineration; z++) {
                System.out.print("*");
            }
            // prints new line
            System.out.println(" ");
        }


    }
}