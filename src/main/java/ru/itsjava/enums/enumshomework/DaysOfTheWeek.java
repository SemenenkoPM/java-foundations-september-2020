package ru.itsjava.enums.enumshomework;

public enum DaysOfTheWeek {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private final String addInfo;

    DaysOfTheWeek(String addInfo) {
        this.addInfo = addInfo;
    }

    @Override
    public String toString() {
        return "DaysOfTheWeek{" +
                "Перевод на отечественный: '" + addInfo + '\'' +
                '}';
    }
}
