package Lesson_23._01_begin.interfaces;

import Lesson_23._01_begin.model.Cat;
@FunctionalInterface
public interface Searchable<T> {
    boolean test(Cat cat, T value);
}
