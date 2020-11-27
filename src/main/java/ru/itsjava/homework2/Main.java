package ru.itsjava.homework2;

public class Main {

    public static void main(String[] args) {

        Vodka belochka = new Vodka("Белочка", 3.0, "Сталь", 100);
        Vodka dobroeytro = new Vodka("Доброе утро", "Картон");


        belochka.drinkTooMuch("Стекло", 100);
        dobroeytro.drinkTooMuch("сто озер", 10.0);
        belochka.drinkTooMuch();




    }
}
