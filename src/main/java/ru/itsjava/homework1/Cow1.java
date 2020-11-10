package ru.itsjava.homework1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cow1 {
    private String name;
    private String color;
    private String nameBreed;

    public Cow1(String name){
        this.name = name;
        color = "черная";
        nameBreed = "Синяя корова";
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
    public String getNameBreed(){
        return nameBreed;
    }
}
