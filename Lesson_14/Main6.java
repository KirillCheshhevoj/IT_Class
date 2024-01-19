package Lesson_14;

import java.io.*;

public class Main6 {
    public static void main(String[] args) {
        final String FILE_IN = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\in6.txt";
        final String FILE_OUT = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\out6.txt";
        final int MAX_SIZE = 100;
        byte[] arr1 = new byte[MAX_SIZE];
        int i = 0, tmp = 0;

        try (FileInputStream fis = new FileInputStream(FILE_IN);
             FileOutputStream fos = new FileOutputStream(FILE_OUT)) {

            // fos.write(fis.readAllBytes());
            // лічыць адразу ўсе байты патоку fis ў масисв байт
            // і запіша ўвесь гэты масив байт ў струмень fos

            // перазапіша толькі тое, што з'яўляецца лічбай

            fos.write(fis.readAllBytes());
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
