package ru.itsjava.homework1;

public class Cows {

    public static void main(String[] args) {

        Cow burenka = new Cow("Буренка");
        Cow1 burenka1 = new Cow1("Буренка1");
        Cow2 burenka2 = new Cow2("Буренка2");
        Cow3 burenka3 = new Cow3("Буренка3");
        Cow4 burenka4 = new Cow4("Буренка4");


        burenka.setColor("Зеленая");
        System.out.println("Какого цвета теперь Буренка? - " + burenka.getColor());

        burenka1.setColor("Белая");
        System.out.println("Какого цвета теперь Буренка? - " + burenka1.getColor());
        burenka2.setColor("Красная");
        System.out.println("Какого цвета теперь Буренка? - " + burenka2.getColor());



    }
}
