package Lesson_10.model;

import java.util.Comparator;

public class PersonCountryComparator implements Comparator<Person1> {
    @Override
    public int compare(Person1 person1, Person1 person2) {
        return person1.getCountry().compareTo(person2.getCountry());
    }
}
