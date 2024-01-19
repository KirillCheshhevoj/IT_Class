package Lesson_14.HomeTask.Task5;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String FILE_IN = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\HomeTask\\Task4\\in4.txt";
        final String FILE_OUT = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\HomeTask\\Task5\\out5.txt";
        final int MAX_SIZE = 100;
        byte[] arr1 = new byte[MAX_SIZE];
        int currentSize = 0, tmp;

        try (
                FileOutputStream fos = new FileOutputStream(FILE_OUT);
                FileInputStream fis = new FileInputStream(FILE_IN);
                BufferedReader bufReader = new BufferedReader(new FileReader(FILE_IN))) {

            while ((tmp = fis.read()) != -1 && currentSize < MAX_SIZE) {
                if (tmp >= 'A' && tmp <= 'Z') {
                    tmp += 32;
                    arr1[currentSize++] = (byte) tmp;
                    fos.write(tmp);


                } else if (tmp == '\n') {
                    fos.write(tmp);

                } else {
                    tmp = 32;
                    fos.write(tmp);
                }
            }
            arr1 = Arrays.copyOf(arr1, currentSize);
            System.out.println(Arrays.toString(arr1));


        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}