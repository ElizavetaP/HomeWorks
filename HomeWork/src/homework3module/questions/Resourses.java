package homework3module.questions;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * This class provides methods to work with ResourceBundle.
 */
public class Resourses {
    private ResourceBundle bundle;

    public Resourses(Locale locale) {

        bundle = ResourceBundle

                .getBundle("homework3module.questions.resources.prop", locale);

    }

    public String getValue(String key) {

        if (bundle.containsKey(key)) {
            return bundle.getString(key);
        } else{
            return "Еhere is no such key";
        }

    }

    public String getQuestions(){
        String result = "";
        int countOfQuestions = bundle.keySet().size()/2 + 1;
        for (int i = 1; i < countOfQuestions; i++) {
            result += getValue("question."+i) + "\n";
        }
        return result;
    }

    public String getAnswer(int numberOfQuestions){
       return getValue("answer." + numberOfQuestions);
    }
}
