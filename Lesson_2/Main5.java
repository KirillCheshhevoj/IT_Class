package Lesson_2;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] arr1 = null; // стварылі спасылку на анднамерны масіў, масіў яшчэ не створан

        final int SIZE1 = 6;
        arr1 = new int[SIZE1];

        // пры стварэнні масіваў без ініцыалізацыі
        // запалняюцца лікавамі - нулямі
        // сімвальные - пустымі сімваламі
        // boolean - false
        // масіў спасылак -  null

        // яшчэ прыклад масіва
        int[] arr2 = new int[10];
        int arr3[] = new int[5]; // для С
        int[] arr4 = new int[]{3, 7, 9, -4}; // стварэнне з ініцыалізацыей
        int[] arr5 = {3, 7, 9, -4}; // стварэнне з ініцыалізацыей
        // int[] arr6 = new int[3]{3, 6, 8} // памылка

        // arr3.length public final int поле
        System.out.println("Length arr3 = " + arr3.length);

        arr3[0] = 6; // выклік па індэксу
        // 0 - індэкс першага, length - 1 - індэкс апошняга

        System.out.println("arr4: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(i + 1 + ") " + arr4[i]);
        }
        System.out.println();

        System.out.println("arr5: ");
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(i + 1 + ") " + arr5[i] + " ");
        }

        System.out.println("arr4: ");
        System.out.println(Arrays.toString(arr4));

        Arrays.sort(arr4);
        System.out.println("Sorting massive: ");
        System.out.println(Arrays.toString(arr4));
    }
}
