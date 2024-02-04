package Lesson_31_multytread._02_order;

public class Main {
    private static boolean running;
    private static String string;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // while (!running) {}
            System.out.print("You ");
        });

//        var t2 = new Thread(() -> {
//            running = true;
//            System.out.println("I love");
//        });

        t1.start();
//        t2.start();
//        t1.start();
    }
}
