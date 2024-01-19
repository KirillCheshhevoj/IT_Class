package Lesson_2.HomeTaskArrays;

import java.util.Arrays;

// Дан двумерный массив. Отсортировать строки двумерного массива по
// возрастанию их сумм элементов
public class Task8 {
    public static void main(String[] args) {
        int size1 = 5, size2 = 5, min = -10, max = 10, sum = 0;
        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                array[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size1; i++) {
            System.out.println(Arrays.toString(array[i]));
            for (int j = 0; j < size2; j++) {
                sum += array[i][j];
            }
            System.out.print("Sum: " + sum);
        }

        int[] sumArray = new int[size1];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                sum += array[i][j];
            }
            sumArray[i] = sum;
            sum = 0;
        }
        System.out.println("Massive sum line: ");
        System.out.println(Arrays.toString(sumArray));

        int[] tmp;
        int tmpNumber = 0;
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray.length - 1 - i; j++) {
                if (sumArray[i] > sumArray[i + 1]) {
                    tmpNumber = sumArray[j];
                    sumArray[j] = sumArray[j + 1];
                    sumArray[j + 1] = tmpNumber;

                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
        }

        System.out.println("Sorting massive sum lines: ");
        System.out.println(Arrays.toString(sumArray));

        System.out.println("Sorting massive number: ");
        for (int i = 0; i < size1; i++) {
            System.out.println(Arrays.toString(array[i]));
            int sum1 = 0;
            for (int j = 0; j < size2; j++) {
                sum1 += array[i][j];
            }
            System.out.println("Sum: " + sum1);
            System.out.println();
        }
    }
}
