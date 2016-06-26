package homework4module.filereader;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
                "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected",
                "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
                "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};


        try {
            br = new BufferedReader(new FileReader("Hello.java"));
            bw = new BufferedWriter(new FileWriter("out2.txt"));

            StringBuilder string = new StringBuilder();
            string.append("");
            String leter;
            while ((leter = br.readLine()) != null) {
                string.append(leter + "\n");
            }
            System.out.println(string);
            StringBuilder lines = new StringBuilder();
            for (String word : keywords) {
                int count = 0;
                int fromIndex = 0;
                int readedByte = string.indexOf(word, fromIndex);
                while (readedByte > -1) {

                    count++;
                    readedByte = string.indexOf(word, fromIndex);
                    fromIndex = readedByte + word.length();

                }
                lines.append("The word " + "'" + word + "'" + " occurs in the file " + count + " times" + "\n");


            }
            bw.write(lines.toString());

        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());

        } finally {

            try {

                br.close();
                bw.close();

            } catch (IOException e) {

            }
        }
    }
}