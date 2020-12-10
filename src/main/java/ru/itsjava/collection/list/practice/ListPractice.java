package ru.itsjava.collection.list.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("first");
        System.out.println("stringList.get(0) = " + stringList.get(0));
        stringList.add("second");
        System.out.println("stringList.get(1) = " + stringList.get(1));

        stringList.add(0,"befor first");
        System.out.println("stringList.get(0) = " + stringList.get(0));

        System.out.println("stringList.size() = " + stringList.size());
//        stringList.remove("befor first");
        stringList.remove(0);
        System.out.println(stringList.get(0));

        System.out.println("stringList.isEmpty() = " + stringList.isEmpty());
        stringList.clear();
        System.out.println("after clear: stringList.isEmpty() = " + stringList.isEmpty());

        stringList.add("first");
        stringList.add("second");

        stringList.contains("first");
        stringList.contains("third");

        stringList.set(1, "last");
        System.out.println("stringList.get(1) = " + stringList.get(1));

        stringList.add("last");
        stringList.remove("last");
        for (String elem: stringList) {
            System.out.print(elem + " ");
        }
        System.out.println();


    }
}
