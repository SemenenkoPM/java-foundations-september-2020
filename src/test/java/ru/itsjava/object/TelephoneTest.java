package ru.itsjava.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Telephone должен:")
public class TelephoneTest {

    public static final String PHONE_NUMBER = "89119085531";
    public static final String DEFAULT_BREND = "Iphone";
    @DisplayName("иметь корректный конструктор")
    @Test
    public void shouldHaveCorrectAllArgsConstructor(){
        Telephone telephone = new Telephone(PHONE_NUMBER, DEFAULT_BREND, 70000);

//        Assertions.assertEquals("89119085531", telephone.getPhoneNumber());
//        Assertions.assertEquals(DEFAULT_BREND, telephone.getBrand());
//        Assertions.assertEquals(70_000, telephone.getPrice());

        Assertions.assertAll("telephone"


        );



    }
}
