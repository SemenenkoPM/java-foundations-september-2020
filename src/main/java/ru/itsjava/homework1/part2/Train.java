package ru.itsjava.homework1.part2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Train {
    String number;
    String trainType;
    int numberOfCars;
}
