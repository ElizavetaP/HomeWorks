package homework3module.questions;


import java.util.Locale;

/**
 * Usage example.
 */
public class User {
    public static void main(String[] args) {

        Resourses myBundle = new Resourses(new Locale("ru", "RU"));

        System.out.println(myBundle.getValue("question.1"));

        Resourses myBundle2 = new Resourses(new Locale("en", "US"));

        System.out.println(myBundle2.getValue("question.4"));

        System.out.println(myBundle.getQuestions());

        System.out.println(myBundle.getAnswer(6));

    }
}
