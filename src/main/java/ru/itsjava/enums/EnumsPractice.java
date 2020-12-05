package ru.itsjava.enums;

public class EnumsPractice {
    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season + "");
        }

        System.out.println(WinterMonth.DECEMBER);
    }
}
