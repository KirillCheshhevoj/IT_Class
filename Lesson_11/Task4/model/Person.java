package Lesson_11.Task4.model;

import Lesson_11.Task4.interfaces.IOwner;

public class Person implements IOwner {
    private String passportNumber;
    private String name;

    public Person(String name, String passportNumber) {
        this.passportNumber = passportNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (passportNumber != null ? !passportNumber.equals(person.passportNumber) : person.passportNumber != null)
            return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = passportNumber != null ? passportNumber.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "passportNumber='" + passportNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getOwnerNumber() {
        return passportNumber;
    }

    @Override
    public String getOwnerName() {
        return name;
    }
}
