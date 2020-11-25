package ru.itsjava.homeworkshop;

import java.util.Scanner;

public class Menu {
    Scanner console = new Scanner(System.in);


    void printMenu(){
        System.out.println("Меню:\n" +
                "1. Посмотреть все марки машин в наличии\n" +
                "2. Добавить марку\n" +
                "3. Прокатиться и уехать (убрать из массива)\n" +
                "4. Отсортировать по алфавиту\n" +
                "5. Забронировать определенную марку\n" +
                "6. Просмотреть забронированные марки\n" +
                "0. Выход\n" +
                "Введите номер меню :");

        int menuNum = console.nextInt();

    }
}
