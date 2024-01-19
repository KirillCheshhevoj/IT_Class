package Lesson_14;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        int x1 = 0;

        try {
            // спрацуе з двухбайтовым сімвалам, напрыклад русскім
            System.out.println("Enter the symbol: ");
            // System.in.skip(1); // ігрнарыроваць у патоке 1 байт
            System.in.skip(System.in.available());
            x1 = System.in.read();

            System.out.write(x1);
            System.out.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
