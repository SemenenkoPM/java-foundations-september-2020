package ru.itsjava.collection.list.myarraylist;

import java.util.List;

public class MyArrayList {

    private final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
      array = new Object[DEFAULT_CAPACITY];
      realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (realSize == array.length) {

            Object[] resArray = new Object[3 * realSize / 2 + 1];
            for (int i = 0; i < realSize; i++) {
                resArray[i] = array[i];
            }
            array = resArray;

        }
        array[realSize++] = o;
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
