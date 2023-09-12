// Write a program that reads a number from the standard input and
// then draws a pyramid of the specified height
//
// Example:
//
// Please enter the pyramid height: 4
//    *
//   ***
//  *****
// *******

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("Enter pyramid height:");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        draw(height);
    }

    public static void draw(int height) {
        int inineration = -1;

        // cycles through the cycle for each layer of the pyramid
        for (int layer = height; layer > 0; layer--) {

            // prints desired number of spaces of each line
            // starts with number which is equal to the height of the pyramid
            for (int dots = layer; dots > 0; dots--) {
                System.out.print(" ");
            }
            // prints desired number of stars
            // for each layer -2
            inineration += 2;
            for (int z = 1; z <= inineration; z++) {
                System.out.print("*");
            }
            // prints new line
            System.out.println(" ");

        }
    }
}