package homework4module.changeencoding;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("in.txt"));
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("out3.txt"), "utf16"));

            StringBuilder string = new StringBuilder();
            String leter;
            while ((leter = br.readLine()) != null) {
                string.append(leter + "\n");
            }
            System.out.println(string);
            bw.write(string.toString());

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
