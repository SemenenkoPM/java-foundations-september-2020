package ru.itsjava.homework1.part4;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {

    private boolean isMale;
    String name;
    String age;

    public Person(Boolean isMale, String name, String age) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }
    public String printAge(){
        return age;
    }

}
