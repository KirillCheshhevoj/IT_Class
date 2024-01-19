package Lesson_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int x1 = scanner.nextInt();

        if (x1 > 0) {
            x1++;
        } else if (x1 < 0) {
            x1 -= 2;
        } else {
            x1 = 20;
        }

        System.out.println("x1 = " + x1);

        boolean flag = false;
        if (x1 == 0) {
            x1 = 20;
        } else {
            flag = true;
            if (x1 > 0) {
                x1++;
            } else {
                x1 -= 2;
            }
        }
    }
}
