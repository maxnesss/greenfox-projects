        // Create a `divide10By` function that divides number 10 (integer)
        // by an integer number that's passed as a parameter and prints the result.
        // The result of the division should be an integer as well (not a floating point number).
        // It should print "fail" if the parameter is 0
public class DivideByZero {
    public static void main(String[] args) {

        // Examples:
        divide10By(2); // should print 5
        divide10By(5); // should print 2
        divide10By(4); // should print 2
        divide10By(3); // should print 3
        divide10By(0); // should print fail
    }

    private static void divide10By(int i) {
        try {
            int result = 10/i;
            System.out.println(result);
        } catch (ArithmeticException exception){
            System.out.println("fail");
        }


    }

        }