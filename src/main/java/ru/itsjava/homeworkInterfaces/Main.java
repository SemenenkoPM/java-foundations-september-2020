package ru.itsjava.homeworkInterfaces;

public class Main {
    public static void main(String[] args) {

    Man man = new Man();
    Dog dog = new Dog();
    Cat cat = new Cat();
    Bird bird = new Bird();
    Fish fish = new Fish();

    man.walk();
    man.run();
    System.out.println("Максимальная дистанция бега человека: " + man.maxRunDistance() + "км");
    man.swim();
    System.out.println("Средняя скорость бега человека: " + man.maxRunDistance() + "км/ч");

    dog.run();
    System.out.println("За одну тренировку собака может пробежать: " + dog.maxRunDistance() + "км");
    dog.swim();
    System.out.println("Скорость с которой плывет собака наверное: " + dog.maxSwimSpeed() + "км/ч");
    dog.walk();
    cat.run();
    System.out.println("Кошка пробегает до: " + cat.maxRunDistance() + "км");
    cat.walk();
    bird.fly();
    System.out.println("bird.sing() = " + bird.sing());
    bird.walk();
    fish.swim();
        System.out.println("Акула может разогнаться до: " + fish.maxSwimSpeed() + "км/ч");


    }
}
