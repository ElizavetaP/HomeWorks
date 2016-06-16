package homework3module.logger;

/**
 * Created by Elizaveta on 6/16/16.
 */
public class Main {
    public static void main(String[] args) {
        CrazyLogger logger = new CrazyLogger();
        logger.append("asddfg");

        logger.append("asddfg");
        System.out.println(logger);
    }
}
