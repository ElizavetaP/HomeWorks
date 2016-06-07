package homework160531.disciplines;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 6/7/16.
 */
public class Group <T>{
    private Discipline discipline;
    private List <Student<T>> journal = new ArrayList<>();

    public Group(Discipline discipline){
        this.discipline=discipline;
    }

    public List<Student<T>> getJournal() {
        return journal;
    }

    public void addStudent(Student student){
        journal.add(student);
    }

    public void removeStudent(Student student){
        journal.remove(student);
    }

    public String printJournal(){
        return discipline + " " + journal.toString();
    }

    public String isStudent(Student student){
        for (Student<T> stud:journal) {
            if(stud==student){
                return  student.getName() + " is a student of " + discipline;
            }

        }
        return student.getName() + " isn't a student of " + discipline;
    }
 }
