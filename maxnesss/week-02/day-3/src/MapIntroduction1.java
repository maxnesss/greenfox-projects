import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        // init
        HashMap<Integer, Character> testMap = new HashMap<>();
        // is empty?
        System.out.println(testMap.isEmpty());
        // add values
        testMap.put(97, 'a');
        testMap.put(98, 'b');
        testMap.put(99, 'c');
        testMap.put(65, 'A');
        testMap.put(66, 'B');
        testMap.put(67, 'C');
        // prints keys
        System.out.println(testMap.keySet());
        // prints values
        System.out.println(testMap.values());
        // add
        testMap.put(68,'D');
        // size
        System.out.println(testMap.size());
        // print 99
        System.out.println(testMap.get(99));
        // does 100 exist?
        System.out.println(testMap.containsKey(100));
        // empty
        testMap.clear();
        // size
        System.out.println(testMap.size());
    }
}
