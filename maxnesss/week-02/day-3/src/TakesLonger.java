        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It"
        // and "you" using the StringBuilder class!
public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder sb =new StringBuilder(quote);
        sb.insert(sb.indexOf("It")+3,"always takes longer than ");

        quote = sb.toString();



        System.out.println(quote);
    }
}