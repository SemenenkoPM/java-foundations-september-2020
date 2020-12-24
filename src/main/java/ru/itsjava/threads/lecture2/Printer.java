package ru.itsjava.threads.lecture2;

public class Printer {

    public synchronized void print(String message, int times){
            for (int i = 0; i < times; i++) {
////                       Thread.sleep(3000);
//
//                monitor.wait(3000);
//                monitor.notifyAll();
                System.out.print(message + " ");
            }
    }

    public synchronized void printM(String message, int times){
        for (int i = 0; i < 3; i++) {
////                       Thread.sleep(3000);
//
//                monitor.wait(3000);
//                monitor.notifyAll();
            System.out.print("M");
        }
    }
}
