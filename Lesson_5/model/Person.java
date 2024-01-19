package Lesson_5.model;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("None", 0);
    }

    public Person createClone() {
        Person person = new Person(this.name, this.age);
        return person;
    }

    public void greeting() {
        System.out.println("Hi");
    }

    public void greeting(String name) {
        System.out.println("Hi, " + name);
    }

    protected void greeting(Person person) {
        System.out.println("Hi, " + person.name);
    }

    public int greeting(String name, int age) {
        System.out.println("Hi, " + name);
        return (this.age - age);
    }

    public String info() {
        String personInfo = "[Person]Name: " + name + ", age: " + age;
        return personInfo;
    }

    // абстрактны метад - метад без рэалізаціі
    // public abstract double income();
    // калі есць адзін абстрактны метад у классе, то і класс
    // абавязкова трэба пазначыць як абстракны
    // абстрактныя классы ня могут спараджаць аб'екты
    // класс,які наследует ад абстрактнага абавязкова трэба перавызначыць
    // усе абстрактныя метады базавага абстрактнага класса
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
