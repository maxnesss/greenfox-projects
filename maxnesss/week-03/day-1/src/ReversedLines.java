import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Create a method called `decryptReversed` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the reversed-lines.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
public class ReversedLines {
    public static void main(String[] args) {
        decryptReversed("assets/reversedLines.txt");
    }

    private static void decryptReversed(String file) {
        Path path = Paths.get(file);
        Path outputPath = Paths.get("assets/reversedLinesOutput.txt");
        List<String> data = new ArrayList<>();
        List<String> reversedData = new ArrayList<>();

        try {
            data = Files.readAllLines(path);

        } catch (IOException e){
            System.out.println("Can't read file");
        }
        for (Object line:data){
            StringBuilder sb = new StringBuilder(line.toString());
            reversedData.add(sb.reverse().toString());

        }
        try{
            Files.write(outputPath,reversedData);
        } catch (IOException e){
            System.out.println("Can't write to file");
        }

    }
        }