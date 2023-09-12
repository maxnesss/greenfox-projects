import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Create a function `writeLines` that takes 3 parameters: a path, a word and a number.
    // The function should write multiple lines into a file.
    // - The path parameter should be a string that describes the location (path & name)
    //    of the file you wish to write.
    // - The word parameter should also be a string that will be written to the file as individual lines.
    // - The number parameter should describe how many times the function should write the word in the file.
    // Example:
    // If the word is "apple" and the number is 5, it should write 5 lines
    // into the file and each of the should be "apple".
    // The function should not raise any errors, but print the "Unable to write file: <path>"
    // error message instead.
public class WriteMultipleLines {
        public static void main(String[] args) {
            writeLines("multiline.txt", "Max", 5);

        }
        public static void writeLines(String pathtoFile, String text, int numberOf){
            Path path = Paths.get(pathtoFile);
            List<String> content = new ArrayList<>();
            for (int i = 0; i < numberOf; i++) {
                content.add(text);
            }


            try {
                Files.write(path, content);
            } catch (IOException e){
                System.out.println("Unable to write file" + path);
            }
        }


}