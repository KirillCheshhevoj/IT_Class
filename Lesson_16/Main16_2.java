package Lesson_16;

import Lesson_16.model.Cat;
import Lesson_16.model.Cleaner;
import Lesson_16.model.Dog;
import Lesson_16.model.Huskey;
import Lesson_16.model.people.PersonGen;

public class Main16_2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Dog dog1 = new Dog("Rex");
        Huskey huskey1 = new Huskey("Tornado");
        Cleaner cleaner1 = new Cleaner("Xiaomi");

        // Дженерыкі дазваляюць атрымліваць памылкі неадпаведнасці тыпаў
        // падчас кампіляцыі. Разработчыку не трэба самастойна
        // рабіць праверку на адпаведнасць тыпу і выконваць
        // відавочнае пераўтварэнне для выкліку неабходнага метаду
        PersonGen<Cat> person1 = new PersonGen<Cat>("Vitya", cat1);
        System.out.println(person1);
        person1.getFavouriteObject().sleep();

        PersonGen<Dog> person2 = new PersonGen<>("Vasya", dog1);

        // raw type - сыры тып
        // створэнне аб'ектаў такім чынам лічацца прыкметай дрэннага тону
        PersonGen person3 = new PersonGen("Vova", huskey1);
        System.out.println(person3);
        ((Huskey) person3.getFavouriteObject()).destroy();

        PersonGen<Cleaner> person4 = new PersonGen<>("Vika", cleaner1);
        System.out.println(person4);
        person4.getFavouriteObject().vaccum();

        PersonGen<Cat> person5 = new PersonGen<>("Sasha", new Cat("Boris"));

        person1.greeting(person5);
    }
}
