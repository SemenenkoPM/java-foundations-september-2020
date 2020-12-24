package ru.itsjava.threads.lecture1;

public class PrinterB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("B ");
        }
    }
}
