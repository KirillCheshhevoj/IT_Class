package Lesson_12.HomeTask;

public class Task8 {
    public static void main(String[] args) {
        try {
            a();
        } catch (ArithmeticException exception) {
            System.out.println("Main.a() -> ArithmeticException");
        }
        System.out.println("The program is completed successfully:)))");
    }

    static void c() throws ArithmeticException {
        try {
            int p = 0 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("method C");
            throw exception;
        }
    }

    static void b() {
        try {
            Task8.c();
        } catch (ArithmeticException exception) {
            System.out.println("method B");
            throw exception;
        }
    }

    static void a() {
        try {
            Task8.b();
        } catch (ArithmeticException exception) {
            System.out.println("method A");
            throw exception;
        }
    }
}
