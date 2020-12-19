package ru.itsjava.collection.list.myarraylist;

import java.util.Arrays;

public class MyArrayListPractice {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.isEmpty() = " + myArrayList.isEmpty());

        myArrayList.add("str 1");
        System.out.println("myArrayList.isEmpty() after = " + myArrayList.isEmpty());
        myArrayList.add("str 2");
        myArrayList.add("str 3");
        myArrayList.add("str 4");

        System.out.println(myArrayList);
//        myArrayList.remove("str 3");
        System.out.println(myArrayList);
//      System.out.println(myArrayList.get(12));
        System.out.println(myArrayList.get(0));
 //       System.out.println(myArrayList.set(0, "strr"));
        System.out.println(myArrayList);
        myArrayList.add(3,"addstr");
        System.out.println(myArrayList);
        myArrayList.remove(2);
        System.out.println(myArrayList);

        System.out.println("myArrayList.indexOf(\"addstr\") = " + myArrayList.indexOf("addstr"));
        System.out.println("myArrayList.lastIndexOf(\"addstr\") = " + myArrayList.lastIndexOf("addstr"));
//        myArrayList.clear();
//        System.out.println("myArrayList = " + myArrayList);
        myArrayList.set(3, "ntn");
        System.out.println();

        System.out.println("myArrayList.toArray() = " + myArrayList.toArray());
        System.out.println(Arrays.toString(myArrayList.toArray()));
    }
}
