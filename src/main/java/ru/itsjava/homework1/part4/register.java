package ru.itsjava.homework1.part4;

public class register {
    public static void main(String[] args) {
        Man petro = new Man(true, "Petro", "45");
        Man oleg = new Man(true, "Oleg", "34");
        Man alexey = new Man(true, "Alexey", "35");
        Women sveta = new Women(true, "Sveta", "54");
        Women katya = new Women(false, "Katya", "20");
        Women anna = new Women(false, "Anna", "40");

        Person[] persons = new Person[]{petro, oleg, alexey, sveta, katya, anna};
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Возраст " + persons[i].name + " " + persons[i].printAge());
        }
    }
}
