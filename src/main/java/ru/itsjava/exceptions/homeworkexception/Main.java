package ru.itsjava.exceptions.homeworkexception;

import ru.itsjava.exceptions.IncorrectUserNameException;

public class Main {

    public static void main(String[] args) {

        Person Pavel = new Person("Pavel", "Smirnov", 38);

//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.err.println(e);
//        }
try {
    Pavel.setName("");
} catch (IncorrectUserNameException e){
    System.err.println("Некорректное имя пользователя: " + e);
} finally {
    System.out.println("обработали ошибку некорректное имя");
}
        try {
            throw new RuntimeException();
        } catch (RuntimeException runtimeException){
            System.err.println(runtimeException);
        } finally {
            System.out.println("Обработали");
        }
try {
    Pavel.setAge(0);
} catch (IncorrectUserAgeException e){
    System.err.println("Некорректный возраст");
} finally {
    System.out.println("Обработали ошибку некорректный возраст");
}
    }
}
