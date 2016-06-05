package homework160531.beginnerKit;

/**
 * Usage example.
 */
public class Main {
    public static void main(String[] args) {
        BeginnerKit kit = new BeginnerKit();
        System.out.println(kit.createKit());
        System.out.println(kit.createKit().totalCost());
    }
}
