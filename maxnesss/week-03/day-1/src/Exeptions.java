import java.util.Scanner;

public class Exeptions {

    public static void main(String[] args) {
        int first =5;
        System.out.println("enter number: ");
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();
        divideNumbers(first, second);



    }
    public static void divideNumbers (int first, int second){

        try {
            System.out.println(first/second);

        } catch (ArithmeticException exception){
            System.out.println("can not divide by 0");
        }
    }
}
