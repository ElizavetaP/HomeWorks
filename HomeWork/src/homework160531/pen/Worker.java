package homework160531.pen;

/**
 * Created by test on 6/3/16.
 */
public class Worker {
    public static void main(String[] args) {
        Pen ball = new Pen("black", "ball", 12);
        Pen ball1 = new Pen("red", "ball", 12);
        Pen feather = new Pen("black", "feather", 15);
        Pen feather1 = new Pen("black", "feather", 15);


        System.out.println(ball);

        ball.setPrice(100);
        System.out.println(ball.getPrice());

        System.out.println(ball.equals(ball1));
        System.out.println(feather.equals(feather1));
    }
}
