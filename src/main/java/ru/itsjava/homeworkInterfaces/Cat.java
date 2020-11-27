package ru.itsjava.homeworkInterfaces;

public class Cat implements Runnable, Walkable{

    @Override
    public void run() {
        System.out.println("Кошка бегает хорошо");
    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void walk() {
        System.out.println("Кошка гуляет сама по себе");
    }
}
