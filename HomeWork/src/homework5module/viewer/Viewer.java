package homework5module.viewer;

import java.io.File;

public class Viewer {
    public static void main(String[] args) {
        try {
            searchfiles(new File("/home/test/Untitle"));
        }catch (NoDirectoryExeption e){
            System.err.println("Enter existing directory");
        }

    }
    static void searchfiles(File topDirectory) throws NoDirectoryExeption {

        File[] list = topDirectory.listFiles();
        if(list==null) throw new NoDirectoryExeption("no such directory");

        System.out.println(list.length);
        for(File file:list){
            System.out.println(file);
        }
    }
}
