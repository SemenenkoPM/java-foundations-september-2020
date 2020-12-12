package ru.itsjava.collection.list.myarraylist;

public class MyArrayListPractice {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        System.out.println("myArrayList.size() = " + myArrayList.size());

        myArrayList.add("str 1");

        System.out.println(myArrayList);
        myArrayList.remove("str 1");
        System.out.println(myArrayList);
//        System.out.println(myArrayList.get(8));
        System.out.println(myArrayList.get(0));
    }
}
