package homework160531.pen;

/**
 * Created by test on 6/3/16.
 */
public class worker {
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

    }
}
