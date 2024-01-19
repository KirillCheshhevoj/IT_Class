package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// Дан массив. Переписать его положительные элементы во второй массив, а
// остальные — в третий.
public class Task6 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        int[] positiveArray = null;
        int[] negativeArray = null;
        int counterPositive = 0, counterNegative = 0;
        int min = -5, max = 5;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
            if (array[i] <= 0) {
                counterNegative++;
            } else if (array[i] > 0) counterPositive++;
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        if (counterNegative != 0) {
            negativeArray = new int[counterNegative];
            for (int i = 0, n = 0; i < array.length; i++) {
                if (array[i] <= 0) {
                    negativeArray[n++] = array[i];
                }
            }
            System.out.println("Array negative:");
            System.out.println(Arrays.toString(negativeArray));
        } else System.out.println("Array not have negative number.");

        if (counterPositive != 0) {
            positiveArray = new int[counterPositive];
            for (int i = 0, n = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    positiveArray[n++] = array[i];
                }
            }
            System.out.println("Array positive:");
            System.out.println(Arrays.toString(positiveArray));
        } else System.out.println("Array not have positive number.");
    }
}
