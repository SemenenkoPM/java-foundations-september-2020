package ru.itsjava.homework1.part6;

public class Cow implements Eatable, Talkable {

    private final String name;
    private final String color;

    public Cow(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Могу сьесть много травы");
    }

    @Override
    public void talk() {
        System.out.println("Не очень разговорчива, могу помычать");

    }
}
