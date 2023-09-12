import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {


    public String makeString(List<Character> characterList) {
        String result = characterList.stream()
                .map(String::valueOf).collect(Collectors.joining());
        return result;
    }
}
