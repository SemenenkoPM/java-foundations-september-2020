package ru.itsjava.object;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Telephone должен:")
public class  TelephoneTest {

    public static final String PHONE_NUMBER = "89119085531";
    public static final String DEFAULT_BREND = "Iphone";
    public static final int DEFAULT_PRICE = 70_000;

    @DisplayName("иметь корректный конструктор")
    @Test
    public void shouldHaveCorrectAllArgsConstructor(){
        Telephone telephone = new Telephone(PHONE_NUMBER, DEFAULT_BREND, DEFAULT_PRICE);

//        Assertions.assertEquals("89119085531", telephone.getPhoneNumber());
//        Assertions.assertEquals(DEFAULT_BREND, telephone.getBrand());
//        Assertions.assertEquals(70_000, telephone.getPrice());

        assertAll("telephone",
                () -> assertEquals(PHONE_NUMBER,telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BREND,telephone.getBrand()),
                () -> assertEquals(DEFAULT_PRICE,telephone.getPrice())
        );



// гет, сет, иквалс и ту стринг написать тесты
    }

    @DisplayName(" корректно выполнять set")
    @Test

    public void shouldHaveCorrectExecuteMethodSet(){
        Telephone telephone = new Telephone(PHONE_NUMBER, DEFAULT_BREND, DEFAULT_PRICE);
        telephone.setPrice(123_000);

        Assertions.assertEquals(123_000, telephone.getPrice());
    }

    @DisplayName(" корректно возвращать get")
    @Test

    public void shouldHaveCorrectReturnGet(){
        Telephone telephone = new Telephone(PHONE_NUMBER, DEFAULT_BREND, DEFAULT_PRICE);
        telephone.setPrice(123_000);

        assertAll("telephone",
                () -> assertEquals(PHONE_NUMBER,telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BREND,telephone.getBrand()),
                () -> assertEquals(123_000,telephone.getPrice())
        );
    }

    @DisplayName(" корректно выполнять toString")
    @Test

    public void shouldHaveCorrectExecuteMethodToString(){
        Telephone telephone = new Telephone(PHONE_NUMBER, DEFAULT_BREND, DEFAULT_PRICE);

        Assertions.assertEquals("{brand: " + "Iphone" + ", tel: " + "89119085531" + "}", telephone.toString());
    }

    @DisplayName(" корректно выполнять equals")
    @Test

    public void shouldHaveCorrectExecuteMethodEquals(){
        Telephone telephone = new Telephone(PHONE_NUMBER, DEFAULT_BREND, DEFAULT_PRICE);
        Telephone telephone1 = new Telephone(PHONE_NUMBER, DEFAULT_BREND, DEFAULT_PRICE);
        Telephone telephone2 = new Telephone(PHONE_NUMBER, DEFAULT_BREND, 35_000);


//        Assertions.assertEquals(true, telephone.equals(telephone1));
//        Assertions.assertEquals(false, telephone.equals(telephone2));

        assertAll("telephone",
                () -> assertEquals(true, telephone.equals(telephone1)),
                () -> assertEquals(false, telephone.equals(telephone2))
                );
    }

    @DisplayName(" иметь корректный конструктор от final полей")
    @Test

    public void shouldHaveRequiredArgsConstructor(){
        Telephone telephone = new Telephone(PHONE_NUMBER, DEFAULT_BREND);

        assertAll("telephone",
                () -> assertEquals(PHONE_NUMBER,telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BREND,telephone.getBrand())
        );
    }

}
