package ru.itsjava.homeworkInterfaces;

public class Fish implements Swimable{

    @Override
    public void swim() {
        System.out.println("И акула плывет");
    }

    @Override
    public double maxSwimSpeed() {
        return 50;
    }
}
