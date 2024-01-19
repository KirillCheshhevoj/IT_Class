package Lesson_15.Task5.model;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PersonList {
    final int INITIAL_SIZE = 3;
    private Person[] people = new Person[INITIAL_SIZE];
    private int currentIndex = 0;

    public void add(Person person) {
        if (person != null) {
            if (currentIndex == people.length) {
                people = Arrays.copyOf(people, people.length * 3 / 2 + 1);
            }
            people[currentIndex++] = person;
        }
    }

    public void loadFromFile(String fileName) {
        final String FIELDS_SEPARATOR = " ";
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNext()) {
                String fileLine = scanner.nextLine().trim();
                String[] fields = fileLine.split(FIELDS_SEPARATOR);
                switch (fields[0]) {
                    case "Employee":
                        add(new Employee(fields[1], Integer.parseInt(fields[2]),
                                Double.parseDouble(fields[3])));
                        break;
                    case "Student":
                        add(new Student(fields[1], Integer.parseInt(fields[2]),
                                Double.parseDouble(fields[3])));
                        break;
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public void saveToFile(String fileName)
    {
        try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){

            for (int i = 0; i < currentIndex; i++) {
                pw.println(people[i].fieldsToFileLine());
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void sortByName() {
        people = Arrays.copyOf(people, currentIndex);
        Arrays.sort(people);
    }

    public void show() {
        System.out.println("People list: ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(people[i]);
        }
    }
}
