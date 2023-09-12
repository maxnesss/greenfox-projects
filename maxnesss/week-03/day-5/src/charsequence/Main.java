package charsequence;

public class Main {


    public static void main(String[] args) {

        String textToTest = "Maxim";
        Gnirts text = new Gnirts(textToTest);



        ShiftedCharSequence text1 = new ShiftedCharSequence("Maxim",1);
        System.out.println(text1.charAt(0));
    }
}
