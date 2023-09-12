public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(6));

    }
    public static int fib(int index){
       if (index<2) return index;


        return fib(index-1)+fib(index-2);
    }
}
