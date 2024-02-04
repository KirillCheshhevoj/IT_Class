package Lesson_23._01_begin.interfaces.impl;

import Lesson_23._01_begin.interfaces.Searchable;
import Lesson_23._01_begin.model.Breed;
import Lesson_23._01_begin.model.Cat;

public class BreedSearchable implements Searchable<Breed> {
    @Override
    public boolean test(Cat cat, Breed value) {
        return cat.getType().equals(value);
    }
}
