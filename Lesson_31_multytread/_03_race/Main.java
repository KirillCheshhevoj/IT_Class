package Lesson_31_multytread._03_race;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var account = new BankAccount(100);
        var t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(100);
            }
        });

        var t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(100);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(account);
    }
}
