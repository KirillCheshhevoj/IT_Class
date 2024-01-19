package Lesson_17_18_19._03_set;

import java.util.*;

public class Main {

    private static class Box {
        Cat cat;

        public Cat getCat() {
            return cat;
        }

        public void setCat(Cat cat) {
            this.cat = cat;
        }
    }
    public static void main(String[] args) {
        Set<Cat> set = new HashSet();
        Cat cat1 = new Cat("Barsik", 2, "Petia");
        Cat cat2 = new Cat("Murzik", 3, "Vasya");
        set.add(cat1);
        set.add(cat2);


        System.out.println(set);
        cat2.setName("Mashka");
        set.remove(cat2);
        System.out.println(set);

        Set<Integer> intSet = new HashSet<>(3);
        System.out.println(intSet.add(1));
//        intSet.add(4);
//        intSet.add(3);
//        intSet.add(2);
        intSet.add(16);
//        intSet.add(5);
        System.out.println(intSet.add(16));
        System.out.println(intSet.add(1));
//        System.out.println(intSet);
    }

    private static Cat getCat(Set<Cat> cats, String name) {
        for (Cat cat : cats) {
            if (name.equals(cat.getName())) {
                return cat;
            }
        }
        return null;
    }
}
