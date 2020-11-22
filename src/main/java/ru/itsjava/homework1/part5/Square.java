package ru.itsjava.homework1.part5;

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
}
