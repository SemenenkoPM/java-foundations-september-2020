package ru.itsjava.collection.list.myarraylist;

import lombok.ToString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс MyArrayList должен: ")
public class MyArrayListTest {

    public static final String DEFAULT_ELEM = "Elem 1";

    @DisplayName(" корректно возвращать размер")
    @Test
    public void shouldHaveCorrectReturnSize(){
        MyArrayList list = new MyArrayList();
        int sizeBeforeAdd = list.size();
        list.add(DEFAULT_ELEM);
        Assertions.assertEquals(0, sizeBeforeAdd);
        Assertions.assertEquals(1, sizeBeforeAdd + 1);
    }

    @DisplayName(" возвращать 'true' если коллекция пуста")
    @Test
    public void shouldHaveCorrectReturnTrue(){
        MyArrayList list = new MyArrayList();
        boolean resultBeforAdd = list.isEmpty();
        list.add(DEFAULT_ELEM);
        boolean resultAfterAdd = list.isEmpty();
        Assertions.assertTrue(resultBeforAdd);
        Assertions.assertFalse(resultAfterAdd);
    }

    @DisplayName(" корректно удалять по элементу")
    @Test
    public void shouldHaveCorrectRemoveByElement(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        int sizeBeforeRemove = list.size();
        list.remove(DEFAULT_ELEM);

        Assertions.assertEquals(sizeBeforeRemove - 1, list.size());
    }

    @DisplayName(" корректно добавлять по элементу")
    @Test

    public void shouldHaveCorrectAddByElement(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        int sizeBeforeAdd = list.size();
        list.add(DEFAULT_ELEM);

        Assertions.assertEquals(sizeBeforeAdd + 1, list.size());

    }
    // Мой
    @DisplayName(" корректно перезаписывает элемент")
    @Test

    public void shouldHaveCorrectSetElement(){
        MyArrayList list = new MyArrayList();
        list.set(0, DEFAULT_ELEM);
        Assertions.assertEquals(DEFAULT_ELEM, list.get(0));
    }
    // !!! Мой
    @DisplayName(" корректно добавляет элемент по индексу")
    @Test
    public void shouldHaveCorrectAddByIndex(){
        MyArrayList list = new MyArrayList();
        list.add(DEFAULT_ELEM);
        int sizeBeforeAdd = list.size();
        list.add(0, "str1");
        Assertions.assertEquals("str1", list.get(0));
        Assertions.assertEquals(sizeBeforeAdd + 1, list.size());
        Assertions.assertEquals(DEFAULT_ELEM, list.get(1));

    }

    // Мой

    @DisplayName(" корректно удаляет элемент по индексу")
    @Test
    public void shouldHaveCorrectRemoveByIndex(){
        MyArrayList list = new MyArrayList();
        list.add("str1");
        list.add("str2");
        int sizeBeforeRemove = list.size();
        list.remove(0);
        Assertions.assertEquals("str2", list.get(0));
        Assertions.assertEquals(sizeBeforeRemove - 1, list.size());
    }




}
