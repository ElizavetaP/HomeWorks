package homework4module.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream in = null;
        String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
                "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected",
                "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
                "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};


        try {
            in = new FileInputStream("Hello.java");
            int bytesAvailable = in.available();
            byte[] bytes = new byte[bytesAvailable];
            in.read(bytes);
            String string = new String(bytes);
            for (String word : keywords) {
                int count = 0;
                int fromIndex = 0;
                while (string.indexOf(word, fromIndex) > -1) {

                    count++;
                    fromIndex = string.indexOf(word, fromIndex) + word.length();

                }
                System.out.println("The word " + "'" + word + "'" + " occurs in the file " + count + " times");
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());

        } finally {

            try {

                in.close();

            } catch (IOException e) {

            }
        }
    }
}