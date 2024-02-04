package Lesson_23._01_begin.interfaces.impl;

import Lesson_23._01_begin.interfaces.Searchable;
import Lesson_23._01_begin.model.Cat;

public class AgeSearchable implements Searchable<Integer> {
    @Override
    public boolean test(Cat cat, Integer value) {
        return cat.getAge() == value;
    }
}
