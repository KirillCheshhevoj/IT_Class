package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// Дан массив. Все элементы массива расположить в обратном порядке.
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min = -5, max = 5;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        System.out.println("Reverse massive:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
