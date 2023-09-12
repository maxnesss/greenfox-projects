import java.util.Arrays;
import java.util.Scanner;

public class PalindromBuilder {
    public static void main(String[] args) {
        // interface
        System.out.println("Your input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(build(input));
    }
    public static String build(String inputString){
        String result = inputString;

        //coverts to char array
        char[] original = inputString.toCharArray();

        // revert the array
        for(int i = 0; i < original.length / 2; i++) {
            char temp = original[i];
            original[i] = original[original.length - i - 1];
            original[original.length - i - 1] = temp;
        }

        // loop for adding reverted array to original word
        for (int letter = 0; letter < original.length; letter++){
            result += original[letter];
        }




        return result;
    }
}
