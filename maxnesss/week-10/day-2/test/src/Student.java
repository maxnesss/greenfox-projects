import java.util.Map;

public class Student {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 10;
        fib(a);
        System.out.println("Fibonacci series of " + a + " is " + fib(a));



        //2d array
        int[][] arr = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j =0; j < 3; j++) {
                arr[i][j] = i + j;
            }
        }



    }
    public static int sum(int a, int b) {
        return a + b;
    }
    // recursive function for fibonacci series
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    // function to find factorial of given number
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n-1);
    }
    // function to check if a given number is prime or not
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    // function to find gcd of two numbers
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(a, b % a);
    }
    // function to find lcm of two numbers
    public static int lcm(int a, int b) {
        return (a*b)/gcd(a, b);
    }
    // function to find sum of digits of a number
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + sumOfDigits(n / 10));
    }
    // function to reverse a string
    public static String reverse(String str) {
        if ((str == null) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    // function to find factorial of a number
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    // function to check if a string is palindrome or not
    public static boolean isPalindrome(String str) {
        int len = str.length();
        if (len < 2) {
            return true;
        }
        if (str.charAt(0) != str.charAt(len - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, len - 1));
    }
    // function to find sum of natural numbers
    public static int sumOfNaturalNumbers(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumOfNaturalNumbers(n-1);
}
