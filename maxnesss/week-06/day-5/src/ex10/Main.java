package ex10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static List<Fox> foxList = new Foxes().getFoxList();
    public static void main(String[] args) {
        System.out.println(getMap());

    }
    public static List<String> getGreenFoxes () {
        List<String> greenFoxes = foxList.stream()
                .filter(p -> p.getColor().equals("green")).map(Fox::toString).toList();
        return greenFoxes;
    }
    public static List<String> getGreenYoungFoxes () {
        List<String> greenYoungFoxes = foxList.stream()
                .filter(p -> p.getColor().equals("green")).filter(p ->p.getAge()<4).map(p->p.toString()).toList();
        return greenYoungFoxes;
    }
    public static String getMap () {
        Map<Object, Long> map =foxList.stream()
                .collect(Collectors.groupingBy(p-> p.getColor().toUpperCase(), Collectors.counting()));
        return map.toString();
    }

}
