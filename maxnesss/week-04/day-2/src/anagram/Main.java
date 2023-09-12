package anagram;

public class Main {

    public static void main(String[] args) {
    String text1 = "maxim";
    String text2 = "mixam";

    isAnagram(text1, text2);
        System.out.println(isAnagram(text1,text2));
    }

    public static boolean isAnagram(String text1, String text2) {
        StringBuilder sb = new StringBuilder(text2);
        text2 = sb.reverse().toString();
        return text2.equals(text1);
    }

}
