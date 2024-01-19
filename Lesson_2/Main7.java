package Lesson_2;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int[] arr3 = new int[10];
        int min = -50, max = 50;
        int x = (int) (Math.random() * (max - min + 1) + min); // [-50..50]

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("arr3:");
        System.out.println(Arrays.toString(arr3));

        System.out.println("Positive number of massive");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > 0)
                System.out.print(arr3[i] + " ");
        }

        // цыкл for each
        System.out.println("\nArray output for each");
        for (int item : arr3) { // item - тып як у элемента масіва
            // item = arr3[i]; схована унытры
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("Negative number of massive");
        for (int item : arr3) {
            if (item < 0) {
                System.out.print(item + " ");
            }
        }

        System.out.println();
        // праз for each нельга зменяць эляменты масіва прымітыўных дадзенных
        for (int item : arr3) {
            item = 0;
        }
        System.out.println(Arrays.toString(arr3));

        // Стварылі новы масіў у памяці, які на 5 эляментаў
        // больш і змяшчае копіі 10 элямантаў з arr3
        int[] arr4 = Arrays.copyOf(arr3, arr3.length + 5);

        System.out.println(Arrays.toString(arr4));

        // int[] arr5 = arr3; ствараецца не копія, а спасылка на ўжо
        // існуючы масіў arr3

        // выдаліць элямент масіва
        int indDel = 3;
        System.arraycopy(arr4, indDel + 1,
                arr4, indDel,
                arr4.length - indDel - 1);
        System.out.println("After delete");
        System.out.println(Arrays.toString(arr4));
    }
}
