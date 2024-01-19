package Lesson_16;

import Lesson_16.model.Cat;
import Lesson_16.model.Cleaner;
import Lesson_16.model.Dog;
import Lesson_16.model.Huskey;
import Lesson_16.model.people.*;

public class Main16 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Dog dog1 = new Dog("Rex");
        Huskey huskey1 = new Huskey("Tornado");
        Cleaner cleaner1 = new Cleaner("Xiaomi");

        CatEnjoyer person1 = new CatEnjoyer("Vitya", cat1);
        DogEnjoyer person2 = new DogEnjoyer("Vasya", dog1);
        HuskeyEnjoyer person3 = new HuskeyEnjoyer("Vova", huskey1);
        CleanerEnjoyer person4 = new CleanerEnjoyer("Vika", cleaner1);

        person1.getFavouriteObject().sleep();
        person2.getFavouriteObject().guard();
        person3.getFavouriteObject().destroy();
        person4.getFavouriteObject().vaccum();

        System.out.println("------------------");

        PersonObj[] people = {
                new PersonObj("Vitya", cat1),
                new PersonObj("Vasya", dog1),
                new PersonObj("Vova", huskey1),
                new PersonObj("Vika", cleaner1)
        };

        for (PersonObj person : people) {
            System.out.println(person);
        }

        System.out.println("------------------");
        if (people[0].getFavouriteObject() instanceof Cat)
            ((Cat) people[0].getFavouriteObject()).sleep();
        if (people[1].getFavouriteObject() instanceof Cat)
            ((Cat) people[1].getFavouriteObject()).sleep();
    }
}
