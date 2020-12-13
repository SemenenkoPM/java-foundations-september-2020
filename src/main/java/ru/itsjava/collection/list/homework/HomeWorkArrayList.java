package ru.itsjava.collection.list.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkArrayList {

    public static void main(String[] args) {

        // Создание списков используя конструктор
        // Создать пустой список
        // Создать список размером 20

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(20);

        // Задачи на вставку элементов:
        // Добавить подряд пять элементов
        // Добавить шестой элемент в третью позицию. Добавить седьмой элемент в первую.
        // Записать в новый список все элементы предыдущего списка

        list2.add("first");
        list2.add("second");
        list2.add("third");
        list2.add("fourth");
        list2.add("fifth");
        list2.add(2,"sixth");
        System.out.println("list2.get(2) = " + list2.get(2));
        list2.add(0,"seventh");
        System.out.println("list2.get(0) = " + list2.get(0));
        List<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        System.out.println("list3: " + list3);
        System.out.println();

        // Получить элемент по индексу:
        // Получить первый элемент
        // Получить последний элемент

        System.out.println("list2.get(0) = " + list2.get(0));
        System.out.println("list2.get(list2.size()-1) = " + list2.get(list2.size() - 1));
        System.out.println();

        // Задачи на удаление Элементов
        // Удалить элемент по значению
        // Удалить элемент по индексу

        list3.remove(3);
        System.out.println("list3.get(3) = " + list3.get(3));
        list3.remove("first");
        System.out.println("list3 = " + list3);
        System.out.println();

        // Проверить наличие элемента

        System.out.println("list3.contains(\"second\") = " + list3.contains("second"));
        System.out.println();

        // Вывод списка:
        // Вывести список на экран в формате: List: {"First";"Second";"Third"}

        String result = ("List: {");
        for (int i = 0; i < list3.size(); i++) {
            result = result + '"' + list3.get(i) + ";";
        }
        System.out.println(result + "}");
        System.out.println();
        // Отфильтровать список и вернуть записи по некоторому условию:
        // Условие на индекс: Индекс делиться на 3
        // Условие на значение: Вернуть количество элементов, которые равны "чему то"

        for (int i = 0; i < list3.size(); i = i + 3) {
            System.out.println(list3.get(i));
        }
        System.out.println();

        int numbersOfCoincidences = 0;
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i) == "second"){
                numbersOfCoincidences++;
            }
        }
        System.out.println("numbersOfCoincidences = " + numbersOfCoincidences);
        System.out.println();

        // Пропустить несколько первых элементов
        // Пропустить первые 3 элемента в списке

        for (int i = 3; i < list3.size() ; i++) {
            System.out.println(list3.get(i));
        }
        System.out.println();

        // Пропустить элементы которые удовлетворяют некоторому условию
        // {first, last, second, last, third, last}
        // вывести {first, second, third, last}
//        Подскажи в какую сторону думать?
        List<String> list4 = new ArrayList<>();
        list4.add("first");
        list4.add("last");
        list4.add("second");
        list4.add("last");
        list4.add("third");
        list4.add("last");



        // Возвращаем первый элемент длина строки которого делится на 3

        for (int i = 0; i < list3.size(); i++) {
            if(list3.get(i).length() % 3 == 0){
                System.out.println("Первый Элемент длинна строки которого делиться на 3: " + list3.get(i));
                break;
            }
        }
        System.out.println();

        // Возвращаем все элементы длинна строки которых делящится на 3

        for (int i = 0; i < list3.size(); i++) {
            if(list3.get(i).length() % 3 == 0){
                System.out.println("Элемент длинна строки которого делиться на 3: " + list3.get(i));
            }
        }
        System.out.println();
    }
}
