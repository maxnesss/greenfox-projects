import java.util.HashMap;
import java.util.Map;


public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String,Integer> products = new HashMap<>(Map.of("Milk", 200,"Eggs", 200,"Fish", 400,"Apples",150,"Bread", 50, "Chicken", 550));
//        How much is the fish?
        System.out.println(products.get("Fish"));
//                What is the most expensive product?
        int highestPrice = 0;
        String highestPriceString = "";
        for(String i : products.keySet()){
            if (highestPrice< products.get(i)){
                highestPrice = products.get(i);
                highestPriceString = i;
            }
        }
        System.out.println(highestPriceString);
//                What is the average price?
        int sum = 0;

        for(String i : products.keySet()){
            sum += products.get(i);
        }
        double average = (double) sum /products.size();
        System.out.println(average);
//        How many products' price is below 300?
        int numberOfProductsBellow300 = 0;
        for (String i : products.keySet()){
            if (products.get(i)<300){
                numberOfProductsBellow300++;
            }
        }
        System.out.println(numberOfProductsBellow300);
//        Is there anything we can buy for exactly 125?
        String a = "no";
        for (String i : products.keySet()){
            if(products.get(i) == 125){
                System.out.println(i);
                a = "yes";
            }
        }
        System.out.println(a);

//                What is the cheapest product?
        int lowestPrice = products.get("Fish");
        String lowestPriceString = "";
        for(String i : products.keySet()){
            if (lowestPrice > products.get(i)){
                lowestPrice = products.get(i);
                lowestPriceString = i;
            }
        }
        System.out.println(lowestPriceString);

    }
}
