import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Write a method `getUniqueIpAddresses` which accepts a path to `log.txt`
        // as a parameter and returns an array of unique IP addresses.
        // Write a method `getRequestRatio` which accepts a path to `log.txt`
        // as a parameter and returns the ratio of GET to POST requests.
        // If the specified file cannot be found the methods should return an empty
        // array and 0.0 respectively (and raise no errors).
        // Change the path of the log.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
public class Logs {
    public static void main(String[] args){
        System.out.println(String.join(System.lineSeparator(), getUniqueIpAddresses("assets/log.txt")));
        System.out.println(getRequestRatio("assets/log.txt"));
    }

    public static String getRequestRatio(String file){
        Path path = Paths.get(file);
        List<String> data = new ArrayList<>();

        try {
            data = Files.readAllLines(path);
        } catch (IOException e){
            System.out.println("Can't read file");
        }

        int post = 0;
        int get = 0;
        for (String line: data){
            System.out.println(line.split("   ")[2].split(" ")[0]);
            if ((line.split("   ")[2].split(" ")[0]).equals("POST")){
                post++;
            }
            else {
                get++;
            }

        }
        double ratio= 0.0;
        if (post>get){
            ratio = (double) post /get;
        } else {
            ratio = (double) get/post;
        }
        return "post: " + post + "get: " +get + " and the ratio is: " + ratio;





    }
    public static String[] getUniqueIpAddresses(String file) {
        Path path = Paths.get(file);
        List<String> data = new ArrayList<>();
        List<String> ipAdresses = new ArrayList<>();
        HashMap<String, String> inAdressss = new HashMap<>();
        try {
            data = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Can't read");
        }
        for (String line : data) {
            ipAdresses.add(line.split("   ")[1]);
            inAdressss.put(line.split("   ")[1], "");
        }
        System.out.println(inAdressss.keySet().size());
        String[] keys = inAdressss.keySet().toArray(new String[inAdressss.keySet().size()]);

        return keys;
    }


}