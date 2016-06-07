package homework160531.disciplines;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the base class for creating students.
 */
public class Student <T> {

    private  String name;
    private List<T> assessments = new ArrayList<>();


    public Student (String name){
        this.name = name;

    }


    public List<T> getAssessments() {
        return assessments;
    }

    public void addAssessment(T assessment) {
        this.assessments.add(assessment);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", assessments=" + assessments +
                '}';
    }


}
