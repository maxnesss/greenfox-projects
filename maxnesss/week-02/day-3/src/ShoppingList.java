
//        Create a list with the following items:
//        eggs, milk, fish, apples, bread and chicken
//        Create an application which prints out the answers to the following questions:
//        Do we have milk in the shopping list? (yes/no)
//        Do we have bananas in the shopping list? (yes/no)
//        The full output of your main method should be the following:
//
//        yes
//        no

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread","chicken"));

        // interface
        System.out.println("Do we have in out shopping list? ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.next();

        doWeHaveInShoppingList(item,shoppingList);

        System.out.println();

    }
    public static void doWeHaveInShoppingList(String item, ArrayList<String> shoppingList){
        if (shoppingList.contains(item)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
