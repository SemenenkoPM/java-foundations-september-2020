package ru.itsjava.homework1.part5;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(20, 14, 15);
        Triangle triangle2 = new Triangle(14, 20, 11);
        Square square1 = new Square(10);
        Rectangle rectangle1 = new Rectangle(20, 10);

        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimetr());
        System.out.println(triangle2.getArea());
        System.out.println(triangle2.getPerimetr());
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimetr());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimetr());

        System.out.println("triangle1.toString() = " + triangle1.toString());
        System.out.println("triangle2.toString() = " + triangle2.toString());
        System.out.println("square1.toString() = " + square1.toString());
        System.out.println("rectangle1.toString() = " + rectangle1.toString());

    }

    // почему для Методов getArea и getPerimetr мы не создаем переменных
    // в фигуре почему возращаем именно -1 не валидное значение
     // почему в треугольнике при изменеии значений на большие получаю NaN

}