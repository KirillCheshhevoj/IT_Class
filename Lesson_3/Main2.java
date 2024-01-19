package Lesson_3;

import Lesson_3.by_itclass.model.Animal;

public class Main2 {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object);

        Animal animal = new Animal();
        // animal.color даступна толькі то, што public
        animal.info();
    }
}
