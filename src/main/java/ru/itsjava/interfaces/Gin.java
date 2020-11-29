package ru.itsjava.interfaces;

public class Gin implements Creatable{

    @Override
    public void createWish() {
        System.out.println("Слушаюсь и повинусь");
    }

    public void canFly(){
        System.out.println("Я не умею летать, нужен ковер самолет");
    }
}
