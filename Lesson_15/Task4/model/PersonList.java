package Lesson_15.Task4.model;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PersonList {
    private final int SIZE = 5;
    private Person[] people = new Person[SIZE];
    private int currentSize = 0;


    public void addPerson(Person person) {
        if (person != null) {
            if (currentSize == people.length) {
                people = Arrays.copyOf(people, people.length * 3 / 2 + 1);
            }
            people[currentSize++] = person;
        }

    }

    public void showInfo() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(people[i]);
        }
    }

    public void deletePerson(int index) {
        if (index >= 0 && index < currentSize) {
            System.arraycopy(people, index + 1, people, index, currentSize - index - 1);
            currentSize--;

        }
    }

    public void showPersonByIndex(int index) {
        if (index >= 0 && index < currentSize) {
            System.out.println(people[index]);
        }
    }

    public void loadPersonFromFile(String fileName) {
        final String DELIMITER = " ";

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNext()) {
                String fileLine = scanner.nextLine();
                String[] values = fileLine.split(DELIMITER);
                addPerson(new Person(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2])));
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    public void saveToFile(String fileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < currentSize; i++) {
                pw.println(people[i].fieldsToFileLine());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void sortPeople() {
        people = Arrays.copyOf(people, currentSize);
        Arrays.sort(people);
    }
}
