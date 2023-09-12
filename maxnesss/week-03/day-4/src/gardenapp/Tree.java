package gardenapp;

public class Tree extends Plant{
    Tree(String color) {
        super(color, "Tree");
    }

    @Override
    public boolean needsWater() {
        return getWaterLevel() < 10;
    }
    @Override
    public void gettingWater(int waterLevel) {
        setWaterLevel((int)(waterLevel*0.4));
    }
}
