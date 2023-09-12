import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        // init
        ArrayList<String> listA = new ArrayList<>();
        // add Apple, Avocado, Blueberries, Durian, Lychee
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        // creates list b and copy list a into it
        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);
        // does list a contain Durian
        System.out.println(listA.contains("Durian"));
        // remove durian from list B
        listB.remove("Durian");
        // add kiwi to list a ti 4th element
        listA.add(4,"Kiwifruit");
        //compare size
        System.out.println(listA.size()>listB.size());
        //index of avocado
        System.out.println(listA.indexOf("Avocado"));
        // index of durian in listB
        System.out.println(listB.indexOf("Durian"));
        // Add "Passion Fruit" and "Pomelo" to List B in a single statement
        listB.addAll(Arrays.asList("Passion fruit", "Pomelo"));
        //3rd element of list a
        System.out.println(listA.get(2));
        // print listA
        System.out.println(listA);
        // print listB
        System.out.println(listB);
    }
}
