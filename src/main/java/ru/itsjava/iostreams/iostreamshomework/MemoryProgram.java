package ru.itsjava.iostreams.iostreamshomework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class MemoryProgram {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

//         Вариант просто с записью 10 предложений
//        System.out.println("Введите путь файла и имя");
//        String fileName = scanner.nextLine();
//        int numberOfTextInputs = 0;
//        while (numberOfTextInputs != 10) {
//            System.out.println("Введите текст");
//            String inputText = scanner.nextLine();
//
//            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
//            fileWriter.write(inputText + "\n");
//            fileWriter.close();
//            numberOfTextInputs++;
//       }

        // вариант с сохранением только 10 предложений последних

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Введите путь файла и имя");
        String fileName = scanner.nextLine();
        while (true) {
            System.out.println("Введите текст, если надоело вводить текст, введите 'enough'");
            String inputText = scanner.nextLine();
            if (inputText.equalsIgnoreCase("enough")){
                break;
            }
            if (arrayList.size() == 10) {
                arrayList.remove(0);
            }
            arrayList.add(inputText);


            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
            for (String line: arrayList) {
             fileWriter.write(line + "\n");
        }
           fileWriter.close();

        }



    }


}
