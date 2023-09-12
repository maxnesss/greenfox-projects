import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex11 {
    public Map<String,Long> countWords(String text) {
        Map<String, Long> wordCount = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        return wordCount;
    }
    public List<Map.Entry<String, Long>> makeList(String text) {
        Map<String,Long> countW = countWords(text);

        // List<Map.Entry<String, Long>> listOfEntries = countW.entrySet().stream().sorted(Comparator.comparingLong(Map.Entry::getValue)).toList();
        List<Map.Entry<String, Long>> listOfEntries = countW.entrySet().stream().sorted(Comparator.comparingLong(Map.Entry::getValue)).toList();


        return listOfEntries;

    }
}
