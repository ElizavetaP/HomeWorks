package homework160531.accountingStationery;

import java.util.ArrayList;

/**
 * Usage example.
 */
public class Worker {
    public static void main(String[] args) {
        Stationery stationery = new Stationery();

        Pen ball = new Pen("black", "ball", 12);
        Pen ball1 = new Pen("red", "ball", 12);
        Pen feather = new Pen("black", "feather", 15);
        Pen feather1 = new Pen("black", "feather", 15);

        stationery.add(ball);
        stationery.add(ball1);
        stationery.add(feather);
        stationery.add(feather1);

        System.out.println(stationery);

        stationery.remove(feather1);

        System.out.println(stationery);

        Notepad notebook = new Notepad("green", "notebook", 100);
        Notepad notebook1 = new Notepad("green", "notebook", 120);
        Notepad workbook = new Notepad("black", "workbook", 100);
        Notepad workbook1 = new Notepad("blue", "workbook", 100);

        stationery.add(notebook);
        stationery.add(notebook1);
        stationery.add(notebook);
        stationery.add(workbook);
        stationery.add(workbook1);

        System.out.println(stationery);

        System.out.println(notebook.equals(notebook1));

        System.out.println(stationery.totalCost());

        

    }
}
