package Lesson_14.HomeTask.Task1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String FILE_OUT = "D:\\Java\\It_class\\Main\\src\\Lesson_14\\HomeTask\\Task1\\out.txt";
        String str = "Cheshhevoj Kirill Arturovich";
        byte[] arr = str.getBytes();

        try (FileOutputStream fos = new FileOutputStream(FILE_OUT)) {
            int i = 0;
            while (arr[i] != ' ') {
                fos.write(arr[i++]);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
