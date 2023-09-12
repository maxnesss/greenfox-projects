package greenfoxorganization;


public class Person {
    protected String name;
    protected int age;
    protected String gender;

    Person(){
        this.name = "Joe Doe";
        this.age = 30;
        this.gender = "female";
    }
    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
    public void introduce(){
        System.out.println("Hi, I'm "+this.name+", a "+this.age +" year old "+this.gender+".");
    }

}
