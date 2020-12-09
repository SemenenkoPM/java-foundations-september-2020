package ru.itsjava.homework1.part5;

import lombok.Data;

@Data
public class Triangle extends Figure{

    private double side1;
    private double side2;
    private double side3;



    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public void printArea() {
        System.out.println("Площадь треугольника: " + getArea());
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр треугольника: " + getPerimetr());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.getArea(), getArea()) != 0) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(side1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(side2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(side3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

