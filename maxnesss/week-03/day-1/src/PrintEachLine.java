        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file to separate lines on the console.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

        public class PrintEachLine {
    public static void main(String[] args) {
        String path = "my-file.txt";
        Path pathtoFile = Paths.get(path);
        List<String> lines = new ArrayList<>();

        try{
            lines = Files.readAllLines(pathtoFile);
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException exeption){
            System.out.println("Unable to read file: " + pathtoFile);
        }

    }
}