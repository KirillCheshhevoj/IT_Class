package Lesson_31_multytread._02_order;

import lombok.SneakyThrows;

public class JoinRunnable extends Thread {
    public JoinRunnable(String name) {
        super(name);
    }

    @SneakyThrows
    @Override
    public void run() {
        String currThreadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(currThreadName + " is running! " + i);
            Thread.sleep(500);
        }
        System.out.println(currThreadName + " completed");
    }
}
