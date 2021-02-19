package ru.itsjava.annotations.junit.service;

import ru.itsjava.annotations.junit.MyAmazingTest;
import ru.itsjava.annotations.junit.annotations.*;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunImpl implements TestRun {

    private Object testClassInstance;

    private int passedTest = 0;
    private int testFailed = 0;

    private final List<Method> listMethodsBefore = new ArrayList<>();
    private final List<Method> listMethodsBeforeEach = new ArrayList<>();
    private final List<Method> listMethodsAfter = new ArrayList<>();
    private final List<Method> listMethodsAfterEach = new ArrayList<>();
    private final List<Method> listMethodsTest = new ArrayList<>();

    public TestRunImpl(Class<?> myTestClass) {
        try {
            Constructor<?> constructor = myTestClass.getConstructor(); 
            this.testClassInstance = constructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start() throws InvocationTargetException, IllegalAccessException {
        addMethodsByCollection();

        runMethodsBefore();
        runMethodsBeforeEachTestAfterEach();
        runMethodsAfter();

        System.out.println("Тестов успешно пройдено " + passedTest);
        System.out.println("Тестов завалено " + testFailed);
    }

    private void runMethodsBefore() throws InvocationTargetException, IllegalAccessException {
        for (Method method : listMethodsBefore) {
            method.invoke(testClassInstance); // тут падает почему?
        }
    }

    private void runMethodsBeforeEachTestAfterEach() throws InvocationTargetException, IllegalAccessException {
        for (Method methodTest : listMethodsTest) {
            for (Method methodBeforeEach : listMethodsBeforeEach) {
                methodBeforeEach.invoke(testClassInstance);
            }

            try {
                methodTest.invoke(testClassInstance);
                System.out.println("Тест " + methodTest.getName() + " успешно прошел");
                passedTest++;
            } catch (Throwable throwable) {
                testFailed++;
                System.err.println("Тест  " + methodTest.getName() + " успешно упал");
            }
            for (Method methodAfterEach : listMethodsAfterEach) {
                methodAfterEach.invoke(testClassInstance);
            }
        }
    }

    private void runMethodsAfter() throws InvocationTargetException, IllegalAccessException {
        for (Method methodAfter : listMethodsAfter) {
            methodAfter.invoke(testClassInstance);
        }
    }

    private void addMethodsByCollection() {
        Method[] declaredMethod = testClassInstance.getClass().getDeclaredMethods(); // тут если класс поменять myAmazing то работает
        for (Method method : declaredMethod) {
            if (method.isAnnotationPresent(Before.class)) {
                listMethodsBefore.add(method);
            } else if (method.isAnnotationPresent(BeforeEach.class)) {
                listMethodsBeforeEach.add(method);
            } else if (method.isAnnotationPresent(After.class)) {
                listMethodsAfter.add(method);
            } else if (method.isAnnotationPresent(AfterEach.class)) {
                listMethodsAfterEach.add(method);
            } else if (method.isAnnotationPresent(Test.class)) {
                listMethodsTest.add(method);
            } else {
                throw new AnnotationNotFoundException();
            }
        }
    }
}