package Lesson_31_multytread._05_stop;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var myRunnable = new MyRunnable();
        var thread = new Thread(myRunnable);
        thread.start();
        Thread.sleep(10 * 1000);
        myRunnable.doStop();
        //thread.stop();
    }
}
