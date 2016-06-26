package homework4module.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;
        String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
                "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected",
                "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
                "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};


        try {
            in = new FileInputStream("Hello.java");
            out = new FileOutputStream("out.txt");
            int bytesAvailable = in.available();
            byte[] bytes = new byte[bytesAvailable];
            in.read(bytes);
            String string = new String(bytes);
            StringBuilder line = new StringBuilder();
            for (String word : keywords) {
                int count = 0;
                int fromIndex = 0;
                while (string.indexOf(word, fromIndex) > -1) {

                    count++;
                    fromIndex = string.indexOf(word, fromIndex) + word.length();

                }
                line.append("The word " + "'" + word + "'" + " occurs in the file " + count + " times" + "\n");


            }
            byte[] linebytes = line.toString().getBytes();
            out.write(linebytes);

        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());

        } finally {

            try {

                in.close();
                out.close();

            } catch (IOException e) {

            }
        }
    }
}