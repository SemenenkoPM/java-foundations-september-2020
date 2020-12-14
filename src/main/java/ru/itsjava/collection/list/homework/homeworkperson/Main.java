package ru.itsjava.collection.list.homework.homeworkperson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Николай", "Петров", true, 20);
        Person person2 = new Person("Виктор", "Сидоров", true, 22);
        Person person3 = new Person("Нео", "Сидоров", true, 26);
        Person person4 = new Person("Виктор", "Сидоров", true, 22);
        Person person5 = new Person("Ольга", "Петрова", false, 22);



        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        // Вернуть всех мужчин, кто проходит по условиям

        for (Person person : personList) {
            if (person.itsTimeToCall()) {
                System.out.println(person);
            }
        }

    }
}
