package Lesson_15.Task4.model;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String fieldsToFileLine() {
        String person = name + " " + age + " " + salary;
        return person;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if (name.compareTo(person.name) != 0) return name.compareTo(person.name);
        if ((age - person.age) != 0) return age - person.age;
        return (int) (salary - person.salary);

    }
}