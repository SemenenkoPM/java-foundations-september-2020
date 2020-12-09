package ru.itsjava.homework1.part6;

public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow("Буренка", "Рыжая");

        Man man = new Man("Глеб", 32);

        Plant plant = new Plant("Вишня", 2, false);

        cow.eat();
        cow.talk();

        man.eat();
        man.talk();

        plant.eat();
        plant.talk();
    }
}
