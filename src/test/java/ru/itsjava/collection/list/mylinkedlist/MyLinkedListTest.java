package ru.itsjava.collection.list.mylinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collection.list.myarraylist.MyArrayList;

public class MyLinkedListTest {

    public static final String DEFAULT_ELEM = "Elem 1";
    public static final String DEFAULT_ELEM1 = "Elem 2";

    @DisplayName(" корректно перезаписывает элемент")
    @Test

    public void shouldHaveCorrectSetElement(){
        MyLinkedList list = new MyLinkedList();
        list.add(0, DEFAULT_ELEM);
        list.set(0, DEFAULT_ELEM1);
        Assertions.assertEquals(DEFAULT_ELEM1, list.get(0));
    }

    @DisplayName(" корректно возвращать элемент по индексу")
    @Test
    public void shouldHaveCorrectgetElementByIndex() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);

        Assertions.assertEquals(DEFAULT_ELEM, list.get(0));
    }

    @DisplayName(" корректно удалять по элементу")
    @Test
    public void shouldHaveCorrectRemoveByElement(){
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);
        int sizeBeforeRemove = list.size();
        list.remove(DEFAULT_ELEM);

        Assertions.assertEquals(sizeBeforeRemove - 1, list.size());
    }

    @DisplayName(" корректно возвращать 'true' если коллекция содержит о")
    @Test
    public void shouldHaveCorrectReturnValueInMehtodContains() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);

        Assertions.assertFalse(list.contains("321"));
        Assertions.assertTrue(list.contains("Elem 1"));
    }

    @DisplayName(" возвращать 'true' если коллекция пуста")
    @Test
    public void shouldHaveCorrectReturnTrueisEmpty(){
        MyLinkedList list = new MyLinkedList();
        boolean resultBeforAdd = list.isEmpty();
        list.add(DEFAULT_ELEM);
        boolean resultAfterAdd = list.isEmpty();
        Assertions.assertTrue(resultBeforAdd);
        Assertions.assertFalse(resultAfterAdd);
    }

    @DisplayName(" корректно удалять все элементы")
    @Test
    public void shouldHaveCorrectRemoveAllElements() {
        MyLinkedList listBeforeAdd = new MyLinkedList();
        MyLinkedList listAfterAdd = new MyLinkedList();
        listAfterAdd.add(DEFAULT_ELEM);
        listAfterAdd.add(DEFAULT_ELEM1);
        listAfterAdd.clear();
        Assertions.assertEquals(listBeforeAdd.isEmpty(), listAfterAdd.isEmpty());
    }

    @DisplayName(" корректно добавляет элемент по индексу")
    @Test
    public void shouldHaveCorrectAddByIndex(){
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM);
        int sizeBeforeAdd = list.size();
        list.add(1, "str1");
        Assertions.assertEquals("str1", list.get(1));
        Assertions.assertEquals(sizeBeforeAdd + 1, list.size());
        Assertions.assertEquals(DEFAULT_ELEM, list.get(2));
    }

    @DisplayName(" корректно возвращает индекс последнего появления элемента в списке")
    @Test
    public void shouldHaveCorrectLastOccurrence() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM1);
        list.add(DEFAULT_ELEM1);

        Assertions.assertEquals(2, list.lastIndexOf(DEFAULT_ELEM1));
    }

    @DisplayName(" корректно возвращает индекс первого появления элемента в списке")
    @Test
    public void shouldHaveCorrectFirstOccurrence() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);
        list.add(DEFAULT_ELEM1);
        list.add(DEFAULT_ELEM1);

        Assertions.assertEquals(1, list.indexOf(DEFAULT_ELEM1));
    }

    @DisplayName(" корректно добавлять элемент")
    @Test

    public void shouldHaveCorrectAddByElement() {
        MyLinkedList list = new MyLinkedList();
        list.add(DEFAULT_ELEM);
        int sizeBeforeAdd = list.size();
        list.add(DEFAULT_ELEM);

        Assertions.assertEquals(sizeBeforeAdd + 1, list.size());
    }
}
