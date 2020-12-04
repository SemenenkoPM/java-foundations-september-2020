package ru.itsjava.homework1.part5;

import lombok.Data;

@Data
public class Rectangle extends Figure {
    private double side1;
    private double side2;


    public Rectangle (double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimetr() {
        return 2 * (side1 + side2);
    }

    @Override
    public void printArea() {
        System.out.println("Печатаем площадь прямоугольника: " + getArea());
    }

    @Override
    public void printPerimetr() {
        System.out.println("Печатаем периметр прямоугольника: " + getPerimetr());
    }
}