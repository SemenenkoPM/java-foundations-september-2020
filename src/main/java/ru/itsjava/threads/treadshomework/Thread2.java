package ru.itsjava.threads.treadshomework;

import lombok.SneakyThrows;

public class Thread2 extends Thread{
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Это второй поток печатает");
            Thread.sleep(2000);
        }
    }
}
