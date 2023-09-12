package postit;

public class Main {
    public static void main(String[] args) {

        PostIt example1 = new PostIt();
        example1.text ="Max";
        example1.backgroundColor = "Black";
        example1.textColor = "White";
        System.out.println(example1.text + " " + example1.textColor + " on "+ example1.backgroundColor);
    }
}
