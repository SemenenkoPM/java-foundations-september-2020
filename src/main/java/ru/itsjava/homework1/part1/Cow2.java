package ru.itsjava.homework1.part1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cow2 {
    private String name;
    private String color;
    private String nameBreed;

    public Cow2(String name){
        this.name = name;
        color = "белая";
        nameBreed = "Холмогорская";
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
    public String getNameBreed(){
        return nameBreed;
    }
}
