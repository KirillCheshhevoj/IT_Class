package Lesson_10.model;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lesson_10.model.Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}
