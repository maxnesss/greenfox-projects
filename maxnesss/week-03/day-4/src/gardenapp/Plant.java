package gardenapp;

public abstract class Plant {
    private String color;
    private int waterLevel;
    private String type;

    Plant (String color, String type) {
        this.color = color;
        this.waterLevel = 0;
        this.type = type;
    }
    public abstract boolean needsWater();
    public void getStatus(){
        if (needsWater()){
            System.out.println("The " + color +" "+ type +" needs water.");
        } else {
            System.out.println("The " + color +" "+ type +" doesn't need water.");
        }
    }
    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel += waterLevel;
    }
    public abstract void gettingWater(int waterLevel);
}
