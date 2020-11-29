package ru.itsjava.interfaces.comparable;


import java.util.Arrays;
public class Bar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bottle waterBottle = new Bottle("glass", 0.5);
        Bottle whiskeyBottle = new Bottle("glass", 0.7);
        Bottle colaBottle = new Bottle("plastic", 1.5);

        System.out.println("waterBottle.compareTo(whiskeyBottle) = " + waterBottle.compareTo(whiskeyBottle));

        Bottle[] bottles = {colaBottle, waterBottle, whiskeyBottle};

        Arrays.sort(bottles);

        System.out.println("Arrays.toString(bottles) = " + Arrays.toString(bottles));

        System.out.println("waterBottle.clone() = " + waterBottle.clone());
    }
}
