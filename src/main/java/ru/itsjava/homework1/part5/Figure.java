package ru.itsjava.homework1.part5;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Figure {

    public int area;
    public int perimetr;

    public Figure(int area, int perimetr) {
        this.area = area;
        this.perimetr = perimetr;
    }

}
