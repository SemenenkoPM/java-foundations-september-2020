package ru.itsjava.exceptions.homeworkexception;

import ru.itsjava.exceptions.IncorrectUserNameException;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.equals("")) throw new IncorrectUserNameException();
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) throws IncorrectUserAgeException{
        if (age <= 0 || age >150 ) throw new IncorrectUserAgeException();
        this.age = age;
    }
}
