package ru.itsjava.homework1.part4;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {

    private boolean isMale;
    public String name;
    public int age;

    public Person(Boolean isMale, String name, int age) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }




}
