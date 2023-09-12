        // Write a program that asks for an integer `size` from the standard input,
        // then it creates a two-dimensional array (of integers) of the specified
        // size (nxn) with the value of 1 on the main diagonal and the value of 0
        // everywhere else. Print the 2d array into the output
        //
        // Example:
        //
        // Please enter the array (matrix) size: 4
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the diagonal matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = create(size);
        print(matrix);
    }

    public static int[][] create(int size) {
        // init of 2d array of desired size
        int[][] matrix = new int[size][size];

        // add number 0 for each column in each row exept when the row number and column number is equal
        for (int row = 0; row < matrix.length; row++){
            for (int column =0; column < matrix.length; column++){
               if (row==column){
                   matrix[row][column] = 1;
               } else {
                   matrix[row][column] = 0;
               }
            }
        }

        return matrix;

    }

    public static void print(int[][] matrix) {

        // prints each row
        for (int row =0;row< matrix.length;row++){
            // print each element in the row
            for (int column =0;column< matrix.length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            // next line between rows
            System.out.println();
        }
    }
}