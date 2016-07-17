package homework5module.viewer;

import java.io.*;

import static homework5module.viewer.Directories.searchfiles;
import static homework5module.viewer.Directories.writeToEndFile;
import static homework5module.viewer.Directories.writeToFile;

public class Viewer {
    public static void main(String[] args) throws Exception{
        try {
            searchfiles(new File("/home/test/Untitled"));
        } catch (NoDirectoryExeption e) {
            System.err.println("Enter existing directory");
        }
        FileInputStream in = new FileInputStream("Hello.java");

        int bytesAvailable = in.available();
        byte[] bytes = new byte[bytesAvailable];
        in.read(bytes);
        byte[] bytesToWrite = {1, 2, 3};
        writeToFile("/home/test/Untitled/write", bytesToWrite);
        writeToEndFile("/home/test/Untitled/write",bytes);
    }


}