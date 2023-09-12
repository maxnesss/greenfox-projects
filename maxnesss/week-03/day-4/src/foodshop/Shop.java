package foodshop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<ShopItem> stock;

    Shop(List<ShopItem> listOfitems){
        this.stock = listOfitems;
    }
    Shop(){
        this.stock = new ArrayList<>();
    }
    public void fillStock(ShopItem item){
        this.stock.add(item);
    }
    public void showStock(){
        int number = 1;
        for (ShopItem item : stock) {
            System.out.println(number+ ". item: " + item.getName() + ", " + item.getPrice() + "$, " + item.convertFreshnessToString() + " freshness" );
            number++;
        }
    }
    public int getStockValue(){
        int stockValue = 0;
        for (ShopItem item : stock) {
            stockValue += item.getPrice();
        }
        return stockValue;
    }
    public void sellItems (int price, boolean superHealthy){
        int moneyLeft = price;
        if(superHealthy){
            for (ShopItem item : stock) {
                if ((moneyLeft >= item.getPrice()) && (item.calculateFreshness() == 2) && (item.getPreservativePercentage() < 1)) {
                    moneyLeft -= item.getPrice();
                    stock.remove(item);
                }
            }

        }else {
            for (ShopItem item:stock) {
                if (moneyLeft>=item.getPrice()){
                    moneyLeft -= item.getPrice();
                    stock.remove(item);
                }
            }
        }
    }
    public void closeShop(){

        for (ShopItem item : stock) {
            System.out.println("Checking out and reducing prices");
            item.incrementDaysInTheShop();
            item.reducePrice();

        }

    }

}
