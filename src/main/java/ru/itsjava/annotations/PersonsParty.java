package ru.itsjava.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonsParty {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Person valery = new Person("Valery");
        System.out.println(valery);

//        Class<? extends Person> personClass = valery.getClass();
//
        Class<?> aClass = Class.forName("ru.itsjava.annotations.Person");
        System.out.println(aClass.getName());

        Constructor constructorPerson = aClass.getConstructor(String.class);
        Person petr = (Person) constructorPerson.newInstance("Petr");

        System.out.println(petr);

        Field aClassField = aClass.getDeclaredField("isGood");
        aClassField.setAccessible(true);
        aClassField.setBoolean(valery, true);
        aClassField.setBoolean(petr, true);

        System.out.println(valery);
        System.out.println(petr);

        if (Person.class.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation = Person.class.getAnnotation(MyAnnotation.class);

            if(myAnnotation.isFlag()){
                System.out.println("myAnnotation.message() = " + myAnnotation.message());
            }
        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method: declaredMethods){
            method.invoke(petr);
        }

    }
}
