package ru.itsjava.threads.threadshomework;

import lombok.SneakyThrows;

public class Thread1 implements Runnable{
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Первый поток напечатал");
            Thread.sleep(5000);
        }
    }
}
