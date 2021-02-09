package ru.itsjava.annotations.junit;

import java.lang.reflect.Method;

public class MyJUnitRunner {
    public static void main(String[] args) {

        int passedTest = 0;
        int testFailed = 0;

    MyAmazingTest myAmazingTest = new MyAmazingTest();
    Method [] declaredMethod = MyAmazingTest.class.getDeclaredMethods();
    for (Method method : declaredMethod) {
        try {
            method.invoke(myAmazingTest);
            System.out.println("Тест " + method.getName() + " успешно прошел");
            passedTest++;
        } catch (Throwable throwable) {
            testFailed++;
            System.err.println("Тест " + method.getName() + " успешно упал");
        }

    }
        System.out.println("Тестов успешно пройдено " + passedTest);
        System.out.println("Тестов завалено " + testFailed);




    }
}
