package Lesson_13.Task3;

import Lesson_13.Task3.exception.CreateStudentException;
import Lesson_13.Task3.model.Student;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = Student.getStudentFromConsole();
            System.out.println(student);
        } catch (CreateStudentException e) {
            e.printStackTrace();
        }
    }
}
