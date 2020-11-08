package ru.itsjava.oop;

public class Jungle {

    public static void main(String[] args) {

        Lion scar = new Lion("Scar");
        Hyena tabaqui = new Hyena("Табаки");
        Panther bagira = new Panther();
        AborigenalHut wigwam = new AborigenalHut();


        tabaqui.setName("Шакал Табаки");

        System.out.println("Имя шакала из 'Маугли' " + tabaqui.getName());
        System.out.println("Про хвост, сколько: " + tabaqui.getTailCount());

        scar.printLion();
        scar.setName("Король Шрам");
        scar.printLion();

        System.out.println("В наших джунглях есть: " + scar.getName());
        System.out.println("Количество лап " + scar.getName() + ": " + scar.getPawsCount());

        BritishCat marusya = new BritishCat();
//        marusya.sayMeow();
//
//        marusya.sayMrr();
        System.out.println("marusya.getBreed()=" + marusya.getBreed());
        marusya.sayMeow();

//        bagira.setCoatColor("Белый");
        System.out.println(bagira.getCoatColor());
        System.out.println(wigwam.getRoofMaterial());
    }
}
