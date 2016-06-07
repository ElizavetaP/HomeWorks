package homework160531.disciplines;

import java.util.ArrayList;
import java.util.List;

/**
 * Enum for creating disciplines.
 */
public enum Discipline {
    MATHEMATICS, LITERATURE, INFORMATICS, BIOLOGY;

    private List <Student> journal = new ArrayList<>();

    public List<Student> getJournal() {
        return journal;
    }

    public void addStudent(Student student){
        switch (this){
            case MATHEMATICS:
            case INFORMATICS:
                if (new Double(0.0).getClass()==student.getAssessments().get(0).getClass()){
                    journal.add(student);
                }else{
                    journal.add((Student <Double>)student);
                }
                break;
            case BIOLOGY:
            case LITERATURE:
                if (new Integer(0).getClass()==student.getAssessments().get(0).getClass()){
                    journal.add(student);
                }else{
                    journal.add((Student <Integer>)student);
                }
                break;
        }
    }

    public String printJournal(){
        return this + " " + journal.toString();
    }

    public boolean isStudent(String name){
        for (Student student:getJournal()) {
            if(student.getName()==name){
                //System.out.println(name + " is a student of " + this);
                return true;
            }

        }
        return false;
    }
}
