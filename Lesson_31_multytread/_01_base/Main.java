package Lesson_31_multytread._01_base;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().setName("My name");
//        Thread.currentThread().setPriority(1);
//        System.out.println(Thread.currentThread());
//        System.out.println("Creating new thread from: " + Thread.currentThread());
//        var myThread = new MyThread();
//        //myThread.setDaemon(true);
//        myThread.start();
//        //myThread.run();
//        myThread.join();
//        System.out.println("Leaving from: " + Thread.currentThread());
//
//        System.out.println("Creating new thread from: " + Thread.currentThread());
//        var myRunnable = new Thread(new MyRunnable());
//        myRunnable.start();
//        myRunnable.join();
//        System.out.println("Leaving from: " + Thread.currentThread());

        var myThread = new Thread(() -> {
            System.out.println("Using Thread from " + Thread.currentThread());
        });
        myThread.start();

        var myRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Using Runnable from " + Thread.currentThread());
            }
        });

        myRunnable.start();
    }
}
