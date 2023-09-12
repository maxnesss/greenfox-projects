import java.util.List;

public class Ex3 {


    public List<Integer> squareBiggerThan20 (List<Integer> numbs){
        List<Integer> result;
        result = numbs.stream().filter(n -> (n*n)>20).toList();
        return result;
    }
}
