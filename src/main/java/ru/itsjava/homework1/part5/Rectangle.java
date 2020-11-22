package ru.itsjava.homework1.part5;

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
}
