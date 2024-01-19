package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// Дан массив. Найти сумму элементов с четными номерами и отдельно – с
// нечетными номерами.
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumPositive = 0, sumNegative = 0;
        int min = -5, max = 5;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumPositive += array[i];
            } else {
                sumNegative += array[i];
            }
        }

        System.out.println("Sum of positive index massive: " + sumPositive);
        System.out.println("Sum of negative index massive: " + sumNegative);
    }
}
