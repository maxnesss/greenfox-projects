package ex12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Character> charList = new Database().database;

        charList.stream().sorted(Comparator.comparing(Character::getMass)).limit(1).forEach(System.out::println);

        OptionalDouble averageHeightM = charList.stream()
                .filter(p->p.getGender().equals("male"))
                .filter(p-> !Objects.equals(p.getHeight(), "unknown"))
                .map(Character::getHeight)
                .map(Integer::valueOf)
                .mapToInt((p)->p)
                .average();
        averageHeightM.ifPresent(System.out::println);

        OptionalDouble averageHeightF = charList.stream()
                .filter(p->p.getGender().equals("female"))
                .filter(p-> !Objects.equals(p.getHeight(), "unknown"))
                .map(Character::getHeight)
                .map(Integer::valueOf)
                .mapToInt((p)->p)
                .average();
        averageHeightF.ifPresent(System.out::println);

        Map<String,Long> sorted = charList.stream().collect(Collectors.groupingBy(Character::getGender,Collectors.counting()));
        System.out.println(sorted);


    }
}
