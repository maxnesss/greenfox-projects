// Given a non-negative integer n, return the sum of its digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));

    }
    public static int sumDigits(int inputNumber){

        if (inputNumber<10){
            return inputNumber;
        }else {

            int result = 0;
            result = inputNumber % 10 + sumDigits(inputNumber/10);
            return result;
        }
    }
}
