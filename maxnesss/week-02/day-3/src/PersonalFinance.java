//Create a list with the following items:
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which prints out the answers to the following questions:
//        How much did we spend?
//        Which was our greatest expense?
//        Which was our cheapest spending?
//        What was the average amount of our spendings? (print this as a float value)


import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expenses = new ArrayList<>(Arrays.asList(500,1000,1250,175,800,120));
        System.out.println(expenses);
        // how much did we spend
        int sum = 0;
        for (int i = 0; i<expenses.size();i++){
            sum += expenses.get(i);
        }

        System.out.println("We spend: " + sum);

        // greatest expense
        int highestExpense = expenses.get(0);
        for (int element = 0; element<expenses.size(); element++){
            if (highestExpense<expenses.get(element)){
                highestExpense = expenses.get(element);
            }
        }
        System.out.println("Highest expense: " + highestExpense);
        // lowest expense
        int lowestExpense = expenses.get(0);
        for (int element =0;element<expenses.size(); element++){
            if (lowestExpense>expenses.get(element)){
                lowestExpense = expenses.get(element);
            }
        }
        System.out.println("Lowest expense:" + lowestExpense);
        // avarage of expenses
        double average = (double) sum /expenses.size();
        System.out.println("Average spending: " + average);
    }
}
