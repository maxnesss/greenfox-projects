// Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars removed.

public class String2 {
    public static void main(String[] args) {
        System.out.println(removeX("maxxxxx"));

    }

    public static String removeX(String text){
        if (!text.contains("x")){
            return text;
        } else {
            text = text.replace("x","");
            return text;
        }
    }
}
