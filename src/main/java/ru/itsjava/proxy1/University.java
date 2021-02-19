package ru.itsjava.proxy1;

public class University {

    public static void main(String[] args) {
//        Student vanya = new Student("");
//
//        vanya.getFio();

        ProxyStudent vanya = new ProxyStudent("");
        System.out.println(vanya.getFio());
    }
}
