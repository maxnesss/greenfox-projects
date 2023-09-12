package clonable;

public class Student extends Person implements CanClone {
    private String previousOrganization;
    private int skippedDays;

    Student(){

        this.previousOrganization = "The school of life";
        this.skippedDays = 0;

    }
    Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);


        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }
    @Override
    public void introduce(){
        System.out.println("Hi, I'm "+this.name+", a "+this.age +" year old "+this.gender+" from "+ this.previousOrganization+ " who skipped "+skippedDays);
    }
    public void skipDays(int skippedDays){
        this.skippedDays = skippedDays;
    }

    @Override
    public Student cloneS(String newStudentName) {
        return new Student(newStudentName,this.age,this.gender,this.previousOrganization);




    }
}
