//Create a function named isAnagram() following your current language's style guide.
// It should take two strings and return a boolean value depending on whether it's an anagram or not.
//
//        The function should ignore the letter case as well as any non (latin) letter characters,
//        i.e. "Astronomer" is an anagram of "Moon starer!"
//
//        Examples
//
//        input 1	input 2	output
//        "dog"	"god"	true
//        "green"	"fox"	false



//lowecase
// remove spaces and special characters
// if length != same ---- it's not an anagram
// compare each letter with each letter with Array class

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        //interface
        System.out.println("Input 1: ");
        Scanner scanner = new Scanner(System.in);
        String inputOne = scanner.nextLine();
        System.out.println("Input 2: ");
        String inputTwo = scanner.nextLine();
        //end of interface

        System.out.println(isAnagram(inputOne, inputTwo));
    }
    public static boolean isAnagram(String wordOne, String wordTwo){
        // removes spaces and special characters
        wordOne = wordOne.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        wordTwo = wordTwo.replaceAll("[^a-zA-Z]+", "").toLowerCase();


        // if length is not same it is not an anagram
        if (wordOne.length() != wordTwo.length()){
            return false;
        }
        //sort words alphabetically and compare
        if (sortWord(wordOne).equals(sortWord(wordTwo))){
            return true;
        }

        return false;

    }

    public static String sortWord(String input){
        char[] ar = input.toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }
}
