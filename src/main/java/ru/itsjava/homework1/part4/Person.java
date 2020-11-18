package ru.itsjava.homework1.part4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Person {

    private boolean isMale;
    private String name;
    private int age;

    public void printAge(){
        System.out.println("Возраст: " + age);
    }
}
