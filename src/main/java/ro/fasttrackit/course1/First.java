package ro.fasttrackit.course1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ro.fasttrackit.course1.Person.PersonBuilder.person;

public class First {
    public static void main(String[] args) {
        immutabilityExercise();
        builderExercide();
        testShortcuts();
    }

    private static void immutabilityExercise() {
        List<Integer> grades = new ArrayList<>();
        grades.add(2);
        grades.add(8);
        grades.add(4);
        grades.add(6);
        Student student = new Student("Adam", 21, grades);
        System.out.println(student);
        grades.add(15);
        System.out.println(student);
    }

    private static void builderExercide() {
        Person person = person()
                .name("Andrei")
                .age(12)
                .build();
        System.out.println(person);
    }

    private static void testShortcuts() {
        System.out.println("Hello FastTrackIT!");

        if (true) {
            System.out.println("Ceva");
        }

        List<String> test = new ArrayList<>();
        test.add("test");
        test.add("test2");
        test.add("test3");
        test.add("test4");

        int cost = calculateCost("BigMac");
        if (cost > 10000) {
            System.out.println("Too Much");
        }
        int apple = calculateCost("Apple");
        Map<Integer, String> integerStringMap = bigMap();
    }

    private static Map<Integer, String> bigMap() {
        return new HashMap<>();
    }


    private static int calculateCost(String product) {
        return 1000;
    }
}
