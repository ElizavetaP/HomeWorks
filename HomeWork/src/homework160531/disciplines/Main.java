package homework160531.disciplines;

import java.util.ArrayList;
import java.util.List;

/**
 * Usage example.
 */
public class Main {
    public static void main(String[] args) {
        Group biology = new Group(Discipline.BIOLOGY);
        Group infotmatics = new Group(Discipline.INFORMATICS);


        Student <Integer> ivanov = new Student("Ivanov");
        ivanov.addAssessment(5);
        ivanov.addAssessment(4);
        ivanov.addAssessment(5);
        ivanov.addAssessment(5);

        Student <Integer> kozlov = new Student("Kozlov");
        Student <Double> zaycev = new Student("Zaycev");
        zaycev.addAssessment(4.7);
        zaycev.addAssessment(4.6);
        zaycev.addAssessment(4.9);

        biology.addStudent(ivanov);
        infotmatics.addStudent(zaycev);

        System.out.println(biology.printJournal());

        System.out.println(biology.isStudent(ivanov));
        System.out.println("/n");

        Discipline discipline = Discipline.BIOLOGY;
        discipline.addStudent(zaycev);
        System.out.println(discipline.printJournal());

    }
}
