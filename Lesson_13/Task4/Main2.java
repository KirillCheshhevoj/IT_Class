package Lesson_13.Task4;

import Lesson_13.Task4.model.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        final int MAX_SIZE = 100;
        Employee[] employees = new Employee[MAX_SIZE];
        int currentSize = 0;
        // try with resources аўтаматычна закрые рэсурс рэалізуе інтэрфейс AutoCloseable
        try (Scanner scanner = new Scanner(new File("D:\\Java\\It_class\\Main\\src\\Lesson_13\\Task4\\in4.txt"))){

            while (scanner.hasNextLine() && currentSize < MAX_SIZE) {
                String fileLine = scanner.nextLine();
                String[] fields = fileLine.split(" ");
                employees[currentSize++] =
                        new Employee(fields[0], Double.parseDouble(fields[1]));
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }

        employees = Arrays.copyOf(employees, currentSize);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
