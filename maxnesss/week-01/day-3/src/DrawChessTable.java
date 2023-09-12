import java.util.Scanner;

// Write a program that reads a number from the standard input and
// then draws a chess table of the specified size
//
// Example:
//
// Please enter the chess table size: 8
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
public class DrawChessTable {
    public static void main(String[] args) {
        System.out.println("Please enter the chess table:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        draw(size);
    }

    public static void draw(int size) {
        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {
                drawLine(size);
            } else {
                System.out.print(" ");
                drawLine(size);
            }
            System.out.println("");
        }

    }

    public static void drawLine(int size) {

        for (int i = 1; i <= size / 2; i++) {
            System.out.print("% ");
        }
    }
}