package Lesson_25_remaind.utils;

import Lesson_25_remaind.exceptions.CompetitionException;
import Lesson_25_remaind.model.*;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static Lesson_25_remaind.constants.CompetitionConstants.*;

@UtilityClass
public class CompetitionUtils {

    public static void parseFile(List<Cat> cats, List<Dog> dogs,
                                 Map<String, String> errors) {
        try (Scanner sc = new Scanner(new FileReader(PATH_TO_FILE))) {
            while (sc.hasNextLine()) {
                fillingCollection(sc.nextLine(), cats, dogs, errors);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf("File hasn't been found by path \"%s\"%n", PATH_TO_FILE);
            System.exit(1);
        }
    }

    private static void fillingCollection(String textLine, List<Cat> cats, List<Dog> dogs,
                                          Map<String, String> errors) {
        try {
            Animal animal = AnimalFactory.getInstance(textLine);
            if (animal instanceof Cat) {
                cats.add((Cat) animal);
            } else {
                dogs.add(((Dog) animal));
            }
        } catch (CompetitionException exception) {
            processException(errors, exception);
        }
    }

    private static void processException(Map<String, String> errors, CompetitionException exception) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(exception.getErrorLine());
        if (matcher.find()) {
            errors.put(matcher.group(), String.format("Error in string \"%s\" - %s%n", exception.getErrorLine(), exception.getCause().getMessage()));
        } else {
            System.out.printf(String.format("Error in string \"%s\" - %s%n", exception.getErrorLine(), exception.getCause().getMessage()));
        }
    }

    public static void printResult(List<Cat> cats, List<Dog> dogs) {
        System.out.println("Cats lis size: " + cats.size());
        printList(cats);
        System.out.println("Dogs lis size: " + dogs.size());
        printList(dogs);
    }

    private static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }

    public static <T> List<T> sortByBirthDate(List<T> animals) {
        return animals.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static <T extends Animal> List<T> filterAnimals(List<T> participants, boolean isYoung) {
        return participants.stream()
                .filter(isYoung ? YOUNG_PREDICATE : OLD_PREDICATE)
                .collect(Collectors.toList());
    }

    public static void printResult(List<Cat> youngCats, List<Dog> youngDogs,
                                   List<Cat> oldCats, List<Dog> oldDogs,
                                   Map<String, String> errors) {
        System.out.println("First day participants: ");
        printResult(youngCats, youngDogs);
        System.out.println("----------------------");
        System.out.println("Second day participants: ");
        System.out.println("Cats lis size: " + oldCats.size());
        printList(oldCats);
        System.out.println("Dogs lis size: " + oldDogs.size());
        printList(oldDogs);
        printMap(errors);
    }

    private static void printMap(Map<String, String> errors) {
        if (!errors.isEmpty()) {
            System.out.println("Errors quantity: " + errors.size());
            errors.forEach((k, v) -> System.out.println(k + " : " + v));
        }
    }
}
