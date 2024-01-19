package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// В массиве найти значение и индекс наибольшего из отрицательных элементов.
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean isNegativeNumberHere = false;
        int count = 0;
        int indexMax = 0;
        int min = -5, max = 5;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length && !isNegativeNumberHere; i++) {
            if (array[i] < 0) {
                if (array[i] < 0) {
                    count = array[i];
                    indexMax = i;
                    isNegativeNumberHere = true;
                }
            }
        }

        if (!isNegativeNumberHere) {
            System.out.println("Massive not have negative number.");
        } else {
            for (int i = 0; i < args.length; i++) {
                if (array[i] < 0 && array[i] > count) {
                    count = array[i];
                    indexMax = i;
                }
            }
        }

        System.out.println("Count max negative number of massive: " + count);
        System.out.println("Index max negative number of massive: " + indexMax);
    }
}
