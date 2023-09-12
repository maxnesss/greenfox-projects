package ex12;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Character> database = new ArrayList<>();
    public Database() {
        this.database = getDatabase();

    }
    private List<Character> getDatabase() {
        Path path = Paths.get("data.txt");
        List<Character> dtb = new ArrayList<>();
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Can't find the file");
        }

        for (String line:lines) {
            String[] words = line.split(";");

            dtb.add(new Character(words[0],words[1],words[2],words[3],words[4],words[5],words[6],words[7]));
        }
        return dtb;
    }
}
