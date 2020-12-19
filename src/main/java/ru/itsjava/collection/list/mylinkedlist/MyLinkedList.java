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
    private void checkIndex(int index){
        if ((index < 0) || (index > realSize)){
            throw new IndexOutOfBoundsException("Index: " + index + " out of bound " + realSize);
        }
    }
    public Object remove(int index) {
        checkIndex(index);
        if(index == 0){
            Node prevHead = head;
            head = head.getNext();
            prevHead.setNext(null);
            realSize--;
            return prevHead.getValue();
        }
        if (head.getNext() == null){

        }

        Node prevNode = head;
        Node curNode = head.getNext();

        int curIndex = 1;
        while (curIndex != index){
            prevNode = prevNode.getNext();
            curNode = curNode.getNext();
            curIndex++;
        }
        prevNode.setNext(curNode.getNext());
        curNode.setNext(null);
        realSize--;

        return curNode.getValue();
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinkedList{ ");
        Node curNode = head;
        while (curNode != null){
            stringBuilder.append(curNode.getValue()).append(" ");
            curNode = curNode.getNext();
        }
        return stringBuilder.append('}').toString();
    }
}
