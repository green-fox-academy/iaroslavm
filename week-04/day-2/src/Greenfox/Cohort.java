package Greenfox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Student> cohortStudents = new ArrayList<>();
    private List<Mentor> cohortMentors = new ArrayList<>();

    Cohort() {
        this.name = "Generic";
    }

    Cohort(String name) {
        this.name = name;
    }

    void addStudent(){
        this.cohortStudents.add(new Student("Generic Student", 30, "binary","CEU"));
    }

    void addStudent(Student student){
        this.cohortStudents.add(student);
    }

    void addMentor(){
        this.cohortMentors.add(new Mentor("Generic Mentor", 30, "binary","intermediate"));
    }

    void addMentor(Mentor mentor){
        this.cohortMentors.add(mentor);
    }


    public List<Mentor> getCohortMentors() {
        return cohortMentors;
    }

    public List<Student> getCohortStudents() {
        return cohortStudents;
    }

    void info(){
        System.out.println("The " + this.name
        + " has " + this.cohortStudents.size() + " studentsand "
        + this.cohortMentors.size() + " mentors.");
    }

    String getName(){
        return this.name;
    }

}
