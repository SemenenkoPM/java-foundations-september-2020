package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Salary {

    private int baseSalary;
    public static double increaseCoefficient = 1.0;

    public double getFullSallary() {
        return baseSalary * increaseCoefficient;
    }


}
