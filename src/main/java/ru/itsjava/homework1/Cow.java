package ru.itsjava.homework1;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cow {

    private String name;
    private String color;
    private String nameBreed;

    public Cow(String name){
        this.name = name;
        color = "рыжая";
        nameBreed = "Бестужевская";
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
    public String getNameBreed(){
        return nameBreed;
    }
}
