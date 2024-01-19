package Lesson_10;

import Lesson_10.model.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Integer[] arr1 = {4, -5, 9, 3, 10, 0};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"Grisha", "Vasya", "Katya", "Valera"};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Person[] arr3 = {new Person("Vitya"), new Person("Andrei")};
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        Person1[] arr4 = {
                new Person1("Grisha", "Russia", 1990),
                new Person1("Andrei", "Russia", 1985),
                new Person1("Grisha", "Belarus", 1980),
                new Person1("Alex", "Belarus", 1998),
                new Person1("Grisha", "Belarus", 1975)
        };

        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("-----------------");

        for (Person1 person1 : arr4) {
            System.out.println(person1);
        }
        Arrays.sort(arr4);

        System.out.println("Sorting: ");
        for (Person1 person1 : arr4) {
            System.out.println(person1);
        }

        Arrays.sort(arr4, Comparator.reverseOrder());
        System.out.println("Reversing: ");
        for (Person1 person1 : arr4) {
            System.out.println(person1);
        }

        System.out.println("Sorting for country: ");
        // створыў аб'ект класса, які рэалізуе інтэрфейс Comparator для
        // параўнання па странам
        PersonCountryComparator pcc = new PersonCountryComparator();
        Arrays.sort(arr4, pcc);
        for (Person1 person1 : arr4) {
            System.out.println(person1);
        }

        System.out.println("Sorting for birth year: ");
        PersonBirthYearComparator pbc = new PersonBirthYearComparator();
        Arrays.sort(arr4, pbc);
        for (Person1 person1 : arr4) {
            System.out.println(person1);
        }

        System.out.println("Sorting for year name: ");
        Arrays.sort(arr4, new Comparator<Person1>() {
            @Override
            public int compare(Person1 person1, Person1 person2) {
                return person1.getName().compareTo(person2.getName());
            }
        });

        for (Person1 person1 : arr4) {
            System.out.println(person1);
        }

        System.out.println("Sorting for country and birth year: ");
        Comparator<Person1> cmpCB = new PersonBirthYearComparator().thenComparing(new PersonBirthYearComparator());
        Arrays.sort(arr4, cmpCB);
        for (Person1 person1 : arr4) {
            System.out.println(person1);
        }

        System.out.println("-----------------------------------");
        Person1 person1 = new Person1("Ivan", "Russia", 1992);
        Person1 person2 = (Person1) person1.clone();
        System.out.println(person1);
        System.out.println(person2);

        Flat flat1 = new Flat("Sovetskaya", person1);
        Flat flat2 = (Flat) flat1.clone();

        System.out.println("-----------------------------------");
        Flat[] flats = {
                new Flat("Sovetskaya 68", arr4[0]),
                new Flat("Lenina 54", arr4[1]),
                new Flat("Sovetskaya 68", arr4[2])
        };

        System.out.println("Array of apartments: ");
        for (Flat flat : flats) {
            System.out.println(flat);
        }

        Arrays.sort(flats);
        System.out.println("Sorting compareTo array of apartments");
        for (Flat flat : flats) {
            System.out.println(flat);
        }
    }

}
