package ru.itsjava.inheritance;

public abstract class Car implements Movable{

    public abstract String getCarMake();

    public void printEmotionals() {
        System.out.println("So good seets!");
    }
}
