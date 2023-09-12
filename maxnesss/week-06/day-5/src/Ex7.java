import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {


    public List<String> getCapitalsStartWith(Character character) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        List<String> result = cities.stream().filter(city ->city.startsWith(String.valueOf(character).toUpperCase())).toList();
        return result;

    }
}
