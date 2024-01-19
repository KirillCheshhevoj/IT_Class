package Lesson_15.Task1;

import java.io.*;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        final String OUTPUT_FILE = "D:\\Java\\It_class\\Main\\src\\Lesson_15\\Task1\\array.txt";
        int[] arr1 = new int[SIZE];

        int min = -50, max = 50;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println(Arrays.toString(arr1));

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (int item : arr1) { // item = arr1[i]
                bw.write(item * 2 + " ");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        int[] arr2 = new int[SIZE];
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(OUTPUT_FILE))) {

            int tmp = 0;
            String tmpArray = br.readLine().trim(); // while((tmpArray = br.readLine()) != null)
            String[] values = tmpArray.split(" ");
            for (String value : values) {
                if ((tmp = Integer.parseInt(value)) > 0) {
                    arr2[index++] = tmp;
                }
            }

            arr2 = Arrays.copyOf(arr2, index);
            System.out.println(Arrays.toString(arr2));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
