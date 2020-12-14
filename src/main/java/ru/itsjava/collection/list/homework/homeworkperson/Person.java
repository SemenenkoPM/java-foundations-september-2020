package ru.itsjava.collection.list.homework.homeworkperson;

import lombok.Data;

@Data
public class Person {

    private final String name;
    private final String surname;
    private final boolean isMale;
    private final int age;

    public Person(String name, String surname, boolean isMale, int age) {
        this.name = name;
        this.surname = surname;
        this.isMale = isMale;
        this.age = age;
    }



    public boolean itsTimeToCall(){
        if(isMale){
            if(age >= 18 & age <= 27){
                char nameStartsWith = 'Н';
                if(name.charAt(0) == nameStartsWith){
                return true;
                }
            }
        }
      return false;
    }

}
