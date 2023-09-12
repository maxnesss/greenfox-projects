// Modify this program to greet the User instead of the World!
// The program should ask for the name of the User
//
// Example:
//
// Please enter your name: John Doe
// Hello, John Doe!
//

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // new scanner input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scanner.nextLine();

        // prints input name
        System.out.println("Hello, " + name);

    }
}
