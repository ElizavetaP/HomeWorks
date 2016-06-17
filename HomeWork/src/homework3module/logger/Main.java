package homework3module.logger;

/**
 * Created by Elizaveta on 6/16/16.
 */
public class Main {
    public static void main(String[] args) {
        CrazyLogger logger = new CrazyLogger();

        logger.append("asddfg");
        logger.append("asddfg");
        logger.append("wert");
        logger.append("tttt");
        logger.append("asddfgqqq");

        System.out.println(logger);
        System.out.println(logger.find("sdd"));
    }
}
