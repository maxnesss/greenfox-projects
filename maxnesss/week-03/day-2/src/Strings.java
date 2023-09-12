// Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {
        System.out.println(change("maxnex"));



    }
    public static String change(String text){
        if (!text.contains("x")) {
            return text;
        } else {
            text = text.replace("x","y");
            return change(text);

        }
    }

}
