package homework160531.disciplines;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 6/7/16.
 */
public class Group<T extends Number> {
    private Discipline discipline;
    private List<Student<T>> journal = new ArrayList<>();

    public Group(Discipline discipline) {
        this.discipline = discipline;
    }

    public List<Student<T>> getJournal() {
        return journal;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void addStudent(Student student) {
        journal.add(student);
    }

    public void removeStudent(Student student) {
        journal.remove(student);
    }

    public String printJournal() {
        return discipline + " " + journal.toString();
    }

    private Student<T> getStudent(String name) {
        for (Student<T> student : journal) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public boolean containStudent(String name) {
        return getStudent(name) != null;
    }

    public List<T> getGrades(String name) {
        if (containStudent(name)) {
            return getStudent(name).getAssessments();

        }
        return null;
    }

    public double average(String name) {
        if (containStudent(name)) {
            List<T> grades = getGrades(name);
            double sum = 0;
            for (T grade : grades) {
                sum += grade.doubleValue();
            }
            return sum / grades.size();
        }

        return -1;
    }
}