package Lesson_8.exam3;

import Lesson_8.exam3.model.Cat;
import Lesson_8.exam3.model.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzil", "white");
        System.out.println(cat1);
        cat1.wagTail();

        System.out.println("-------------------------");

        Dog dog1 = new Dog("Rex", "red");
        System.out.println(dog1);
        dog1.wagTail();

        // магчымасць створэння аб'екта адкрытага ўнутранага класса
        Dog.DogTail dt1 = dog1.new DogTail("yellow");
        System.out.println(dog1);
        dt1.wag();

        Dog.DogTail dt2 = new Dog().new DogTail();
        dt2.wag();
    }
}
