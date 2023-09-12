import java.util.List;
import java.util.function.Consumer;

public class Ex2 {


    public List<Integer> squaresOfPossitives(List<Integer> numbs){
        List<Integer> squaresOfPositives;
        squaresOfPositives = numbs.stream().filter(p -> p>0).map(p -> p*p).toList();
        return squaresOfPositives;


    }
}
