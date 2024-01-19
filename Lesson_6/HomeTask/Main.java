package Lesson_6.HomeTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 4;
        Person[] people = new Person[SIZE];
        people[0] = new Student("Vasiliy", 5.5, 778.5);
        people[1] = new Student("Milena", 8.2, 150);
        people[2] = new Employee("Boris", 900);
        people[3] = new Employee("Ivan", 1500);

        Person[] students = Arrays.copyOfRange(people, 0, 2);
        Person[] employees = Arrays.copyOfRange(people, 2, people.length);

        //вывод списка всех людей
        for (Person person : people) {
            System.out.println(person.toString());
        }
        //средний доход студентов
        System.out.println("Average month income of students = " + Person.getAverageMonthlyIncome(students));
        //средний доход работников
        System.out.println("Average month income of employees = " + Person.getAverageMonthlyIncome(employees));
        //люди равные студенту Vasiliy
        for (int i = 1; i < people.length; i++) {
            if (people[i].equals(people[0])) {
                System.out.println(people[i].toString());
            }

        }
    }

}
