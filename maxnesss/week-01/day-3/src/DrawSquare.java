// Write a program that reads a number from the standard input and
// then draws a square of the specified size
//
// Example:
//
// Please enter the square size: 6
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("Enter the square size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        draw(size);
    }

    public static void draw(int size) {
        //top side
        drawside(size);
        System.out.println(" ");

        //middle side
        for (int dots = 1; dots <= size - 2; dots++) {
            drawMiddle(size);
            System.out.println(" ");
        }

        //bottom side
        drawside(size);
    }

    public static void drawside(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
    }

    public static void drawMiddle(int size) {
        System.out.print("*");
        for (int i = 1; i <= size - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }
}