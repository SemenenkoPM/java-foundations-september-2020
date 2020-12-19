package ru.itsjava.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyPractice {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load( new FileInputStream("src/main/resources/application.properties"));

        System.out.println("properties.getProperty(\"db.url\") = " + properties.getProperty("db.url"));

        PropertyPractice.class.getClassLoader().getResourceAsStream("application.properties");
    }
}
