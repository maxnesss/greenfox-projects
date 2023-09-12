        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements of `numbers`
public class SumAll {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};

        int sum = 0;
        // goes through all the elements and adds them together
        for (int element = 0; element < numbers.length; element++){
            sum += numbers[element];
        }

        System.out.println(sum);
    }
}