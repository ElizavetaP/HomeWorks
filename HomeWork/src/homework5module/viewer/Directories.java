package homework5module.viewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Directories {
    static void searchfiles(File topDirectory) throws NoDirectoryExeption {

        File[] list = topDirectory.listFiles();
        if (list == null) throw new NoDirectoryExeption("no such directory");

        System.out.println(list.length);
        for (File file : list) {
            System.out.println(file);
        }
    }

    static void writeToFile(String fileName, byte[] bytesToWrite) {

        try {
            FileOutputStream outFile = new FileOutputStream(fileName);
            outFile.write(bytesToWrite);
            System.out.println("Записано: " + bytesToWrite.length + " байт");
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        }
    }
    static void writeToEndFile(String fileName, byte[] bytesToWrite) {

        try {
            FileOutputStream outFile = new FileOutputStream(fileName, true);
            outFile.write(bytesToWrite);
            System.out.println("Записано: " + bytesToWrite.length + " байт");
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        }
    }

}
