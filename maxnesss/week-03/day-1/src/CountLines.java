
// Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(countLines("assets/pokemon.csv"));


    }
    public static int countLines(String filePath){
        Path pathToFile = Paths.get(filePath);
        List<String> lines = new ArrayList<>();
        int numberOfLines = 0;

        try{
            lines = Files.readAllLines(pathToFile);
            numberOfLines = lines.size();
        } catch (IOException exeption){
            return 0;

        }

        return numberOfLines;
    }
}
