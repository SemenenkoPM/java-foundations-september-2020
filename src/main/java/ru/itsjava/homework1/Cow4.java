package ru.itsjava.homework1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cow4 {
    private String name;
    private String color;
    private String nameBreed;

    public Cow4(String name){
        this.name = name;
        color = "фиолетовая";
        nameBreed = "Кианская";
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
    public String getNameBreed(){
        return nameBreed;
    }
}
