package ru.itsjava.collection.list.mylinkedlist;


public class MyLinkedList {

    private Node head;
    private int realSize = 0;



    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean add(Object o) {
        Node node = new Node(o, null);
        if (head == null){
            head = node;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null){
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }

        realSize++;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }
}
