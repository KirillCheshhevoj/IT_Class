package Lesson_14.HomeTask.Task2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String FILE_OUT = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\HomeTask\\Task2\\out2.txt";
        final int MAX_SIZE = 50;
        byte[] arr1 = new byte[MAX_SIZE];
        int currentSize = 0;
        int tmp = 0;
        System.out.println("Enter the characters, the end of the input is the character 'F': ");
        try (FileOutputStream fos = new FileOutputStream(FILE_OUT)) {
            tmp = System.in.read();
            while (tmp != 'F' && currentSize != MAX_SIZE) {
                arr1[currentSize++] = (byte) tmp;
                tmp = System.in.read();

            }
            arr1 = Arrays.copyOf(arr1, currentSize);
            fos.write(arr1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
