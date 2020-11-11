package ru.itsjava.homework1.part1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cow3 {
    private String name;
    private String color;
    private String nameBreed;

    public Cow3(String name){
        this.name = name;
        color = "зеленая";
        nameBreed = "Швицкая";
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
    public String getNameBreed(){
        return nameBreed;
    }
}
