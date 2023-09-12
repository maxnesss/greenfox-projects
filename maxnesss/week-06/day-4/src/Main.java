import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadData readData = new ReadData();

        System.out.println(Arrays.deepToString(readData.data()));

        ReadDataToObj readDataToObj = new ReadDataToObj();
        System.out.println(readDataToObj.readData());
    }
}
