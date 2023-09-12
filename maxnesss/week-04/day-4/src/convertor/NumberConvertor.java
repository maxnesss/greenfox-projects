package convertor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberConvertor {
    public String convertIntToString(int intNumber){
        String stringNumber = "";
        String[] numbers = new String[]{"","one", "two", "three", "four", "five", "six", "seven", "eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] numberTens = new String[]{"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] numberNames = new String[]{"hundred","thousand","million"};

        String tempNmb;

        if ((intNumber%100)<20){
            tempNmb = numbers[intNumber%100];
            intNumber /= 100;
            } else {
            tempNmb = numbers[intNumber%10];
            intNumber /= 10;
            tempNmb = numberTens[intNumber % 10] +" "+ tempNmb;
            intNumber /= 10;
        }
        if (intNumber == 0) return tempNmb;
        return numbers[intNumber] + " hundred " + tempNmb;
    }
    public int convertStringToInt(String input){

        String[] numbers = new String[]{"","one", "two", "three", "four", "five", "six", "seven", "eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] numberTens = new String[]{"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

        List<String> numbL = new ArrayList<>();
        int nmbrFinal =0;

        if (input.split(" ").length>2) {
            for (int i = 0; i < numbers.length-1; i++) {
                if (input.equals(numbers[i])) {
                    nmbrFinal = i;
                }
            }
        } else if (input.split(" ").length==2) {
            for (int i = 0; i < numberTens.length-1; i++) {
            if (input.split(" ")[0].equals(numberTens[i])){
                nmbrFinal = i;
            }

            }

        }


        return nmbrFinal;
    }
}
