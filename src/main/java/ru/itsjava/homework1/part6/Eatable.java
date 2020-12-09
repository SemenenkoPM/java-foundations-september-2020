package ru.itsjava.homework1.part6;

public interface Eatable {

    default void eat(){
        System.out.println("Я все сьем");
    }
}
