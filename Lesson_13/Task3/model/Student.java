package Lesson_13.Task3.model;

import Lesson_13.Task3.exception.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private String name;
    private double averagePoint;

    public Student(String name, double averagePoint) throws CreateStudentException {
        try {
            setName(name);
        } catch (IllegalArgumentException e) {
            throw new CreateStudentException(e.getMessage(), e);
        }
        try {
            setAveragePoint(averagePoint);
        } catch (IllegalArgumentException e) {
            throw new CreateStudentException(e.getMessage(), e);
        }
    }

    public void setName(String name) throws IllegalArgumentException {
        int minLength = 2;
        if (name.length() < minLength) throw new IncorrectNameException("The student's name is too short");
        if (name == null) throw new NullNameException("The name is missing");
        this.name = name;
    }

    public void setAveragePoint(double averagePoint) throws IllegalArgumentException {
        if (averagePoint > 10) throw new IncorrectAvgPointException("Not correct average mark");
        if (averagePoint < 0) throw new NegativeAvgPointException("Negative average mark");
        try {
            this.averagePoint = averagePoint;
        } catch (InputMismatchException e) {
            throw new IncorrectAvgPointException("Not correct average mark");
        }
    }

    public static Student getStudentFromConsole() throws CreateStudentException {
        Student student = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name student: ");
        String tmpName = scanner.nextLine();
        System.out.println("Enter average mark student: ");
        try {
            double tmpPoint = Double.parseDouble(scanner.nextLine());
            try {
                student = new Student(tmpName, tmpPoint);
            } catch (CreateStudentException e) {
                System.out.println(e.getMessage());
            }
        } catch (NumberFormatException e) {
            throw new CreateStudentException("Not correct average mark");
        }
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averagePoint=" + averagePoint +
                '}';
    }
}