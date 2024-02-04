package Lesson_24._02_operations;

import Lesson_23._01_begin.model.Breed;
import Lesson_23._01_begin.model.Cat;
import Lesson_23._01_begin.model.CatComparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Cat> cats2 = List.of(
                new Cat("Cat1", Breed.SIBERIAN, 2),
                new Cat("Cat2", Breed.SIAM, 1),
                new Cat("Cat3", Breed.GARBAGE, 3),
                new Cat("Cat4", Breed.SIAM, 2),
                new Cat("Cat5", Breed.SIBERIAN, 1),
                new Cat("Cat6", Breed.SIAM, 1)
        );

//        System.out.println(cats.stream().allMatch(it -> it.getAge() < 10));
//        System.out.println(cats.stream().allMatch(it -> it.getAge() == 3));

//        System.out.println(cats.stream().anyMatch(it -> it.getAge() == 3));

//        Stream<Cat> unionStream = Stream.concat(cats.stream(), cats2.stream());
//        System.out.println(unionStream.count());
//
//        System.out.println(unionStream.distinct().count());
//
//        cats.stream().filter(it -> it.getName().length() > 5 && it.getAge() > 3);
//        Cat firstCat = cats.stream()
//                .filter(it -> it.getAge() == 1)
//                .findFirst()
//                .orElse(new Cat("noname", Breed.GARBAGE, 0));
//        System.out.println(firstCat);
//
//        cats.stream().forEach(System.out::println);
//
//        cats.stream().skip(2).limit(2).forEach(System.out::println);
//
//        Optional<Cat> max = cats.stream().min(new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        System.out.println(max);
//
//        cats.stream().map(it -> it.getName()).forEach(System.out::println);
//        Stream<String> stringStream = Stream.of(
//                null,
//                "One",
//                null,
//                "Two"
//        );
//        cats.stream().map(Cat::getName).forEach(System.out::println);
//
//        Stream<String> stringStream1 = Stream.ofNullable(null);
//
//        Stream<Cat> st1 = cats.stream()
//                .filter(it -> it.getAge() == 3);
//        st1.forEach(System.out::println);
//        System.out.println(st1.count());

        Optional<Integer> reduce1 = cats.stream()
                .map(Cat::getAge)
                .reduce(Integer::sum);
        System.out.println(reduce1.get());

        Optional<String> reduce2 = cats.stream()
                .map(Cat::getName)
                .reduce(String::concat);
        System.out.println(reduce2.get());

        int indentity = 1;
        Integer reduce3 = cats.stream().map(Cat::getAge).reduce(indentity, (x, y) -> x * y);
        System.out.println(reduce2);

        String indentity1 = "";
        String reduce4 = cats.stream().map(Cat::getName).reduce(indentity1, String::concat);
        System.out.println(reduce4);

        cats.stream()
                .filter(it -> it.getAge() < 3)
                .collect(Collectors.toCollection(HashSet::new));
        Map<String, Integer> collect1 = cats.stream()
                .collect(Collectors.toMap(Cat::getName, Cat::getAge));
        System.out.println(collect1);
    }
}
