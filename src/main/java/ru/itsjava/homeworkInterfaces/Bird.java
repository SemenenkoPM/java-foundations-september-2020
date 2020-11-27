package ru.itsjava.homeworkInterfaces;

public class Bird implements Flyable, Walkable{

    @Override
    public void fly() {
        System.out.println("Птицы полетели на юг");
    }

    @Override
    public String sing() {
        return "Чирик чик чик";
    }

    @Override
    public void walk() {
        System.out.println("Птицы гуляют неспеша");

    }
}
