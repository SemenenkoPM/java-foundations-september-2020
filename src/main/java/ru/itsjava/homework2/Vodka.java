package ru.itsjava.homework2;


public class Vodka {

    private String brend;
    private double volume;
    private String bottleMaterial;
    private int price;

    public Vodka(String brend, double volume, String bottleMaterial, int price) {
        this.brend = brend;
        this.volume = volume;
        this.bottleMaterial = bottleMaterial;
        this.price = price;
    }

    public Vodka(String brend, String bottleMaterial) {
        this.brend = brend;
        this.bottleMaterial = bottleMaterial;
    }

    public void drinkTooMuch(String brend, double volume){
        System.out.println("Какой бренд? " + brend + ", Обьем какой? ");
    }

    public void drinkTooMuch(String bottleMaterial, int price) {
        System.out.println("Бутылка из: " + bottleMaterial + ", Стоит " + price + " Рупий");
    }
    public void drinkTooMuch() {
        System.out.println("Бутылка из: " + bottleMaterial + ", Стоит " + price + " Рупий");
    }
}
