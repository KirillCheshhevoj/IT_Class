package Lesson_31_multytread._06_interrupt;

import lombok.SneakyThrows;

public class MyRunnable implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {
                System.out.println("Running");
                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    return;
                }
            } else {
                return;
            }
        } while (true);
    }
}
