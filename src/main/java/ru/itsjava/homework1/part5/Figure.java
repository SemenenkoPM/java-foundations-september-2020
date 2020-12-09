package ru.itsjava.homework1.part5;


public abstract class Figure {

    abstract double getArea();
    abstract double getPerimetr();
    final static double PI = 3.14;

    public void printArea(){
        System.out.println("Печатаем площадь фигуры: " + getArea());
    }
    public void printPerimetr(){
        System.out.println("Печатаем периметр фигуры: " +getPerimetr());
    }

}
