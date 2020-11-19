package ru.itsjava.homework1.part4;

public class Register {
    public static void main(String[] args) {
        Man petro = new Man ("Petro", "45");
        Man oleg = new Man("Oleg", "34");
        Man alexey = new Man("Alexey", "35");
        Women sveta = new Women("Sveta", "54");
        Women katya = new Women("Katya", "20");
        Women anna = new Women("Anna", "40");

        Person[] persons = new Person[]{petro, oleg, alexey, sveta, katya, anna};
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Возраст " + persons[i].getName() + " " + persons[i].printAge());
        }
    }
}
