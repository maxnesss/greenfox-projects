// Given a string, write a recursive (no loops) method which returns a new
// string with all adjacent chars separated by an `*`. Please note that there
// should be no trailing `*` at the end of the returned string. For example,
// the string `word` should be changed to `w*o*r*d`.
public class String3 {
    public static void main(String[] args) {
        System.out.println(transform("max"));

    }
    public static String transform(String text){



        return text.replace("","*");
    }
}
