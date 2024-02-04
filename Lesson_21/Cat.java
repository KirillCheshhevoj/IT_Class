package Lesson_21;

import java.util.Objects;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Cat cat = (Cat) o;
        if (age != cat.age) return false;
        return name != null ? name.equals(cat.name) : cat.name == null;
    }
}
