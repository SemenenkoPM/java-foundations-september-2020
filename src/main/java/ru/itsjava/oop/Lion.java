package ru.itsjava.oop;

public class Lion {
    private String name;
    private int pawsCount;

    public Lion(String name){
        this.name = name;
        pawsCount = 4;
    }

    public void printLion(){
        System.out.println("Лев с именем " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getPawsCount(){
        return pawsCount;
    }
    public void setPawsCount(int pawsCount){
        this.pawsCount = pawsCount;
    }

}
