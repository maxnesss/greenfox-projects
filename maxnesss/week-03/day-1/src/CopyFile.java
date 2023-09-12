import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Write a `copy` function that copies the contents of a file into another file.
    // The function should take two filenames (strings) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows whether the copy was successful or not.
public class CopyFile {
        public static void main(String[] args) {
            copyFile("my-file.txt", "my-file2.txt");

        }
        public static boolean copyFile(String sourceFile, String targetFile){
            Path sourcePath = Paths.get(sourceFile);
            Path targetPath = Paths.get(targetFile);

            List<String> data = new ArrayList<>();

            try {
                data = Files.readAllLines(sourcePath);

            } catch (IOException e){
                System.out.println("Can't read the file");
                return false;
            }

            try {
                Files.write(targetPath,data);
            } catch (IOException e){
                System.out.println("can't write file");
                return false;
            }
            return true;


        }
}