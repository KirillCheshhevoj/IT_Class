package Lesson_31_multytread._07_collaborate;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class MyQueue {
    private int i;
    @NonNull
    boolean valueSet = false;

    @SneakyThrows
    public synchronized int get() {
        while (!valueSet) {
            wait();
        }
        System.out.println("Received " + i);
        valueSet = false;
        notify();
        return i;
    }

    @SneakyThrows
    public synchronized void put() {
        while (valueSet) {
            wait();
        }
        valueSet = true;
        this.i = i;
        System.out.println("Sent " + i);
        notify();
    }
}
