package ru.itsjava.homeworkInterfaces;

public class Dog implements Runnable, Swimable, Walkable{


    @Override
    public void run() {
        System.out.println("Бежит быстрее человека");
    }

    @Override
    public int maxRunDistance() {
        return 20;
    }

    @Override
    public void swim() {
        System.out.println("Собака обычно хорошо плывет");
    }

    @Override
    public double maxSwimSpeed() {
        return 3;
    }

    @Override
    public void walk() {
        System.out.println("Собака может долго гулять");

    }
}
