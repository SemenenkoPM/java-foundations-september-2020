package ru.itsjava.threads.lecture2;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class ThreadPrinter extends Thread{

    private final String message;
 //   private final long mills;
    private final int times;
    private final Printer monitor;

    @SneakyThrows
    @Override
    public void run() {
        synchronized (monitor){
        for (int i = 0; i < times; i++) {
//                       Thread.sleep(3000);

            monitor.wait(3000);
            monitor.notifyAll();
            System.out.print(message + " ");
        }
        }
    }

}
