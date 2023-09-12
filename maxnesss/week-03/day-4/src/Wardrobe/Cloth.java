package Wardrobe;

public class Cloth {
    String type;
    String color;
    int condition;
    int daysWorn;
    int intialCondition;

    public int getCondition() {
        return condition;
    }

    Cloth(String type, int condition, int daysWorn){
        this.type = type;
        this.color = randomColor();
        this.condition = condition;
        this.daysWorn = daysWorn;
        this.intialCondition =condition;
    }

    public void wash(){
        if (condition>0 && needsToBeWashed()){
            this.daysWorn =0;
            condition -=1;
        }
    }
    public void repair(){
        if (type.equals("overwear") && needsToBeRepaird()){
            this.condition = intialCondition;
        }else {
            System.out.println("Can't repair underwear");
        }
    }

    public void wear(){
        if (!needsToBeWashed()){
            this.daysWorn +=1;
        }else {
            System.out.println("It's dirty!!");
        }
    }
    public void getInfo(){
        System.out.println(this.color+ " "+this.type+" worn for "+this.daysWorn+" days, has "+this.condition+" wash cycles left.");
    }

    public String randomColor(){
        String[] listOfColors = new String[]{"Blue","Black","Orange","Green","White","Brown","Violet","Navy blue"};
        return listOfColors[(int) (Math.random()*listOfColors.length)];
    }
    public boolean needsToBeWashed(){
        if (this.type.equals("underwear")){
            return daysWorn > 0;
        }
        return condition<=5;
    }
    public boolean needsToBeRepaird(){
        return condition<=5;
    }
}
