package teacherstudent;

/*
Create Student and Teacher classes
Student
learn() -> prints: the student is actually learning
question(teacher) -> calls the teacher's giveAnswer() method
Teacher
teach(student) -> calls the student's learn() method
giveAnswer() -> prints: the teacher is answering a question
Instantiate a Student and Teacher object
Call the student's question() method and the teacher's teach() method
 */

public class Student {


    public void learns(){
        System.out.println("The Student is actually learning.");
    }
    public void question(Teacher teacher){
        teacher.giveAnswer();
    }
}
