package ru.itsjava.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {

        Set<Man> men = new HashSet<>();
        Man andrey = new Man("Andrey");
        Man mark = new Man("Mark");

        System.out.println("mans.add(andrey) = " + men.add(andrey));
        System.out.println("mans.add(andrey) = " + men.add(andrey));

        System.out.println("men.size() = " + men.size());

        System.out.println("men.add(mark) = " + men.add(mark));

        System.out.println("men.size() = " + men.size());

        for (Man man:
             men) {
            System.out.println(man + " ");

        }
        System.out.println();
        Iterator<Man> iterator = men.iterator();
        //cmd+alt+v
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");

        }
        System.out.println();

        Set<Man> manSet = Set.of(andrey, mark);


    }
}
