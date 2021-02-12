package ru.itsjava.annotations.junit.service;

import ru.itsjava.annotations.junit.MyAmazingTest;
import ru.itsjava.annotations.junit.annotations.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunImpl implements TestRun {

    int passedTest = 0;
    int testFailed = 0;

    List<Method> listMethodsBefore = new ArrayList<>();
    List<Method> listMethodsBeforeEach = new ArrayList<>();
    List<Method> listMethodsAfter = new ArrayList<>();
    List<Method> listMethodsAfterEach = new ArrayList<>();
    List<Method> listMethodsTest = new ArrayList<>();

    MyAmazingTest myAmazingTest = new MyAmazingTest();

    @Override
    public void start() throws InvocationTargetException, IllegalAccessException {
        addMethodsByCollection();

        runMethodsBefore();
        runMethodsBeforeEachTestAfterEach();
        runMethodsAfter();

        System.out.println("Тестов успешно пройдено " + passedTest);
        System.out.println("Тестов завалено " + testFailed);
    }

    public void runMethodsBefore() throws InvocationTargetException, IllegalAccessException {
        for (Method method : listMethodsBefore) {
            method.invoke(myAmazingTest);
        }
    }

    public void runMethodsBeforeEachTestAfterEach() throws InvocationTargetException, IllegalAccessException {
        for (Method methodTest : listMethodsTest) {
            for (Method methodBeforeEach : listMethodsBeforeEach) {
                methodBeforeEach.invoke(myAmazingTest);
            }

            try {
                methodTest.invoke(myAmazingTest);
                System.out.println("Тест " + methodTest.getName() + " успешно прошел");
                passedTest++;
            } catch (Throwable throwable) {
                testFailed++;
                System.err.println("Тест  " + methodTest.getName() + " успешно упал");

            }
            for (Method methodAfterEach : listMethodsAfterEach) {
                methodAfterEach.invoke(myAmazingTest);
            }
        }
    }

    public void runMethodsAfter() throws InvocationTargetException, IllegalAccessException {
        for (Method methodAfter : listMethodsAfter) {
            methodAfter.invoke(myAmazingTest);
        }
    }

    public void addMethodsByCollection() {
        Method[] declaredMethod = MyAmazingTest.class.getDeclaredMethods();
        for (Method method : declaredMethod) {
            if (method.isAnnotationPresent(Before.class)) {
                listMethodsBefore.add(method);
            }
            if (method.isAnnotationPresent(BeforeEach.class)) {
                listMethodsBeforeEach.add(method);
            }
            if (method.isAnnotationPresent(After.class)) {
                listMethodsAfter.add(method);
            }
            if (method.isAnnotationPresent(AfterEach.class)) {
                listMethodsAfterEach.add(method);
            }
            if (method.isAnnotationPresent(Test.class)) {
                listMethodsTest.add(method);
            }
        }
    }
}