import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
        // init of list
        ArrayList<String> names = new ArrayList<>();
        // size of names list
        System.out.println(names.size());
        //add
        names.add("William");
        //is empty
        System.out.println(names.isEmpty());
        //add
        names.add("John");
        names.add("Amanda");
        // size
        System.out.println(names.size());
        // loop for printing each element
        for (int element = 0; element< names.size(); element++) {
            System.out.println(element + 1 + ": " + names.get(element));
        }
        // remove element
        names.remove(1);
        // print reversed
        for (int element = names.size()-1; element >= 0; element--){
            System.out.println(names.get(element));
        }
        // remove all elements
        names.clear();
        // size
        System.out.println(names.size());




    }
}
