package ru.itsjava.threads.threadshomework;

import lombok.SneakyThrows;

public class Thread3 extends Thread{

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Третий поток");
            Thread.sleep(7000);
        }
    }
}
