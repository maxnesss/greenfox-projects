import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadDataToObj {

    public List<Item> readData() throws IOException {
        Path path = Paths.get("src/data.csv");
        List<Item> items = new ArrayList<>();

        List<String> lines = Files.readAllLines(path);

        for (String line: lines) {
            items.add(new Item(line.split(",")[0],line.split(",")[1],line.split(",")[2],line.split(",")[3]));
        }
        return items;
    }

}
