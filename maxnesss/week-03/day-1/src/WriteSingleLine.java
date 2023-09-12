import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Write a program in the `main` method that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".
public class WriteSingleLine {
    public static void main(String[] args) {

        Path path = Paths.get("my-file.txt");
        String name = "My name is Max. ";

        try {


            Files.write(path, name.getBytes());
        } catch (IOException e){
            System.out.println("cant write");
        }


    }
}