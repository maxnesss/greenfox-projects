// Write a program which prompts the user for a double value
// specifying a distance in miles, converts that value
// to kilometers and prints it
//
// Example:
//
// Please enter a distance in miles: 1.8
// The distance in km: 2.88
//

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        //new scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in miles:");
        // user inputs miles
        double miles = scanner.nextDouble();

        // miles are converted to km
        double km = miles * 1.609344;

        //result is printed out
        System.out.println("And that is: " + km + " in Km");

    }
}
