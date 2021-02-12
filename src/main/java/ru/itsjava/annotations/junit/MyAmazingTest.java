package ru.itsjava.annotations.junit;

import ru.itsjava.annotations.junit.annotations.*;

public class MyAmazingTest {


    @Before
public void test1(){
        System.out.println("Тест1 запустился, который @Before");
    }
    @BeforeEach
public void test2(){
        System.out.println("Тест2 запустился, который @BeforeEach");
    }
    @Test
public void test3(){
        System.out.println("Тест 3 запустился");
    throw new AssertionError();

}
    @After
public void test4(){
        System.out.println("Тест4 запустился, который @After");
    }
    @AfterEach
public void test5(){
        System.out.println("Тест5 запустился, который @AfterEach");
    }
    @Test
public void test6(){
        System.out.println("Тест 6 запустился");
    }
    @Test
    public void test7(){
        System.out.println("Тест 7 запустился");
    }


}
