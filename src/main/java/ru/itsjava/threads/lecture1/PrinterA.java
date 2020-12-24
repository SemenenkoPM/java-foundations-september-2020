package ru.itsjava.threads.lecture1;

public class PrinterA extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("A ");
        }
    }
}
