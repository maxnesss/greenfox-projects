import java.util.List;

public class Test {

    public static void main(String[] args) {

    }
    public static int[] countPositivesSumNegatives(int[] input){
        int[] result =  new int[2];
        for (int j : input) {
            if (j > 0) {
                result[0] += j;
            }
            if (j < 0) {
                result[1] += j;
            }
        }

        return result; //return an array with count of positives and sum of negatives
    }
}
