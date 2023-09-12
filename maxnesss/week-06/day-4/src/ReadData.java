import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadData {
    public String[][] data() throws IOException {
        Path path = Paths.get("src/data.csv");

        List<String> lines = Files.readAllLines(path);
        String[][] data = new String[lines.size()][4];

        for (int row = 0; row < lines.size(); row++) {
            for (int element = 0; element < lines.get(row).split(",").length; element++) {
                data[row][element] = lines.get(row).split(",")[element];
            }
        }
        return data;
    }
}
