package teacherstudent;

public class Main {
    public static void main(String[] args) {
        Teacher karel = new Teacher();
        Student tomas = new Student();

        karel.teach(tomas);
        tomas.question(karel);
    }
}
