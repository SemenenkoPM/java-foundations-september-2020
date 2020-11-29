package ru.itsjava.inheritance;

public interface Movable {
    default void move() {
        System.out.println("I move");
    }
}
