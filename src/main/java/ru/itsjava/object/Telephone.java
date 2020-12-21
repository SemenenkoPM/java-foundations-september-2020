package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // get + set + equals + toString + HashCode
@AllArgsConstructor
@RequiredArgsConstructor
public class Telephone {
    private final String phoneNumber;
    private final String brand;
    private double price;



//    @Override
//
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Telephone)) return false;
//
//        Telephone telephone = (Telephone) o;
//
//        if (Double.compare(telephone.price, price) != 0) return false;
//        if (!phoneNumber.equals(telephone.phoneNumber)) return false;
//        return brand != null ? brand.equals(telephone.brand) : telephone.brand == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = phoneNumber.hashCode();
//        result = 31 * result + (brand != null ? brand.hashCode() : 0);
//        temp = Double.doubleToLongBits(price);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//
//
//    }
//
    @Override
    public String toString() {
        return "{brand: " + brand + ", tel: " + phoneNumber + "}";
    }
}
