package ru.itsjava.homeworkcomparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person1 = new Person("Петя", "Петров", 21);
        Person person2 = new Person("Петя", "Петров",21);
        Person person3 = new Person("Витя", "Иванов",18);

        System.out.println("person1.compareTo(person2) = " + person1.compareTo(person2));
        System.out.println("person1.compareTo(person3) = " + person1.compareTo(person3));

        Person[] persons = new Person[] {person1, person2, person3};

        Arrays.sort(persons);
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
        System.out.println();
        System.out.println("person1.clone() = " + person1.clone());
    }
}
