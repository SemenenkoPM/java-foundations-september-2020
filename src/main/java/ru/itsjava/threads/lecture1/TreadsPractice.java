package ru.itsjava.threads.lecture1;

public class TreadsPractice {

    public static void main(String[] args) {

        // Написать букву А 8 раз


//        for (int i = 0; i < 8; i++) {
//            System.out.print("A ");
//        }
//        System.out.println();

        // Написать букву А с некоторой задержкой 2 секунды

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 2000_000_000L; j++) {
//
//            }
//            System.out.print("A ");
//        }
//        System.out.println();

//        for (int i = 0; i < 8; i++) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print("A ");
//        }
//        System.out.println();


        // Печать А раз в 2 секунды и печать B раз в три секунды
        // (каждую букву по 6 раз)
        //   1 2 3 4 5 6    7 8 9 10 11 12  13 14 15 16 17 18
// Печать А    A B A   A&B    A B  A    A&B       B         B

//        for (int i = 0; i < 6; i++) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print("A ");
//        }
//        for (int i = 0; i < 6; i++) {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.print("B ");
//        }

        Thread threadA = new PrinterA();
        threadA.start();

        Runnable runnableB = new PrinterB();
        Thread threadB = new Thread(runnableB);
        threadB.start();


//        Анонимный класс
//        Runnable runnableC = new Runnable() {
//            @SneakyThrows
//            @Override
//            public void run() {
//                for (int i = 0; i < 6; i++) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.print("C ");
//
//                }
//            }
//        };

        Runnable runnableC = () -> {
                for (int i = 0; i < 6; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("C ");

                }

        };

        new Thread(runnableC).start();


    }
}
