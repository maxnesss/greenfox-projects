// Write a program that reads a number from the standard input and
// then draws a triangle of the specified height
//
// Example:
//
// Please enter the triangle height: 4
// *
// **
// ***
// ****

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // input
        System.out.println("Enter triangle height:");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        // draw function
        draw(height);
    }

    public static void draw(int height) {
        // for each layer
        for (int layer = 1; layer <= height; layer++) {

            //will print number of stars equal to the layer
            for (int stars = 1; stars <= layer; stars++) {
                System.out.print("*");
            }
            //after each layer it will print end of line
            System.out.println();
        }
    }
}