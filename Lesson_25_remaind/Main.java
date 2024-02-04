package Lesson_25_remaind;

import Lesson_25_remaind.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Lesson_25_remaind.utils.CompetitionUtils.*;

public class Main {
    public static void main(String[] args) {
//        Genus cat = Genus.of("cat");
//        System.out.println(cat.getClass().getSimpleName() + " " + cat);

        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Map<String, String> errors = new HashMap<>();

        parseFile(cats, dogs, errors);

//        cats.forEach(System.out::println);
//        System.out.println("---------------------------");
//        dogs.forEach(System.out::println);
//        System.out.println("---------------------------");
//        errors.forEach((k, v) -> System.out.print(k + " : " + v));
//        System.out.println("---------------------------");

        printResult(cats, dogs);
        List<Cat> sortedCats = sortByBirthDate(cats);
        List<Dog> sortedDogs = sortByBirthDate(dogs);
        printResult(cats, dogs);

        List<Cat> youngCats = filterAnimals(sortedCats, true);
        List<Dog> youngDogs = filterAnimals(sortedDogs, true);
        List<Cat> oldCats = filterAnimals(sortedCats, false);
        List<Dog> oldDogs = filterAnimals(sortedDogs, false);

        printResult(youngCats, youngDogs, oldCats, oldDogs, errors);
    }
}