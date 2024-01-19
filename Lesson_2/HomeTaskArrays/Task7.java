package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// Даны 2 массива. Получить третий массив из отрицательных элементов первого,
// кратных трем, и четных положительных элементов второго. Полученный массив
// отсортировать по убыванию.
public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3;
        int counter = 0;
        int min = -5, max = 5;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (max - min + 1) + min);
            if (array1[i] < 0 && (array1[i] % 3 == 0)) counter++;
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * (max - min + 1) + min);
            if (array2[i] > 0 && (array2[i] % 2 == 0)) counter++;
        }

        System.out.println("Array1:");
        System.out.println(Arrays.toString(array1));

        System.out.println("Array2:");
        System.out.println(Arrays.toString(array2));

        if (counter == 0) {
            System.out.println("Not found number.");
        } else {
            array3 = new int[counter];
            int index = 0;

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] < 0 && (array1[i] % 3 == 0)) {
                    array3[index++] = array1[i];
                }
            }

            for (int i = 0; i < array2.length; i++) {
                if (array2[i] > 0 && (array2[i] % 2 == 0)) {
                    array3[index++] = array2[i];
                }
            }

            for (int i = 0; i < array3.length; i++) {
                int tmp;
                for (int j = 0; j < array3.length - 1 - i; j++) {
                    if (array3[j] < array3[j + 1]) {
                        tmp = array3[j];
                        array3[j] = array3[j + 1];
                        array3[j + 1] = tmp;
                    }
                }
            }

            System.out.println("Array3:");
            System.out.println(Arrays.toString(array3));
        }
    }
}
