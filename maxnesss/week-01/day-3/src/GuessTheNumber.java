import java.util.Scanner;

// Write a program that stores a number and the user has to figure it out.
// The user can input guesses. After each guess the program responds
// with a message indicating whether the stored number is smaller or
// greater than the guess.
// The program ends (exits) when the user finds the stored number
//
// Example:
//
// Please enter your guess: 3
// The stored number is greater than 3
// Please enter your guess: 10
// The stored number is smaller than 10
// Please enter your guess: 8
// You have found the stored number 8
//
public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNumber = 8;
        Scanner scanner = new Scanner(System.in);
        int guessNumber = 9;

        while (guessNumber != storedNumber) {
            System.out.println("Please enter your Guess:");
            guessNumber = scanner.nextInt();

            if (storedNumber > guessNumber) {
                System.out.println("The stored number is grater than " + guessNumber);
            } else if (storedNumber < guessNumber) {
                System.out.println("The stored number is smaller than " + guessNumber);
            } else {
                System.out.println("You have found the stored number");
            }
        }
    }
}