package greenfoxorganization;

public class Sponsor extends Person{
    private String company;
    private int hiredStudents;
    Sponsor(String name, int age,String gender, String company){
        this.name =name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents =0;
    }
    Sponsor(){
        this.company = "Google";
        this.hiredStudents = 0;
    }


    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }
    public void introduce(){
        System.out.println("Hi, I'm "+name+", a "+age+" year old "+gender+" who represents "+company+" and hired "+hiredStudents+" students so far.");
    }
    public void hire(){
        hiredStudents+=1;
    }
}
