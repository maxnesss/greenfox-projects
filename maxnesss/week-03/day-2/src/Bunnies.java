// We have a number of bunnies and each bunny has two big floppy ears. Write
// a recursive method (no loops or multiplication) which takes the number of
// bunnies as its sole parameter and returns the total number of ears
// the bunnies have. The method should be able to handle invalid input
// (e.g. negative numbers)

public class Bunnies {
    public static void main(String[] args) {
        System.out.println(numberOfEars(123));

    }
    public static int numberOfEars (int bunnies){

            if (bunnies <= 1) {
                return 2;
            } else {
                int bunnyHasEars = 2;
                return bunnyHasEars + numberOfEars(bunnies - 1);
            }


    }

}
