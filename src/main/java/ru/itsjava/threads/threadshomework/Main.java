package ru.itsjava.threads.threadshomework;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread2 = new Thread2();
        thread2.start();
        thread2.join();

        Runnable runnable = new Thread1();
        Thread thread1 = new Thread(runnable);
//        thread1.start();
        thread1.setDaemon(true);

        Thread thread3 = new Thread3();
        thread3.start();







    }
}
