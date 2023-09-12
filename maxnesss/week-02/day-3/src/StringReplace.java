        // Below is a famous sentence from the beginning of a famous movie, but it has a problem.
        // Someone played a prank on us and replaced the word "galaxy" with "dishwasher".
        // Please fix the sentence so that the code prints "In a galaxy far, far away" to the console
public class StringReplace {

    public static void main(String[] args) {
        String example = "In a dishwasher far, far away";

        StringBuilder sb = new StringBuilder(example);
        sb.replace(5,15,"galaxy");
        example = sb.toString();





        System.out.println(example);
    }
}
