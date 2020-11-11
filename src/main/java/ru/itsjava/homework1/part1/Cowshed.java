package ru.itsjava.homework1.part1;

public class Cowshed {

    public static void main(String[] args) {

        Cow burenka = new Cow("Буренка", "Желтая", "Синяя корова");
        Cow burenka1 = new Cow("Буренка1", "Зеленая", "Венгерская серая");
        Cow burenka2 = new Cow("Буренка2", "Белая", "Голландская");
        Cow burenka3 = new Cow("Буренка3", "Черная", "Калмыцкая");
        Cow burenka4 = new Cow("Буренка4", "Фиолетовая", "Хайленд");

        burenka.setColor("Черная");
        burenka1.setColor("Белая");
        burenka2.setColor("Рыжая");

        burenka.setNameBreed("Шортгорнская");
        System.out.println("Какая порода у Буренки: " + burenka.getNameBreed());




    }
}
