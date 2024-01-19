package Lesson_15.Task3.model;

import java.io.*;

public class Person {
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
        final String separator = " "; // delimiter
        String person = name + separator + age + separator + salary;
        return person;
    }

    public static Person loadPersonFromFile(String fileName) {
        Person person = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String objString = br.readLine().trim();
            String[] fields = objString.split(" ");
            person = new Person(fields[0], Integer.parseInt(fields[1]), Double.parseDouble(fields[2]));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return person;
    }

    public static void savePersonToFile(String fileName, Person person) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            bw.write(person.fieldsToFileLine());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
