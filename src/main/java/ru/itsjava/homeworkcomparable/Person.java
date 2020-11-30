package ru.itsjava.homeworkcomparable;

import lombok.Data;

@Data
public class Person implements Comparable<Person>, Cloneable{

    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        if (surname.compareToIgnoreCase(o.surname) < 0) {
            return -1;
        } if (surname.compareToIgnoreCase(o.surname) > 0) {
            return 1;
        }
            else if (name.compareToIgnoreCase(o.name) < 0) {
            return -1;
        }
            if (name.compareToIgnoreCase(o.name) > 0) {
                return 1;
            }
                else if (age > o.age) {
                    return 1;
                }
                if (age == o.age) {
                    return 0;
                }
                return -1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
