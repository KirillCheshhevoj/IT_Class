package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// В массиве произвольных чисел положительные элементы уменьшить в двое, а
// отрицательные элементы заменить на значения их индексов.
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = -50, max = 50;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] /= 2;
            }
            if (array[i] < 0) {
                array[i] = i;
            }
        }

        System.out.println("New array:");
        System.out.println(Arrays.toString(array));
    }
}
