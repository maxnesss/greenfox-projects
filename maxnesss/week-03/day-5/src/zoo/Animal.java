package zoo;

public abstract class Animal {
    private String name;
    Animal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract String breed();



}
