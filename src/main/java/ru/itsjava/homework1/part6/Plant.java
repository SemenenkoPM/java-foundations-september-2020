package ru.itsjava.homework1.part6;

public class Plant implements Eatable, Talkable{

    private final String name;
    private final int height;
    private final boolean isWild;

    public Plant(String name, int height, boolean isWild) {
        this.name = name;
        this.height = height;
        this.isWild = isWild;
    }

    @Override
    public void eat() {
        System.out.println("Растениям нужна вода и солнце)");
    }

    @Override
    public void talk() {
        System.out.println("Растения интересный собеседник");
    }
}
