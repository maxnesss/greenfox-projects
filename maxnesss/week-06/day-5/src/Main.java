

public class Main {
    public static void main(String[] args) {
        System.out.println(multiTable(5));


    }
    public static String multiTable(int num) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result = result.concat(i + " * " + num + " = " + i*num + "\n");
        }
            return result;
    }
}
