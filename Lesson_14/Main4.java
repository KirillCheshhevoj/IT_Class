package Lesson_14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {

        final String FILE_IN = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\in4.txt";
        FileInputStream fis = null;
        final int MAX_SIZE = 100;
        byte[] arr1 = new byte[MAX_SIZE];
        int i = 0, tmp = 0;

        try {
            fis = new FileInputStream(FILE_IN);

            while ((tmp = fis.read()) != -1 && i < MAX_SIZE) {
                arr1[i++] = (byte) tmp;
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }

        arr1 = Arrays.copyOf(arr1, i);

        try {
            System.out.write(arr1);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
