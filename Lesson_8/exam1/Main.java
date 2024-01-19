package Lesson_8.exam1;

import Lesson_8.exam1.model.Flat;
import Lesson_8.exam1.model.Person;

public class Main {
    public static void main(String[] args) {
        Flat flat1 = new Flat("Sovetskaya 1");

        Person person1 = new Person("Vasya", flat1);
        Person person2 = new Person("Masha", flat1);

        System.out.println(person1);
        System.out.println(person2);

        Person person3 = new Person("Igor", new Flat("Lenina 1"));
        Flat flat2 = person3.getRegFlat();

        person1 = null;
        person2 = null;
        person3 = null;

        System.out.println(flat1);
        System.out.println(flat2);
    }
}
