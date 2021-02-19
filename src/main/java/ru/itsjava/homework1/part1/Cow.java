package ru.itsjava.homework1.part1;


import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class Cow {

    private String name;
    private String color;
    private String nameBreed;

    public Cow(String name, String color, String nameBreed){
        this.name = name;
        this.color = color;
        this.nameBreed = nameBreed;
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
    public String getNameBreed(){
        return nameBreed;
    }
}
