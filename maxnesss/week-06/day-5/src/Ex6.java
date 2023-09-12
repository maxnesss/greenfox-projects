import java.util.Arrays;
import java.util.List;

public class Ex6 {

    public List<String> listAllUppercaseChars (String text) {
        List<String> result;
        result = Arrays.stream(text.split("")).filter(a->a.equals(a.toUpperCase())).toList();
        return result;
    }
}
