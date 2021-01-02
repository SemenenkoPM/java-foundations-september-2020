package ru.itsjava.collection.set.sethomework;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        Set<Fruit> fruits= new HashSet<>();

        Fruit apple = new Fruit("Apple", 0.176);
        Fruit orange = new Fruit("Orange", 0.150);
        Fruit watermelon = new Fruit("Watermelon", 10);

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
    }
}
