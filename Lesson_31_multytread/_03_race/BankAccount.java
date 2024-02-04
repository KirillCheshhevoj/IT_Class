package Lesson_31_multytread._03_race;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class BankAccount {
    private long balance;
    private final Object lock = new Object();

    public void withdraw(long amount) {
        synchronized (lock) {
            long newAmount = balance - amount;
            balance = newAmount;
        }
    }

    public void deposit(long amount) {
        synchronized (lock) {
            long newAmount = balance + amount;
            balance = newAmount;
        }
    }
}
