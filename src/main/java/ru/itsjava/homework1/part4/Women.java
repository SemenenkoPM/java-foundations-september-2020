package ru.itsjava.homework1.part4;


public class Women extends Person{

    public Women(boolean isMale, String name, String age) {
        super(isMale = false, name, age = "Всегда 18");
    }

    @Override
    public String printAge(){
        return age;
    }
}
