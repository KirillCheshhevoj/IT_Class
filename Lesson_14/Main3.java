package Lesson_14;

import java.io.IOException;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        byte[] arr1 = new byte[MAX_SIZE];
        int currentSize = 0;

        // лічыць з кансолі пакуль не зустренім сімвал '!' у массіў
        // байт і вывесці весь гэты массіў байт абратна на кансоль

        int tmp = 0;
        System.out.println("Enter symbol, the input is being completed '!'");
        try {
            tmp = System.in.read();
            while ((tmp = System.in.read()) != '!' && currentSize != MAX_SIZE) {
                arr1[currentSize++] = (byte) tmp;
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println(Arrays.toString(arr1));

        arr1 = Arrays.copyOf(arr1, currentSize);

        System.out.println(Arrays.toString(arr1));

        try {
            System.out.write(arr1);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
