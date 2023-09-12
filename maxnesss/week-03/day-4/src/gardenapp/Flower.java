package gardenapp;

public class Flower extends Plant{
    Flower(String color) {
        super(color, "Flower");
    }

    @Override
    public boolean needsWater() {
        return getWaterLevel() < 5;
    }
    @Override
    public void gettingWater(int waterLevel) {
        setWaterLevel((int)(waterLevel*0.75));
    }
}
