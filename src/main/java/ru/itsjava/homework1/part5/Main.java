package ru.itsjava.homework1.part5;


public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(20, 14, 15);
        Triangle triangle2 = new Triangle(14, 20, 11);
        Square square1 = new Square(10);
        Rectangle rectangle1 = new Rectangle(20, 10);
        Rectangle rectangle2 = new Rectangle(30, 20);
        Rectangle rectangle3 = new Rectangle(20, 10);
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);


        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimetr());
        System.out.println(triangle2.getArea());
        System.out.println(triangle2.getPerimetr());
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimetr());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimetr());
        System.out.println("circle1.getArea() = " + circle1.getArea());
        System.out.println("circle1.getPerimetr() = " + circle1.getPerimetr());

        System.out.println();

        System.out.println("triangle1.toString() = " + triangle1.toString());
        System.out.println("triangle2.toString() = " + triangle2.toString());
        System.out.println("square1.toString() = " + square1.toString());
        System.out.println("rectangle1.toString() = " + rectangle1.toString());
        System.out.println("circle1.toString() = " + circle1.toString());
        System.out.println("circle2.toString() = " + circle2.toString());
        System.out.println("circle3.toString() = " + circle3.toString());

        System.out.println();

        triangle1.printArea();
        triangle1.printPerimetr();
        triangle2.printArea();
        triangle2.printPerimetr();
        square1.printArea();
        square1.printPerimetr();
        rectangle1.printArea();
        rectangle1.printPerimetr();

        System.out.println();

        System.out.println("triangle1.equals(triangle2) = " + triangle1.equals(triangle2));
        System.out.println("rectangle1.equals(rectangle2) = " + rectangle1.equals(rectangle2));
        System.out.println("rectangle1.equals(rectangle3) = " + rectangle1.equals(rectangle3));
        System.out.println("rectangle2.equals(rectangle3) = " + rectangle2.equals(rectangle3));




    }


     // почему в треугольнике при изменеии значений на большие получаю NaN
    // в случае с треугольником, equals я беру метод который переопределен
    // из абстрактного родительского класса, корректно так делать?
    // как быть с хэшкодом
}
