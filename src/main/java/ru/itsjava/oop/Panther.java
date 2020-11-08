package ru.itsjava.oop;

public class Panther {
    private String name;
    private String coatColor;
    private int age;

    public Panther(){
        name = "Багира";
        coatColor = "Черная";
        age = 18;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCoatColor(String coatColor){
        this.coatColor = coatColor;
    }
    public String getCoatColor(){
        return coatColor;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;

    }


}
