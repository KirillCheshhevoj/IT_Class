package Lesson_4.model;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person() {
        // выклік канструктара гэтага класа
        // ў пачатку кода канструктара
        name = "Sasha";
        age = 30;
        salary = 550.0;
        // іншы код пісаць далей можна
    }

    public void info() {
        System.out.println("Name: " + name +
                ", age: " + age +
                ", salary: " + salary);
    }

    // this - спыслыка на аб'ект, які вызывае метад
    // this() - выклік канструктара гэтага класа
    public Person(String name, int age, double salary) {
        // this(); нельга
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, int age) {
        this(name, age, 0.0);
    }
}
