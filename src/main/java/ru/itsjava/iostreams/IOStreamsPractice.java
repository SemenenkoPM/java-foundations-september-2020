package ru.itsjava.iostreams;

import java.io.*;
import java.util.logging.FileHandler;

public class IOStreamsPractice {
    public static void main(String[] args) {

        System.out.println();

 //       File file = new File("my-file.txt"); // в момент создания файла, если запустить программу, то файл не будет создан, он создастся только в момент обращения к нему
        // Alt + Enter на File, чтобы импортировать библиотеку java.io
//        File file = new File("/Users/pavelsemenenko/IdeaProjects/java-foundations-september-2020/src/main/resources/my-file.txt"); // абсолютный путь

// абсолютный путь не стоит применять, относительный путь применять, относительно нашего проекта

        // относительный путь, относительно нашего проекта
        File file = new File("src/main/resources/my-file.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file); // (file) передаем файл, идея скажет обработать ошибку
            printWriter.println("Privet"); // пишем в файл, при запуске программы, файл записался, но ничего не записалось в него, потому что поток не закрыт
            printWriter.close(); // закрыли поток, теперь после запуска, все записалось в файл
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        try {
//            BufferedReader fileReader = new BufferedReader(new FileReader(file)); // считываем с файла
//            System.out.println(fileReader.readLine()); // у файлридера берем строку и ее же выводим
//            fileReader.close(); // закрываем файлридер
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }

        // try with resources (AutoClosable) // в скобках прописываем BufferedReader
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file)))
        {
            System.out.println(fileReader.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // Все файлы должны лежать в папке resources



    }
}
