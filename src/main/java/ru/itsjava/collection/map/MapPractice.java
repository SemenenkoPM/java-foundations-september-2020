package ru.itsjava.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<Man, String> men = new HashMap<>();
        Man andrey = new Man("Andrey");
        Man ivan = new Man("Ivan");

        men.put(andrey, "бита");
        men.put(ivan, "кроссовки");

        System.out.println("men.get(andrey) = " + men.get(andrey));
        System.out.println("men.containsKey(andrey) = " + men.containsKey(andrey));
        System.out.println("men.containsValue(\"бита\") = " + men.containsValue("бита"));

        men.put(andrey, "Автомат");

        System.out.println("men.get(andrey) = " + men.get(andrey));

//        andrey = new Man("Andrew");

        System.out.println("men.get(andrey) = " + men.get(andrey));

        System.out.println("men.size() = " + men.size());

        System.out.println("men.isEmpty() = " + men.isEmpty());

        for (Map.Entry<Man, String> pair: men.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
        System.out.println();

        for (Man key: men.keySet()) {
            System.out.println(key + ":" + men.get(key));
        }
        System.out.println();
        men.remove(andrey);

        for (Map.Entry<Man, String> pair: men.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
        System.out.println();



    }
}
