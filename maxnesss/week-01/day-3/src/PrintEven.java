// Create a program that prints all even numbers between 0 and 500 (both included)
// Each number should be on a new line
public class PrintEven {
    public static void main(String[] args) {
        for (int line = 0; line <= 500; line++) {
            if (line % 2 == 0) {
                System.out.println(line);
            }
        }
    }

}
