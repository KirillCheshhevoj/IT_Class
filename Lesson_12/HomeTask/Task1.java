package Lesson_12.HomeTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            int a = 10;
            int b = scanner.nextInt();
            System.out.println("a / b = " + a / b);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
