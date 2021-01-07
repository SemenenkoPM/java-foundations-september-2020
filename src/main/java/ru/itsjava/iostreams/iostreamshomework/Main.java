package ru.itsjava.iostreams.iostreamshomework;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User ivan = new User("Ivan", "dfsffsd");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/user.out"));
        objectOutputStream.writeObject(ivan);

        ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("src/main/resources/user.out"));
        Object objIvan = objectInputStream.readObject();
        System.out.println("objIvan = " + objIvan);
        // как после десериализации получить гет, сет?

        BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/file1.txt"));
        String strLine;
        ArrayList<String> listFromFile1 = new ArrayList<>();
        while ((strLine = fileReader.readLine()) != null)   {
            listFromFile1.add(strLine);
        }
        fileReader.close();
        System.out.println("listFromFile1 = " + listFromFile1);

        fileReader = new BufferedReader(new FileReader("src/main/resources/file2.txt"));

        ArrayList<String> listFromFile2 = new ArrayList<>();
        while ((strLine = fileReader.readLine()) != null)   {
            listFromFile2.add(strLine);
        }
        fileReader.close();
        System.out.println("listFromFile2 = " + listFromFile2);

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter("src/main/resources/file1.txt"));
        for (String line: listFromFile2){
            fileWriter.write(line+ "\n");
        }
        fileWriter.close();

        fileWriter = new BufferedWriter(new FileWriter("src/main/resources/file2.txt"));
        for (String line: listFromFile1){
            fileWriter.write(line + "\n");
        }
        fileWriter.close();
    }
}
