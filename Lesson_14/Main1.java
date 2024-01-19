package Lesson_14;

import java.io.IOException;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(System.in.getClass().getName());

        System.out.write(65);
        System.out.flush();
        System.out.println("------------------");
        for (int i = 0; i < 128; i++) {
            System.out.write(i);
        }
        System.out.flush();
        System.out.println("------------------");

        byte[] arr1 = {65, 67, 69};
        try {
            System.out.write(arr1);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("------------------");
        String str1 = "абв";
        byte[] arr2 = str1.getBytes();
        System.out.println(Arrays.toString(arr2));
        try {
            System.out.write(arr2);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
