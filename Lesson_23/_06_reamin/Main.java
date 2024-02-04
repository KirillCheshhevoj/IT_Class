package Lesson_23._06_reamin;

import Lesson_23._01_begin.model.Breed;
import Lesson_23._01_begin.model.Cat;
import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("Cat1", Breed.SIBERIAN, 2),
                new Cat("Cat2", Breed.SIAM, 1),
                new Cat("Cat3", Breed.GARBAGE, 3),
                new Cat("Cat4", Breed.SIAM, 2),
                new Cat("Cat5", Breed.SIBERIAN, 1),
                new Cat("Cat6", Breed.SIAM, 1)
        );

        List<Cat> sibCats = getSiberian(cats);
        System.out.println(sibCats);


        Predicate<Cat> siberianCats = cat -> cat.getType().equals(Breed.SIBERIAN);
        List<Cat> streamList = cats.stream().
                filter(siberianCats).
                collect(Collectors.toList());
        System.out.println(streamList);

        List<String> getCatsNames = cats.stream().map(Cat::getName).collect(Collectors.toList());

        cats.stream().forEach(System.out::println);

        List<String> getCatsNames1 = cats.stream().map(Cat::getName).collect(Collectors.toList());
        System.out.println(getCatsNames1);
    }

    private static List<Cat> getSiberian(List<Cat> cats) {
        List<Cat> newList = new ArrayList<>();
        for (Cat cat : cats) {
            if (cat.getType().equals(Breed.SIBERIAN)) {
                newList.add(cat);
            }
        }
        return newList;
    }
}
