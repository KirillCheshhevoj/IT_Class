package Lesson_14.HomeTask.Task3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        final String FILE_IN = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\HomeTask\\Task3\\in2.txt";
        int stringAmount = 0, symbolAmount = 0;
        final int MAX_SIZE = 100;
        byte[] arr1 = new byte[MAX_SIZE];
        int currentSize = 0, tmp;


        try (BufferedReader bufReader = new BufferedReader(new FileReader(FILE_IN));
             FileInputStream fis = new FileInputStream(FILE_IN)) {
            String line;
            while ((line = bufReader.readLine()) != null) {
                stringAmount++;
            }
            while ((tmp = fis.read()) != -1 && currentSize < MAX_SIZE) {
                arr1[currentSize++] = (byte) tmp;
            }

            symbolAmount = currentSize;

            System.out.println(Arrays.toString(arr1));
            System.out.println("Amount of strings in file: " + stringAmount);
            System.out.println("Amount of symbols: " + symbolAmount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
