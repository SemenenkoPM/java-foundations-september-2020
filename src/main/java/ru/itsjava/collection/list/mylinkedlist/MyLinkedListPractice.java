package ru.itsjava.collection.list.mylinkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("first");

        System.out.println(linkedList);
        linkedList.add("second");
        linkedList.add("third");
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
        System.out.println("linkedList = " + linkedList);

        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
//        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));

//        System.out.println("linkedList.remove(1) = " + linkedList.remove(0));
//        System.out.println("linkedList = " + linkedList);

    }

}
