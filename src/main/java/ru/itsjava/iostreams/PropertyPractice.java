package ru.itsjava.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyPractice {
    public static void main(String[] args) throws IOException {

//        // в любом приложении есть настройки, например где находится база данных, для этих целей проперти
//        // класс Properties
//        Properties properties = new Properties(); // создали обьект
//        properties.load( new FileInputStream("src/main/resources/application.properties"));
//
//        // наверх IOException прокинуть не забыть
//
//        System.out.println("properties.getProperty(\"db.url\") = " + properties.getProperty("db.url"));

        // правильная загрузка пропертис
        PropertyPractice.class.getClassLoader().getResourceAsStream("application.properties");

        Properties properties = new Properties();
        properties.load( new FileInputStream("src/main/resources/application.properties"));

        System.out.println("properties.getProperty(\"db.url\") = " + properties.getProperty("db.url"));

    }
}
