package foodshop;

public class Vegetable extends ShopItem{
    Vegetable(String name, int price) {
        super(name, price, 0);
    }

    Vegetable(String name, int price, int daysInTheShop) {
        super(name, price, 0, daysInTheShop);
    }

    @Override
    public int calculateFreshness() {
        if(getDaysInTheShop()>3){
            return 0;
        } else if (getDaysInTheShop()>1 && getDaysInTheShop()<=3) {
            return 1;
        }
        return 2;
    }

    @Override
    public void reducePrice() {
        int oldPrice = getPrice();
        int reducedPrice;

        if (calculateFreshness()==0){
            reducedPrice = (int)(oldPrice *0.6);
            System.out.println("Old price: " + oldPrice + "\nReduced Price (-40%): "+ reducedPrice);
        } else if (calculateFreshness() == 1) {
            reducedPrice = (int)(oldPrice *0.8);
            System.out.println("Old price: " + oldPrice + "\nReduced Price (-20%): "+ reducedPrice);
        }else{
            System.out.println("Old price: " + oldPrice+"\nThe price has not been reduced yet!");
            return;
        }
        setPrice(reducedPrice);
    }
}
