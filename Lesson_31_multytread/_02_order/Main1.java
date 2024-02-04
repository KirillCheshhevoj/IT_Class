package Lesson_31_multytread._02_order;

import lombok.SneakyThrows;

public class Main1 {
    @SneakyThrows
    public static void main(String[] args) {
        var a = new JoinRunnable("A");
        var b = new JoinRunnable("B");
        var c = new JoinRunnable("C");

        a.start();
        a.join();
        b.start();
        c.start();
    }
}
