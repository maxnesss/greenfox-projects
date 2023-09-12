package teacherstudent;

public class Teacher {
    public void giveAnswer(){
        System.out.println("The teacher is answering a queastion.");
    }
    public void teach(Student student){
        student.learns();
    }
}
