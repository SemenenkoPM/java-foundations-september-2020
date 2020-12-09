package ru.itsjava.homework1.part5;

import lombok.Data;

@Data
public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI * radius *radius;
    }

    @Override
    double getPerimetr() {
        return 2 * PI * radius;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь круга равно: " + getArea());
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр круга равен: " + getPerimetr());
    }
}
