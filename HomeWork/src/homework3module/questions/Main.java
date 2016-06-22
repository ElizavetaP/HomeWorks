package homework3module.questions;


import java.util.Locale;

/**
 * Usage example.
 */
public class Main {
    public static void main(String[] args) {

        Resourses myBundle = new Resourses(new Locale("ru", "RU"));

        int i = 1;
        for (String question : myBundle.getQuestions()) {
            System.out.println(i + "-question: " + question);
            i++;
        }

        System.out.println(myBundle.getAnswer(3));
        System.out.println(myBundle.getAnswer(6));

        Resourses myBundle2 = new Resourses(new Locale("en", "US"));

        System.out.println(myBundle2.getAnswer(5));

    }
}
