package foodshop;

public abstract class ShopItem {
    private String name;
    private int price;
    private int preservativePercentage;


    private int daysInTheShop;


    ShopItem(String name, int price, int preservativePercentage){
        this.name = name;
        this.price= price;
        this.preservativePercentage = preservativePercentage;
        this.daysInTheShop = 0;

    }
    ShopItem(String name, int price, int preservativePercentage, int daysInTheShop){
        this.name = name;
        this.price= price;
        this.preservativePercentage = preservativePercentage;
        this.daysInTheShop = daysInTheShop;


    }
    public abstract int calculateFreshness();
    public abstract void reducePrice();

    public void incrementDaysInTheShop(){
        daysInTheShop++;
    }
    public String convertFreshnessToString(){
        if (calculateFreshness() == 0){
            return "bad";
        } else if (calculateFreshness() == 1) {
            return "ok";
        }
        return "good";
    }
    public int getDaysInTheShop() {
        return daysInTheShop;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getPreservativePercentage() {
        return preservativePercentage;
    }
}
