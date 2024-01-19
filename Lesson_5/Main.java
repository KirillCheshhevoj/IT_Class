package Lesson_5;

import Lesson_5.model.Person;
import Lesson_5.model.Student;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 45);
        System.out.println(person1.info());
        person1.greeting();
        person1.greeting("Kolya");
        Student student1 = new Student();
        System.out.println(student1.info());

        System.out.println("-----------------");
        System.out.println(person1); // person1.toString();
        System.out.println(student1);

        Person person2 = person1.createClone();

        System.out.println("------------");
        // upcast захоўвання аб'екта ў пасылке класса выше іерархіі
        // (бяспека) віден канстэкст Object, Person
        Person studRef = student1;
        System.out.println(studRef);

        // downcast спроба захоўвання аб'екта на пасылке класса ніжэй
        // па іерархіі (небяспечна)
        // Student perRef = (Student) person1;
        // perRef.getUniversity();

        Person[] people = {
                new Person(),
                new Student(),
                new Student("Grisha", 21, "GSU", 5.0)
        };

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("---------");
        Object[] objects = {
                "Gosha",
                8,
                3.6,
                new Person(),
                new Student()
        };

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
