import java.util.List;
import java.util.OptionalDouble;

public class Ex4 {
    public Double average(List<Integer> numbs){
        OptionalDouble result;
        result = numbs.stream().mapToInt((p) -> p).average();


        if (result.isPresent()){
            return result.getAsDouble();

        }
        return null;
    }
}
