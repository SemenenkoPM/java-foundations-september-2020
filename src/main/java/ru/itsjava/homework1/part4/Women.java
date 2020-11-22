package ru.itsjava.homework1.part4;

public class Women extends Person{

    public Women(String name, String age) {
        super(false, name, age);
    }

    @Override
    public void printAge() {
        System.out.println("Возраст " + name + ": Всегда 18");
    }
}
