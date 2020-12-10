package ru.itsjava.core;

public class Main {

    public static void main(String[] args) {

        int num = 5;
        System.out.println("(num ++) = " + (num++));
        System.out.println("After inc: num = " + num);
        System.out.println("(++ num) = " + (++num));

        System.out.println("1" + 2 + 3);
        System.out.println("1" + (2 + 3));
        System.out.println("1" + num ++ + ++num);

        //


    }
}
