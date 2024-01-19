package Lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, -4, 0, 8, 10};
        int[] arr2 = new int[4];
        int[] arr3 = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter " + (i + 1) + " the element: ");
            arr2[i] = scanner.nextInt();
        }
        System.out.println("arr2: ");
        System.out.println(Arrays.toString(arr2));

        // Math - класс з статычнымі матыматычнамі матедамі
        // Math.random() = double [0..1)
        // Math.random()*100 = [0..100)
        int min = -50, max = 50;
        int x = (int) (Math.random() * (max - min + 1) + min); // [-50..50]

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("arr3:");
        System.out.println(Arrays.toString(arr3));

    }
}
