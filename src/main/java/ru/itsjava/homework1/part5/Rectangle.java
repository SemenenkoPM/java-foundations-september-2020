package ru.itsjava.homework1.part5;


public class Rectangle extends Figure {
    private final double side1;
    private final double side2;


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

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.getPerimetr(), getPerimetr()) != 0) return false;
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
        return result;
    }
}
