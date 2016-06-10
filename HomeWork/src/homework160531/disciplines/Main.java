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
        Group mathematics = new Group(Discipline.MATHEMATICS);

        List<Group> groups = new ArrayList<>();
        groups.add(biology);
        groups.add(infotmatics);
        groups.add(mathematics);


        Student<Integer> ivanov = new Student("Ivanov");
        ivanov.addAssessment(5);
        ivanov.addAssessment(4);
        ivanov.addAssessment(5);
        ivanov.addAssessment(5);
        biology.addStudent(ivanov);

        Student<Integer> zverev = new Student("Zverev");
        zverev.addAssessment(4);
        zverev.addAssessment(4);
        zverev.addAssessment(3);
        zverev.addAssessment(4);
        biology.addStudent(zverev);

        Student<Double> kozlov = new Student("Kozlov");
        kozlov.addAssessment(4.7);
        kozlov.addAssessment(4.6);
        kozlov.addAssessment(4.9);
        infotmatics.addStudent(kozlov);

        Student<Double> ivanov2 = new Student("Ivanov");
        ivanov2.addAssessment(4.7);
        ivanov2.addAssessment(4.6);
        ivanov2.addAssessment(4.9);
        infotmatics.addStudent(ivanov2);

        String name = "Ivanov";
        for (Group group : groups) {
            if (group.containStudent(name)) {
                System.out.println(name + " is in group " + group.getDiscipline());
                System.out.println("average grade = " + group.average(name));
            }
        }


    }
}
