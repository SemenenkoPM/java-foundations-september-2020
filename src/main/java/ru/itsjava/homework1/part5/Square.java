package ru.itsjava.homework1.part5;

import lombok.Data;

@Data
public class Square extends Figure{
    private double side;


    public Square(double side1){
        this.side = side1;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimetr() {
        return 4 * side;
    }

    @Override
    public void printArea() {
        System.out.println("Печатаем площадь квадрата: " + getArea());
    }

    @Override
    public void printPerimetr() {
        System.out.println("Печатаем периметр квадрата: " + getPerimetr());
    }
}
