import java.util.List;

public class Ex1 {


    public List<Integer> evenNumbs (List<Integer>numbList){
        List<Integer> evenNumbs;
        evenNumbs = numbList.stream().filter(a -> a%2==0).toList();
        return evenNumbs;
    }
}
