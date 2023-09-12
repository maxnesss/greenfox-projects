package amigoscode;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // filter
        List<Person> females = people.stream()
                .filter(a -> a.getGender().equals(Gender.FEMALE))
                .toList();
        // females.forEach(System.out::println);
        // sort
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .toList();

        // sortedList.forEach(System.out::println);
        // match all
        Boolean match = people.stream()
                .allMatch(person -> person.getAge()>10);
//        System.out.println(match);
        Boolean anymatch =people.stream()
                .anyMatch(person -> person.getName().equalsIgnoreCase("max"));
//        System.out.println(anymatch);

        //max age
//        people.stream()
//                .max(Comparator.comparingInt(Person::getAge)).ifPresent(System.out::println);

        Optional<Person> oldestP= people.stream()
                .max(Comparator.comparingInt(Person::getAge));

//        oldestP.ifPresent(System.out::println);

        Map<Gender, List<Person>> group = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));


        System.out.println(group);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Max",34,Gender.MALE),
                new Person("Mark",56,Gender.MALE),
                new Person("Kate",24,Gender.FEMALE),
                new Person("Richard",16,Gender.MALE),
                new Person("Elizabeth",78,Gender.FEMALE),
                new Person("Ella",2,Gender.FEMALE),
                new Person("Max",34,Gender.MALE)
        );
    }
}
