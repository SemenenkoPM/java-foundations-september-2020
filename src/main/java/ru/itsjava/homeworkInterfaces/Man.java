package ru.itsjava.homeworkInterfaces;


public class Man implements Walkable, Swimable, Runnable{
    @Override
    public void walk() {
        System.out.println("Иду куда глаза глядят");
    }

    @Override
    public void run() {
        System.out.println("Может натренироваться и бегать быстро)");
    }

    @Override
    public int maxRunDistance() {

        return 20;
    }

    @Override
    public void swim() {
        System.out.println("Если умеет плавать конечно");
    }

    @Override
    public double maxSwimSpeed() {
        System.out.println("Средняя скорость плаванья человека в км/ч: ");
        return 3;
    }
}
