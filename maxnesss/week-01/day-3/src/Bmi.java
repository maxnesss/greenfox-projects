//
// Script that prints BMI
//
public class Bmi {
    public static void main(String[] args) {
        // input values
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        // Mass in kg divided by height in meters squared
        double bmi = massInKg / (heightInM * heightInM);
        System.out.println("Your BMI is: " + (int) bmi);
    }


}
