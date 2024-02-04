package Lesson_23._01_begin;

import Lesson_23._01_begin.interfaces.Searchable;
import Lesson_23._01_begin.interfaces.impl.AgeSearchable;
import Lesson_23._01_begin.interfaces.impl.BreedSearchable;
import Lesson_23._01_begin.model.Breed;
import Lesson_23._01_begin.model.Cat;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

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
        System.out.println(getByBreedNumber(cats, Breed.SIBERIAN));
        System.out.println(getByAgeNumber(cats, 3));
        System.out.println("--------------------------");
        System.out.println(getByConditionNumber(cats, new BreedSearchable(), Breed.SIBERIAN));
        System.out.println(getByConditionNumber(cats, new AgeSearchable(), 3));
        System.out.println("--------------------------");
        System.out.println(getByConditionNumber(cats, new Searchable<Breed>() {
            @Override
            public boolean test(Cat cat, Breed value) {
                return cat.getType().equals(value);
            }
        }, Breed.SIBERIAN));
        System.out.println(getByConditionNumber(cats, new Searchable<Integer>() {
            @Override
            public boolean test(Cat cat, Integer value) {
                return cat.getAge() == value;
            }
        }, 3));
        System.out.println("---------------------------------------");
        System.out.println(getByConditionNumber(cats, ((cat, value) -> cat.getType().equals(value)), Breed.SIBERIAN));
        System.out.println(getByConditionNumber(cats, ((cat, value) -> cat.getAge() == value), 3));
    }

    private static int getByBreedNumber(List<Cat> cats, Breed breed) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getType().equals(breed)) {
                result++;
            }
        }
        return result;
    }

    private static int getByAgeNumber(List<Cat> cats, int age) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getAge() == age) {
                result++;
            }
        }
        return result;
    }

    private static <T> int getByConditionNumber(List<Cat> cats, Searchable<T> function, T value) {
        int result = 0;
        for (Cat cat : cats) {
            if (function.test(cat, value)) {
                result++;
            }
        }
        return result;
    }
}
