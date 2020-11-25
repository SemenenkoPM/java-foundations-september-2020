package ru.itsjava.homeworkshop;

public class Cars {


    private String brend;
    private String color;

    private Cars(String brend, String color) {
        this.brend = brend;
        this.color = color;
    }

    private Cars audi = new Cars("Audi", "Green");
    private Cars ford = new Cars("Ford", "Yellow");
    private Cars skoda = new Cars("Skoda", "black");

    private Cars[] carsArray= new Cars[] {audi, ford, skoda};

}
