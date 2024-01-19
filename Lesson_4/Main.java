package Lesson_4;

import Lesson_4.model.Animal;
import Lesson_4.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.info();
        Person person2 = new Person("Igor", 50, 500.0);
        person2.info();
        person2 = null;
        new Person("Vasya", 20, 600.0).info(); // аб'ект
        // створаны, але спасылкі няма


        System.out.println("------------------");
        Animal animal1 = new Animal();
        animal1.info();
        Animal animal2 = new Animal("Murzik", 6);
        animal2.info();

        System.out.println(Animal.getCounterID());
    }
}
