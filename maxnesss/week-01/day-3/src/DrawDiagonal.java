import java.util.Scanner;

// Write a program that reads a number from the standard input and
// then draws a square with the main diagonal of the specified size
//
// Example:
//
// Please enter the square size: 6
// %%%%%%
// %%   %
// % %  %
// %  % %
// %   %%
// %%%%%%
//
public class DrawDiagonal {
    public static void main(String[] args) {
        System.out.println("Please enter the square size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        draw(size);
    }

    public static void draw(int size) {
        drawLine(size);

        int line = 2;
        int column = size - 1 - line;

        for (int i = 1; i < size - 1; i++) {

            System.out.print("*");
            for (int y = 2; y < line; y++) {
                System.out.print(" ");
            }

            System.out.print(line);

            for (int z = 1; z <= column; z++) {
                System.out.print(" ");
            }
            column--;
            System.out.println("* ");

            line++;

        }
        drawLine(size);
    }

    public static void drawLine(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}