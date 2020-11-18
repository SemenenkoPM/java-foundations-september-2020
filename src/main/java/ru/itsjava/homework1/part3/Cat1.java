package ru.itsjava.homework1.part3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Cat1 {
    private String name;
    private String color;

    public void sayMeow(){
        System.out.println("Meow");
    }

}
