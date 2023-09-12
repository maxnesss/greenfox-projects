import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Create a method called `decryptReversed` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the reversed-order.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
public class ReversedOrder {
    public static void main(String[] args) {
        decryptReversed("assets/reversed-order.txt");
    }
    public static void decryptReversed(String file){
        Path path = Paths.get(file);
        Path outputPath = Paths.get("assets/reversedOrderOutput.txt");
        List<String> data = new ArrayList<>();

        try{
            data = Files.readAllLines(path);
        } catch (IOException e){
            System.out.println("Can't read file");
        }
        Collections.reverse(data);
        try{
            Files.write(outputPath, data);
        } catch (IOException e){
            System.out.println("Can't write to file");
        }



    }


}