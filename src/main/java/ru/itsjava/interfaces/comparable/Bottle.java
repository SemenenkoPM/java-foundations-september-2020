package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bottle implements Comparable<Bottle>, Cloneable {
    private final String material;
    private final double mills;

    @Override
    public int compareTo(Bottle bottle) {
        if (mills > bottle.mills) {
            return 1;
        } else if (mills == bottle.mills) {
            return 0;
        }
        return -1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
