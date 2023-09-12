package foodshop;

public class Dairy extends ShopItem{


    Dairy(String name, int price, int preservativePercentage) {
        super(name, price, preservativePercentage);
    }

    Dairy(String name, int price, int preservativePercentage, int daysInTheShop) {
        super(name, price, preservativePercentage, daysInTheShop);
    }

    @Override
    public int calculateFreshness() {
        if (getDaysInTheShop() > 5) {
            return 0;
        } else if (getDaysInTheShop() > 3 && getDaysInTheShop() <= 5) {
            return 1;
        }
        return 2;
    }

    @Override
    public void reducePrice() {
        int oldPrice = getPrice();
        int reducedPrice;

        if (calculateFreshness()==0){
            reducedPrice = (int)(oldPrice *0.5);
            System.out.println("Old price: " + oldPrice + "\nReduced Price (-50%): "+ reducedPrice);
        } else if (calculateFreshness() == 1) {
            reducedPrice = (int)(oldPrice *0.7);
            System.out.println("Old price: " + oldPrice + "\nReduced Price (-30%): "+ reducedPrice);
        }else{
            System.out.println("Old price: " + oldPrice+"\nThe price has not been reduced yet!");
            return;
        }
        setPrice(reducedPrice);
    }
}
