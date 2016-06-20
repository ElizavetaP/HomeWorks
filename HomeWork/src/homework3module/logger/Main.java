package homework3module.logger;

/**
 * Usage example.
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
