package homework3module.logger;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Created by Elizaveta on 6/16/16.
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
        formatter.format("%td-", calendar);
        formatter.format("%tm-", calendar);
        formatter.format("%tY : ", calendar);
        formatter.format("%tH-", calendar);
        formatter.format("%tM - ", calendar);
        logs.append(formatter + "" + obj + ";\n");
    }

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
