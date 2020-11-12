package ru.itsjava.statics;

public class Company {
    public static void main(String[] args) {

        Salary cleanwasherSalary = new Salary(10_000);
        Salary ceosSalary = new Salary(100_000);

        Salary.increaseCoefficient = 5;

        System.out.println("cleanwasherSalary.getFullSallary() = " + cleanwasherSalary.getFullSallary());
        System.out.println("ceosSalary.getFullSallary() = " + ceosSalary.getFullSallary());

    }
}
