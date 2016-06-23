package homework3module.questions;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * This class provides methods to work with ResourceBundle.
 */
public class Resources {
    private ResourceBundle bundle;

    public Resources(Locale locale) {

        bundle = ResourceBundle

                .getBundle("homework3module.questions.resources.prop", locale);

    }

    private String getValue(String key) {

        if (bundle.containsKey(key)) {
            return bundle.getString(key);
        } else {
            return "There is no such key";
        }

    }

    public String[] getQuestions() {
        int countOfQuestions = bundle.keySet().size() / 2;
        String[] result = new String[countOfQuestions];

        for (int i = 1; i <= countOfQuestions; i++) {
            result[i - 1] = getValue("question." + i);
        }
        return result;
    }

    public String getAnswer(int numberOfQuestions) {
        return getValue("answer." + numberOfQuestions);
    }
}
