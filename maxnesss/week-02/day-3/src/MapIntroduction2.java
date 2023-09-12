import java.util.Arrays;
import java.util.HashMap;


public class MapIntroduction2 {
    public static void main(String[] args) {
        // init
        HashMap<String, String> testMap = new HashMap<>();
        // add
        testMap.put("978-1-60309-452-8", "A Letter to Jo");
        testMap.put("978-1-60309-459-7", "Lupus");
        testMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        testMap.put("978-1-60309-461-0", "The Lab");
        // print
        for (String i : testMap.keySet() ){
            System.out.println(i + " " + testMap.get(i));
        }
        // Remove the key-value pair with key 978-1-60309-444-3
        testMap.remove("978-1-60309-444-3");


        // remove the lab
        for (String i : testMap.keySet()){
            if (testMap.get(i).equals("The Lab")){
                testMap.remove(i);
            }
        }
        // add
        testMap.put("978-1-60309-450-4","They Called Us Enemy");
        testMap.put("978-1-60309-453-5","Why Did We Trust Him?");
        //does 478-0-61159-424-8 exist?
        System.out.println(testMap.containsKey("478-0-61159-424-8"));
        // Print the value associated with key 978-1-60309-453-5
        System.out.println(testMap.get("978-1-60309-453-5"));

        System.out.println(testMap);

    }
}
