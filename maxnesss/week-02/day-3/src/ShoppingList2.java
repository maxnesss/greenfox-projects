import java.util.HashMap;
import java.util.Map;


public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String,Double> products = new HashMap<>(Map.of("Milk",1.07,"Rice",
                1.59,"Eggs", 3.14, "Cheese",12.60,"Chicken Breasts", 9.4,"Apples",
                2.31,"Tomato",2.58, "Potato", 1.75, "Onion",1.1));

        HashMap<String,Integer> bobsList = new HashMap<>(Map.of("Milk",3,"Rice", 2,"Cheese",1,"Chicken Breasts", 4,
                "Apples", 1, "Tomato", 2, "Potato",1,"Eggs",2));

        HashMap<String,Integer> aliceList = new HashMap<>(Map.of("Rice",1,"Chicken Breasts", 2, "Apples", 1,"Tomato",10,"Eggs",5));
//        How much does Bob pay?
        int bobNoItems = 0;
        double bobSum = 0.0;
        for (String i : products.keySet()) {
            if (bobsList.containsKey(i)) {
                bobSum += (bobsList.get(i) * products.get(i));
                bobNoItems += bobsList.get(i);
            }
        }
        System.out.println(bobSum);

//                How much does Alice pay?
        int aliceNoItems = 0;
        double aliceSum = 0.0;
        for (String i : products.keySet()) {
            if (aliceList.containsKey(i)) {
                aliceSum += (aliceList.get(i) * products.get(i));
                aliceNoItems += aliceList.get(i);
            }
        }
        System.out.println(aliceSum);

//        Who buys more Rice?
        if (bobsList.get("Rice")>aliceList.get("Rice")){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
//        Who buys more Potato?
        if (bobsList.containsKey("Potato") && aliceList.containsKey("Potato")){
            if (bobsList.get("Potato")>aliceList.get("Potato")){
            System.out.println("Bob");
            } else {
            System.out.println("Alice");
            }
        } else if (!bobsList.containsKey("Potato")) {
            System.out.println("Alice");

        } else if (!aliceList.containsKey("Potato")) {
            System.out.println("Bob");

        } else{
                System.out.println("no one");
            }
//        Who buys more Ham?
        if (bobsList.containsKey("Ham") && aliceList.containsKey("Ham")){
            if (bobsList.get("Ham")>aliceList.get("Ham")){
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        } else{
            System.out.println("no one");
        }
//        Who buys more Apples?
        if (bobsList.containsKey("Apples") && aliceList.containsKey("Apples")){
            if (bobsList.get("Apples")>aliceList.get("Apples")){
                System.out.println("Bob");
            } else if (bobsList.get("Apples")<aliceList.get("Apples")) {
                System.out.println("Alice");

            } else {
                System.out.println("no one");
            }
        } else{
            System.out.println("no one");
        }
//        Who buys more of different products?
        if (bobsList.size()>aliceList.size()){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
//        Who buys more items? (more pieces)
        if (bobNoItems>aliceNoItems){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }


    }
}
