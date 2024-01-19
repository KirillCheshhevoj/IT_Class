package Lesson_4.HomeTask;

import java.util.Scanner;

// Разработать консольное приложение, позволяющее находить корни квадратного
// уравнения. В качестве исходных данных ввести A, B, C.
// В результате вывести значения корней или соответствующее сообщение, если
// действительных корней нет.
public class Task3 {
    public static void main(String[] args) {
        int A, B, C;
        double discriminant;
        double x1, x2;
        final int COEFFICIENT = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        A = scanner.nextInt();

        System.out.print("Enter B: ");
        B = scanner.nextInt();

        System.out.print("Enter C: ");
        C = scanner.nextInt();

        discriminant = (Math.pow(B, 2) - 4 * A * C);

        if (discriminant > COEFFICIENT) {
            x1 = (-B + Math.sqrt(discriminant)) / 2 * A;
            x2 = (-B - Math.sqrt(discriminant)) / 2 * A;
            System.out.println("x1 and x2: " + x1 + ", " + x2);
        } else if (discriminant == COEFFICIENT) {
            x1 = x2 = -B / (2 * A);
            System.out.println("x1 = x2: " + x1);
        } else {
            System.out.println("Not");
        }
    }
}
