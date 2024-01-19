package Lesson_12.HomeTask;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, x1 = 10, x2, index, res1, res2;
        String tmpStr, resStr = "";
        int[] arr = null;
        System.out.println("Enter size of array: ");
        try {
            tmpStr = String.valueOf(scanner.nextInt());
            size = Integer.parseInt(tmpStr);
            arr = new int[size];
            System.out.println("Enter x2: ");
            x2 = scanner.nextInt();
            res1 = x1 / x2;
            System.out.println("Enter index element of array: ");
            index = scanner.nextInt();
            arr[index] = res1;
            res2 = arr[index] * 2;
            resStr = (res2 != 0) ? "Not null value" : resStr;
            System.out.println(resStr.toUpperCase(Locale.ROOT));
        } catch (InputMismatchException | NegativeArraySizeException | ArithmeticException |
                 ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception);
            exception.printStackTrace();
        }
        try {
            System.out.println(resStr.charAt(35));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
