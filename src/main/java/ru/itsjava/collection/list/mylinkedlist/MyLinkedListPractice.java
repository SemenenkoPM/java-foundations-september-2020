package ru.itsjava.collection.list.mylinkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
       linkedList.add("first");
//
//        System.out.println(linkedList);
//        linkedList.add("second");
//        linkedList.add("third");
//        System.out.println("linkedList.size() = " + linkedList.size());
//        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
 //       System.out.println("linkedList = " + linkedList);

//        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));
//        System.out.println("linkedList.remove(1) = " + linkedList.remove(1));

//        System.out.println("linkedList.remove(1) = " + linkedList.remove(0));
//        System.out.println("linkedList = " + linkedList);
//        System.out.println("linkedList.indexOf(\"second\") = " + linkedList.indexOf("second"));
//        linkedList.add("first");
//        System.out.println("linkedList.lastIndexOf(\"first\") = " + linkedList.lastIndexOf("first"));
//        linkedList.add(0, "sde");
        System.out.println("linkedList = " + linkedList);
        linkedList.add(0, "fgr");
        linkedList.add(0, "fgr");
        System.out.println("linkedList = " + linkedList);
//        linkedList.clear();
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.contains(\"fgr\") = " + linkedList.contains("fgr"));
        System.out.println("linkedList.contains(\"fgr\") = " + linkedList.contains("first"));
    }

}
