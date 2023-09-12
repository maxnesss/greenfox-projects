package cab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CAB cab = new CAB();
        System.out.println(cab.getNumber());
        Scanner scanner = new Scanner(System.in);



        while (cab.getGameState().equals("playing")){
            System.out.println("your guess");
            System.out.println(cab.guess(scanner.next()));
        }

    }
}
