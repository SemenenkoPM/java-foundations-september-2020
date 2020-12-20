package ru.itsjava.collection.list.myarraylist;

import java.util.Arrays;

public class MyArrayList {

    private final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    // готов
    public int size() {
        return realSize;
    }

    // Мой
    public boolean isEmpty() {
        if (realSize == 0) return true;
        return false;
    }

    // Мой

    public boolean contains(Object o) {
        if (indexOf(o) == -1) return false;
        return true;
    }
// ?????
    public Object[] toArray() {
        Object[] resultArray = new Object[realSize];
        for (int i = 0; i < realSize; i++) {
            resultArray[i] = array[i];
        }
//        System.out.println("Arrays.toString(resultArray) = " + Arrays.toString(resultArray));
        return resultArray;
    }

    // Готов
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

    // Готов
    public boolean remove(Object o) {
        Object[] resultArray = new Object[array.length];
        int removeIndex = realSize;
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                removeIndex = i;
                break;
            }
            resultArray[i] = array[i];
        }
        if (removeIndex == realSize) return false;
        for (int i = removeIndex; i < realSize; i++) {
            resultArray[i] = array[i + 1];
        }
        array = resultArray;
        realSize--;
        return true;
    }

    // Мой
    public void clear() {
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

//    private boolean isCorrectIndex(int index){
//        if ((index < 0) || (index > realSize)){
//            throw new IndexOutOfBoundsException("Index: " + index + " out of bound " + realSize);
//        }
//        return true;
//    }

    private void checkIndex(int index) {
        if ((index < 0) || (index > realSize)) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of bound " + realSize);
        }
    }

    public Object get(int index) {
        return array[index];
    }

    // Мой

    public Object set(int index, Object element) {
        checkIndex(index);
        if ((index >= 0) && (index < array.length - 1)) {
            array[index] = element;
            return true;
        }
        return false;
    }

    // !!! Мой
    public boolean add(int index, Object element) {
        checkIndex(index);

        Object[] resultArray = new Object[array.length];
        if (realSize == array.length) {
            Object[] arrayToChangeLength = new Object[3 * realSize / 2 + 1];
            resultArray = arrayToChangeLength;
        }
            for (int i = 0; i < index; i++) {
                resultArray[i] = array[i];
            }

            resultArray[index] = element;

            for (int i = index; i < realSize; i++) {
                resultArray[i + 1] = array[i];
            }
            array = resultArray;

            realSize++;

            return true;
        }


    public Object remove(int index) {
        Object[] resultArray = new Object[array.length];
        for (int i = 0; i < index; i++) {
            resultArray[i] = array[i];
        }
        for (int i = index; i < realSize; i++) {
            resultArray[i] = array[i + 1];
        }
        array = resultArray;
        realSize--;
        return true;
    }

    // Мой
    // cmd+alt+L формат строк
    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (o.equals(array[i])) {
                return i;
            }

        }
        return -1;
    }

    // Мой
    public int lastIndexOf(Object o) {
        for (int i = realSize - 1; i >= 0; i--) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            result.append(array[i]).append(" ");
        }
        result.append('}');

        return result.toString();

    }
}
