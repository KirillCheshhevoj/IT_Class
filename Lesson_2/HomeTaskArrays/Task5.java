package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// Дан массив. Определить среднее арифметическое кратных 5 и некратных 10.
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        double average = 0.0;
        int count = 0;
        int min = -50, max = 50;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 10 != 0) {
                count++;
                sum += array[i];
            }
        }

        if (sum == 0) {
            System.out.println("In massive not have number division 5 and 10");
        } else {
            average = (double) sum / count;
        }

        System.out.println("Average value: " + average);
    }
}
