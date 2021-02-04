package ru.itsjava.annotations;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@MyAnnotation(message = "Я персона номер один", isFlag = true)
public class Person {
private final String name;
private boolean isGood = false;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", isGood=" + isGood +
                '}';
    }
}
