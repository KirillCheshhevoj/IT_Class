package Lesson_15.Task5.model;

public abstract class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public String fieldsToFileLine() {
        String person = getClass().getSimpleName() + " " + name + " " + age;
        return person;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}