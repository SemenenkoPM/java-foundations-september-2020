package ru.itsjava.enums;

import ru.itsjava.enums.enumshomework.DaysOfTheWeek;

public class EnumsPractice {
    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season + "");
        }

        System.out.println(WinterMonth.DECEMBER);

        System.out.println(DaysOfTheWeek.MONDAY);
    }
}
