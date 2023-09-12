import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String,Integer> products = new HashMap<>(Map.of("Milk", 200,"Eggs", 200,"Fish", 400,"Apples",150,"Bread", 50, "Chicken", 550));

// products cost less than 201
        for (String i : products.keySet()){
            if (products.get(i)<201){
                System.out.println(i);
            }
        }
        // products which cost more than 150
        // product and price
        for (String i : products.keySet()){
            if(products.get(i)>150){
                System.out.println(i + " " + products.get(i));
            }
        }
    }
}
