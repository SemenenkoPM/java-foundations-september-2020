package ru.itsjava.homework1.part6;

public interface Talkable {

    default void talk(){
        System.out.println("Я говорю, говорю");
    }
}
