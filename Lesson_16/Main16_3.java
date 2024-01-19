package Lesson_16;

import Lesson_16.model.Cat;
import Lesson_16.model.Cleaner;
import Lesson_16.model.Dog;
import Lesson_16.model.Huskey;
import Lesson_16.model.people.MyArrayList;
import Lesson_16.model.people.PersonGen;

public class Main16_3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Dog dog1 = new Dog("Rex");
        Huskey huskey1 = new Huskey("Tornado");
        Cleaner cleaner1 = new Cleaner("Xiaomi");

        PersonGen<Cat> person1 = new PersonGen<Cat>("Vitya", cat1);
        PersonGen<Dog> person2 = new PersonGen<>("Vasya", dog1);
        PersonGen<Huskey> person3 = new PersonGen<>("Vova", huskey1);
        PersonGen<Cleaner> person4 = new PersonGen<>("Vika", cleaner1);

        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add(cat1);
        myArrayList1.add(dog1);
        myArrayList1.add(huskey1);
        myArrayList1.add(cleaner1);
        myArrayList1.add(person1);
        myArrayList1.add(person2);
        myArrayList1.add(person4);

        myArrayList1.show();
    }
}
