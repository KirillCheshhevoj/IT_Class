package Lesson_14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        final String FILE_OUT = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\out5.txt";
        FileInputStream fis = null;
        final int MAX_SIZE = 100;
        byte[] arr1 = new byte[MAX_SIZE];
        int i = 0, tmp = 0;

        // FileOutputStream fos = new FileOutputStream(FILE_OUT);
        // пры адсутнасці файла, файл будзе створан, пры наяўнасці будзе
        // выдален стары файл з такім іменем і створан новы


        // FileOutputStream fos = new FileOutputStream(FILE_OUT, true);
        // пры такім створэнні патока, пры наяўнасці файла з такім іменем будзе
        // ажыццяўляцца дазапісь у файл
        try (FileOutputStream fos = new FileOutputStream(FILE_OUT)) {

            System.out.println("Enter symbol: ");
            while ((tmp = System.in.read()) != '!' && i < MAX_SIZE) {
                arr1[i++] = (byte) tmp;
            }
            arr1 = Arrays.copyOf(arr1, i);

            fos.write(arr1);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
