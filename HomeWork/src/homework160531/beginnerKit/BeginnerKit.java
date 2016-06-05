package homework160531.beginnerKit;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class for creating beginner kit.
 */
public class BeginnerKit {

    private int numberBlackBallPen = 5;
    private int numberBlueFeatherPen = 3;
    private int numberBlackWorkbooklPen = 5;
    private int numberBlackNotebookPen = 2;

    BeginnerKit(){

    }

    BeginnerKit(int numberBlackBallPen,int numberBlueFeatherPen, int numberBlackWorkbooklPen,
                int numberBlackNotebookPen){
        this.numberBlackBallPen = numberBlackBallPen;
        this.numberBlueFeatherPen = numberBlueFeatherPen;
        this.numberBlackWorkbooklPen = numberBlackWorkbooklPen;
        this.numberBlackNotebookPen = numberBlackNotebookPen;
    }

    public Stationery createKit(){

        Stationery kit = new Stationery();

        for (int i = 0; i < numberBlackBallPen; i++) {
            Pen ball = new Pen("black", "ball", 12);
            kit.add(ball);
        }
        for (int i = 0; i < numberBlueFeatherPen; i++) {
            Pen feather = new Pen("blue", "feather", 15);
            kit.add(feather);
        }
        for (int i = 0; i < numberBlackNotebookPen; i++) {
            Notepad notebook = new Notepad("black", "notebook", 100);
            kit.add(notebook);
        }
        for (int i = 0; i < numberBlackWorkbooklPen; i++) {
            Notepad workbook = new Notepad("black", "workbook", 70);
            kit.add(workbook);
        }

        return kit;
    }

}
