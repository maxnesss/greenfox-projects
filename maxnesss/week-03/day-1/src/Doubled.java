import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Create a method called `decryptDoubled` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the duplicated-chars.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
public class Doubled {

    public static void main(String[] args) {
        decryptDoubled("assets/duplicatedChars.txt");
    }
    public static void decryptDoubled(String file){
        Path filePath = Paths.get(file);
        Path outputPath = Paths.get("assets/duplicatedChars-output.txt");
        List<String> lines = new ArrayList<>();
        List<String> output = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e){
            System.out.println("Can't read file");
        }
// remove extra letters
        for (String line:lines) {
            String newline= "";

            for (int letter = 0; letter < line.length(); letter++) {
                if (letter%2==0){
                    newline = newline + line.charAt(letter);
                }
            }
            output.add(newline);
        }
        try {
            Files.write(outputPath,output);
        } catch (IOException e){
            System.out.println("cant write file");
        }


    }



}