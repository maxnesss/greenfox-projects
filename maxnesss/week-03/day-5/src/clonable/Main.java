package clonable;

public class Main {
    public static void main(String[] args) {

        Student mark = new Student("Mark",23,"male","UCAL");
        mark.getGoal();
        Student john = mark.cloneS("John");
        john.introduce();




    }
}
