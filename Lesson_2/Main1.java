package Lesson_2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int val1 = scanner.nextInt();
        System.out.println("val1: " + val1);

        System.out.println("Enter double number: ");
        double val2 = scanner.nextDouble();
        System.out.println("val2: " + val2);

        // scanner.next(); счітает із потока
        scanner.skip("\n");

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("name: " + name);

        // scanner.close(); Закрываем System.in
    }
}
