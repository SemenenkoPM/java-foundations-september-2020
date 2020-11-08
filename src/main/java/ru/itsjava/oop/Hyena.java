package ru.itsjava.oop;

public class Hyena {
    private String name;
    private int pawsCount;
    private int tailCount;

    public Hyena (String name) {
        this.name = name;
        pawsCount = 4;
        tailCount = 1;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPawsCount(int pawsCount){
        this.pawsCount = pawsCount;
    }
    public int getPawsCount(){
        return pawsCount;
    }

    public void setTailCount(int tailCount){
        this.tailCount = tailCount;
    }

    public int getTailCount(){
        return tailCount;
    }



}
