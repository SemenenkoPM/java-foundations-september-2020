package ru.itsjava.annotations.junit.service;

import java.lang.reflect.InvocationTargetException;

public interface TestRun {
    void start() throws InvocationTargetException, IllegalAccessException;
}
