package Lesson_12.HomeTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = scanner.nextInt();
        try {
            System.out.println("a/b = " + a / b);
        } catch (InputMismatchException | ArithmeticException exception) {
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
