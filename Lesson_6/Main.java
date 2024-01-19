package Lesson_6;

import Lesson_6.model.Person;
import Lesson_6.model.Student;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        //ClassLoader создал объект класса class Person
        Person person1 = new Person("Ivan", 45);

        WeakReference<Person> s1 = new WeakReference<>(person1);
        //person1 = null;
        System.gc();//попытка запустить в работу garbage collector

        Class clazz;
        clazz = Person.class;
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
        System.out.println(clazz.getClassLoader());

        clazz = person1.getClass();

        //доступ к полю по его названию getDeclaredField
        Field field = clazz.getDeclaredField("age");
        //field = person1.getClass().getDeclaredField("age");
        field.setAccessible(true);
        field.set(person1, 70);
        System.out.println(person1);

        Method method = clazz.getDeclaredMethod("toString");
        method.setAccessible(true);
        method.invoke(person1);

        Object object = person1;

        if (object.getClass() == Person.class) {
            System.out.println("В ссылке object объект класса Person");
        }

        if (person1.getClass() == Person.class) {
            System.out.println("В ссылке person1 объект класса Person");
        }

        Student student1 = new Student("Vasya", 45, 5.0);

        if (student1.getClass() == Student.class) {
            System.out.println("В ссылке student1 объект класса Student");
        }

        //getClass не определит принадлежность к подклассу
//        if (student1.getClass() == Person.class) {
//            System.out.println("В ссылке student1 объект класса Person");
//        }

        if (student1 instanceof Student) {
            System.out.println("объект по ссылке student1 соответсвует типу Student");
        }

        if (student1 instanceof Person) {
            System.out.println("объект по ссылке student1 соответсвует типу Person");
        }

        if (student1 instanceof Object) {
            System.out.println("объект по ссылке student1 соответсвует типу Object");
        }


        person1.equals(student1);

    }
}
