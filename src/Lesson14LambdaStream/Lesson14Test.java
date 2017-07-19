package Lesson14LambdaStream;

import java.util.*;

/**
 * Created by ADMIN on 19.07.2017.
 */
public class Lesson14Test {
    public static void main(String[] args) {
        //Task 1
        System.out.printf("Task 1. Average of numbers in list%n%n");

        Collection<Integer> intList = Arrays.asList(5, 15, 23, 13, 4, 3, 10, 25, 25);
        double av5 = intList.stream().filter((i) -> i % 2 != 0 && i % 5 == 0).mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(av5);

        //Task 2
        System.out.printf("%nTask 2. Average of numbers in list%n%n");

        Collection<String> stringList = Arrays.asList("String1", "String123", "String465", "String1789", "String17456", "String10124",
                "String1", "String41", "String7561", "String41", "String145", "String123", "String17", "String145", "String197");
        long countUniqueWords = stringList.stream().filter((s) -> s.length() > 8).distinct().count();
        System.out.println(countUniqueWords);

        //Task 3
        System.out.printf("%nTask 3. Values in map%n%n");

        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 6; i < 16; i++) {
            myMap.put("KeyMp" + i, i);
        }
        List<Integer> listSummary = new ArrayList<>();
        myMap.forEach((id, val) -> {
            System.out.println(id + " " + val);
            if (id.length() < 7){
                listSummary.add(val);
            }
        });

        System.out.println("");
        int sum = listSummary.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Summary of all values with keys length less than 7: " + sum);

        //Task 4
        System.out.printf("%nTask 4. Concatenate numbers%n%n");

        Collection<Integer> strList = Arrays.asList(5, 2, 4, 2, 1);
        Optional<String> reducedString = strList.stream().map((val) -> val.toString()) .reduce((s1, s2) -> s1 + s2);
        reducedString.ifPresent(System.out::println);

        //Task 5
        System.out.printf("%nTask 5. Print full name%n%n");

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Nakhimov", 50));
        persons.add(new Person("Evgeniy", "Petrov", 19));
        persons.add(new Person("Ivan", "Ivanov", 69));
        persons.add(new Person("Alexander", "Reut", 40));
        persons.add(new Person("Alexey", "Reva", 47));
        persons.add(new Person("Nikolay", "Sidorov", 23));
        persons.add(new Person("Sergey", "Maximov", 35));

        Person agedPerson = persons.stream()
                .filter((el) -> (el.getFirstName() + " " + el.getLastName()).length() <= 15)
                .max(Comparator.comparing(Person::getAge)).get();
        System.out.println("Person: " + agedPerson.getFirstName() + " " + agedPerson.getLastName() + ". Age: " + agedPerson.getAge());

    }
}

