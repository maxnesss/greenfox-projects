package greenfoxorganization;

import java.util.ArrayList;
import java.util.List;

/*
Create a Cohort class that has the following

fields:
name: the name of the cohort
students: a list of Students
mentors: a list of Mentors
methods:
addStudent(Student): adds the given Student to students list
addMentor(Mentor): adds the given Mentor to mentors list
info(): prints "The name cohort has students.size() students and mentors.size() mentors."
The Cohort class has the following constructors:

Cohort(name): beside the given parameter it sets students and mentors to empty lists
 */
public class Cohort {
    private String name;
    private List<Student> listOfStudents;
    private List<Mentor> listOfMentors;

    Cohort(String name){
        this.name = name;
        this.listOfMentors = new ArrayList<>();
        this.listOfStudents = new ArrayList<>();
    }

    public void addStudent(Student student){
        listOfStudents.add(student);
    }
    public void addMentor(Mentor mentor){
        listOfMentors.add(mentor);
    }
    public void info(){
        System.out.println("The " +this.name+" cohort has "+this.listOfStudents.size()+" students and "+this.listOfMentors.size()+" mentors.");
    }
}
