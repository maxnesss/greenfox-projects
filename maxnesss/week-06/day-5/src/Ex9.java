import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex9 {
    public Map<String,Long> countLetters(String text) {
        Map<String, Long> charCount = text.codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return charCount;
    }
}
