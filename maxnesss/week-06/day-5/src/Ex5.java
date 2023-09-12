import java.util.List;

public class Ex5 {


    public Integer countOdd(List<Integer> numbs) {
        return numbs.stream().filter(a -> a%2 !=0).reduce(0,Integer::sum);
    }
}
