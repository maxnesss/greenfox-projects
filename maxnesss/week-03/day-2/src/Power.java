public class Power {
    public static void main(String[] args) {

        System.out.println(powerTo(3,4));

    }
    public static int powerTo (int number, int power){
        if (power<=1){
            return power;
        }else {
            int result = 1;
            result = (number*number) * powerTo(number,power-1);
            return result;

        }


    }
}
