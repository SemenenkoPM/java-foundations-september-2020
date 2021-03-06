package ru.itsjava.collection.list.mylinkedlist;

public class MyLinkedList {

    private Node head;
    private int realSize = 0;

    // в классе
    public int size() {
        return realSize;
    }

    // Моя реализация
    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }
    // Моя реализация, переделывал по правкам от Виталия
    public boolean contains(Object o) {
        if (head == null) {
            return false;
        }
        if (head.getValue().equals(o)) {
            return true;
        }
        boolean isContains = false;
        Node curNode = head;
        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                isContains = true;
                break;
            }
        }

        return isContains;
    }

    // в классе
    public boolean add(Object o) {
        Node node = new Node(o, null);
        if (head == null) {
            head = node;
        } else {
            Node curNode = head; // curNode текущий элемент
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }

        realSize++;
        return true;
    }

    // Моя реализация
    public boolean remove(Object o) {
        Node prevNode = head;
        Node curNode = head.getNext();

        if (prevNode.getValue().equals(o)) {
            head = curNode;
            prevNode.setNext(null);
            realSize--;
        } else {
            while (curNode != null) { // идем до конца
                if (curNode.getValue().equals(o)) {
                    prevNode.setNext(curNode.getNext()); // переназначаем ссылку, пропускаем удалемый элемент
                    curNode.setNext(null); // зануляем ссылку удаляемого элемента
                    realSize--;
                    break;
                }
                prevNode = prevNode.getNext(); // перемещаем оба нода
                curNode = curNode.getNext();
            }
            return false;
        }
        return true;
    }

    // Моя реализация
    public void clear() {
        head = null;
        realSize = 0;
    }

    // Моя реализация
    public Object get(int index) {
        checkIndex(index);
        int curIndex = 0;
        Node curNode = head;
        while (curIndex != index) {
            curNode = curNode.getNext();
            curIndex++;
        }
        return curNode.getValue();
    }

    // Моя реализация
    public Object set(int index, Object element) {
        checkIndex(index);
        int curIndex = 0;
        Node curNode = head;

        while (curIndex != index) {
            curNode = curNode.getNext();
            curIndex++;
        }
        Object replacedElement = curNode.getValue();
        curNode.setValue(element);

        return replacedElement;
    }

    // Моя реализация
    public void add(int index, Object element) {
        checkIndex(index);
        Node node = new Node(element, null);

        if (head == null && index == 0) {
            head = node;
            realSize++;
        } else if (head != null && index == 0) {
            Node nextNode = head;
            head = node; // Почему нужно обязательно присвоить headу node???
            node.setNext(nextNode);
            realSize++;
        } else {

            Node prevNode = head;
            Node curNode = head.getNext();
            int curIndex = 1;
            while (curIndex != index) {
                prevNode = prevNode.getNext();
                curNode = curNode.getNext();
                curIndex++;
            }
            node.setNext(curNode);
            prevNode.setNext(node);

            realSize++;
        }
    }

    // в классе
    private void checkIndex(int index) {
        if ((index < 0) || (index >= realSize)) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of bound " + realSize);
        }
    }

    // в классе
    public Object remove(int index) {
        checkIndex(index);
        if (index == 0) { // ситуация если нужно удалить первый элемент, или массив состоит из одного элемента
            Node prevHead = head; // записываем элемент который мы удаляем в prevHead
            head = head.getNext();
            prevHead.setNext(null); // ссылку удаляемого элемента заnullяем
            realSize--;
            return prevHead.getValue(); // вернул удаляемый обьект
        }
// если индекс не 0 и хотим удалить где то из середины, понимаем, что элементов минимум 2
        // curNode нод который нужно удалить
        // prevNode нод предыдущий перед тем который нужно удалить
        Node prevNode = head;
        Node curNode = head.getNext();

        int curIndex = 1; // создаем текущий индекс, 1 т.к. curNode уже указывает на элемент с индексом 1
        while (curIndex != index) { // идем до нужного индекса
            prevNode = prevNode.getNext(); // перемещаем оба нода
            curNode = curNode.getNext();
            curIndex++; // индекс увеличиваем
        }
        prevNode.setNext(curNode.getNext()); // переназначаем ссылку, пропускаем удалемый элемент
        curNode.setNext(null); // зануляем ссылку удаляемого элемента
        realSize--;

        return curNode.getValue();
    }

    // Моя реализация// 15.01
    public int indexOf(Object o) {
        if (head == null) {
            return -1;
        }
        int curIndex = 0;
        Node curNode = head;
        while (curNode != null) {
            if (curNode.getValue().equals(o)){
                break;
            }
            curNode = curNode.getNext();
            curIndex++;
            if (curNode == null){
                curIndex = -1;
            }
        }
        return curIndex;
    }

    // Моя реализация
    public int lastIndexOf(Object o) {
        if (head == null) {
            return -1;
        }
        int curIndex = 0;
        Node curNode = head;
        int desiredIndex = -1;
        while (curNode != null) {
            if (curNode.getValue().equals(o)) {
                desiredIndex = curIndex;
            }
            curNode = curNode.getNext();
            curIndex++;
        }
        return desiredIndex;
    }

    // в классе
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinkedList{ ");
        Node curNode = head;
        while (curNode != null) {
            stringBuilder.append(curNode.getValue()).append(" ");
            curNode = curNode.getNext();
        }
        return stringBuilder.append('}').toString();
    }
}
