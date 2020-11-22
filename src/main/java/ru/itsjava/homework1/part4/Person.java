package ru.itsjava.homework1.part4;

public class Person {

    private boolean isMale;
    final String name;
    final String age;

    public Person(Boolean isMale, String name, String age) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }
    public void printAge(){
        System.out.println("Возраст " + name + ": " + age);
    }

}
