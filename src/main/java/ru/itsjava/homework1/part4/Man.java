package ru.itsjava.homework1.part4;


public class Man extends Person{

    public Man(String name, String age) {
        super (true, name, age);
    }

    @Override
    public void printAge() {
        System.out.println("Возраст" + name + ": " + age);
    }
}
