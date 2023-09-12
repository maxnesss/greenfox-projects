package foodshop;

public class Main {
    public static void main(String[] args) {
        Dairy milk = new Dairy("Milk",20,20);
        Vegetable carrot = new Vegetable("carrot", 12);


        Shop tesco = new Shop();
        tesco.fillStock(milk);
        tesco.fillStock(carrot);
        tesco.showStock();
        System.out.println(tesco.getStockValue());
        tesco.showStock();
        tesco.closeShop();
    }
}
