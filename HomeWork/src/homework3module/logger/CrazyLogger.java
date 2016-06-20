package homework3module.logger;

import java.util.Calendar;
import java.util.Formatter;

/**
 *This class is used to create the log.
 */
public class CrazyLogger {

    StringBuilder logs = new StringBuilder();
    Calendar calendar = Calendar.getInstance();

    @Override
    public String toString() {
        return logs.toString();
    }

    public void append(Object obj) {
        Formatter formatter = new Formatter();
        formatter.format("%1$td-%1$tm-%1$tY : %1$tH-%1$tM - ", calendar);
        logs.append(formatter + "" + obj + ";\n");
    }

    /**
     *search in log.
     * @param str
     */
    public StringBuilder find(String str) {
        String[] logset = logs.toString().split(";");
        StringBuilder result = new StringBuilder();
        for (String log : logset) {
            if (log.indexOf(str) > 0) {
                result.append(log + ";");
            }
        }
        return result;
    }
}
