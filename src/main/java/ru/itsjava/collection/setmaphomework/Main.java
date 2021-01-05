package ru.itsjava.collection.setmaphomework;



import ru.itsjava.collection.map.Man;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Set<Fruit> fruits= new HashSet<>();

        Fruit apple = new Fruit("Яблоко", 0.176);
        Fruit orange = new Fruit("Апельсин", 0.150);
        Fruit watermelon = new Fruit("Арбуз", 10);
        Fruit melon = new Fruit("Дыня", 10);
        Fruit pineapple = new Fruit("Ананас", 2);
        Fruit lemon = new Fruit("Лимон", 0.130);

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(watermelon);
        fruits.remove(orange);
        System.out.println("fruits.contains(apple) = " + fruits.contains(apple));

        System.out.println("fruits.add(apple) = " + fruits.add(apple));


        for (Fruit fruit : fruits
             ) {
            System.out.println(fruit);
        }

        System.out.println();
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        Map<String, Object> fruitMap = new HashMap<>();

        // Как я могу обратиться к обьектам другого класса?

        fruitMap.put("Андрей", apple);
        fruitMap.put("Виктор", orange);
        fruitMap.put("Сергей", watermelon);
        fruitMap.put("Константин", apple);
        fruitMap.put("Павел", watermelon);
        fruitMap.put("Алексей", melon);
        fruitMap.put("Максим", pineapple);


        System.out.println("fruitMap.get(\"Андрей\") = " + fruitMap.get("Андрей"));
        System.out.println("fruitMap.remove(\"Виктор\") = " + fruitMap.remove("Виктор"));
        System.out.println("fruitMap.remove(\"Константин\", \"Ананас\") = " + fruitMap.remove("Константин", pineapple));
        System.out.println("fruitMap.remove(\"Константин\", \"Яблоко\") = " + fruitMap.remove("Константин", apple));
        System.out.println("fruitMap.containsKey(\"Андрей\") = " + fruitMap.containsKey("Андрей"));
        System.out.println("fruitMap.containsValue(\"Ананас\") = " + fruitMap.containsValue(pineapple));

        Map<String, Object> newFruitMap = new HashMap<>();

        newFruitMap.putAll(fruitMap);
        System.out.println("newFruitMap = " + newFruitMap);
        System.out.println("newFruitMap.keySet() = " + newFruitMap.keySet());
        System.out.println("newFruitMap.values() = " + newFruitMap.values());
        System.out.println("newFruitMap.entrySet() = " + newFruitMap.entrySet());

        newFruitMap.put("Анатолий", melon);
        newFruitMap.put("Егор", watermelon);
        newFruitMap.put("Антон", lemon);
        System.out.println("newFruitMap = " + newFruitMap);

        // вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)

        int numberOfKeysWhoseLengthIsMoreThan5 = 0;
        for (String key: newFruitMap.keySet()){
            if ( key.length() > 5 ){
                numberOfKeysWhoseLengthIsMoreThan5++;
            }
        }
        System.out.println("Покупателей, чье имя больше 5: " + numberOfKeysWhoseLengthIsMoreThan5);

        // Вернуть количество элементов, которые равны "***" (фруктов, которые равны дыне)
        int amountOfFruitThatIsEqualToAMelon = 0;
        for (Object value: newFruitMap.values()){
            if ( value.equals(melon) ){
                amountOfFruitThatIsEqualToAMelon++;
            }
        }
        System.out.println("Количество Дынь в значениях: " + amountOfFruitThatIsEqualToAMelon);

        // Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.

        int currentNumberOfWatermelonsWeSkip = 0;
        for (Object value: newFruitMap.values()){
            if ( !value.equals(watermelon)) {
                System.out.println(value);
            } if (value.equals(watermelon)){
                    currentNumberOfWatermelonsWeSkip++;
                } if (value.equals(watermelon) && currentNumberOfWatermelonsWeSkip > 2) {
                    System.out.println(value);
                }
            }

        // Вывести все кроме 2 элементов, ключи которых начинаются на А

        int currentNumberOfElementsWeSkip = 0;
        char variableToCompare = 'А';
        for (String key: newFruitMap.keySet()){
            if (key.charAt(0) != variableToCompare) {
                System.out.println(key);
            } if (key.charAt(0) == variableToCompare){
                currentNumberOfElementsWeSkip++;
            } if ((key.charAt(0) == variableToCompare) && currentNumberOfElementsWeSkip > 2) {
                System.out.println(key);
            }
        }

        // Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.

        for (Object value: newFruitMap.values()) {
            if (value.equals(watermelon)) {
                System.out.println(value);
                break;
            }
        }

        // Возвращаем все элементы в другую карту, которые являются фруктами
        // в моем варианте все являются фруктами? Как сделать?

        // Найти средний вес всех фруктов.
        // как достучаться до свойств фруктов, до веса???





    }
}
