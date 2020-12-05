package ru.itsjava.exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {
////        throw new NullPointerException();
//
//        try {
//            Object obj = null;
////            obj.toString();
//            throw new RuntimeException();
//        } catch (NullPointerException npe) {
//            System.err.println("У тебя npe");
////            npe.printStackTrace();
//        }
//
//        System.out.println("После обработки ошибки");

//        throw new Exception();
//        try {
//            throw new RuntimeException();
//        } catch (NullPointerException runtimeException){
//            System.err.println(runtimeException);
//        } finally {
//            System.out.println("Finally");
//        }

        User emptyUser = new User(" ");
        try {
            emptyUser.setName(" ");
        } catch (IncorrectUserNameException incorrectUserNameException){
            System.out.println("Некорректное имя");
        }
    }
}
