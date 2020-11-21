package ru.itsjava.homework1.part5;

import lombok.Getter;
import lombok.Setter;


public class Triangle extends Figure{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        super(area, perimetr);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

}
