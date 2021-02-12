package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.service.TestRunImpl;
import java.lang.reflect.InvocationTargetException;

public class MyJUnitRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        new TestRunImpl().start();
    }
}
