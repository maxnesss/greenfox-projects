public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables without changing the following 2 lines of code
        int a = 123;
        int b = 526;

        // Write your code here:

        // Declaring extra variable to make extra room for swap
        int c;


        // a goes to c,   b goes to a and then c goes to b
        c = a;
        a = b;
        b = c;


        System.out.println(a);
        System.out.println(b);
    }
}
