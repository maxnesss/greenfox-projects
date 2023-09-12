package printableinterface;

public class Main {


    public static void main(String[] args) {
        Domino dom1 = new Domino(3,4);
        System.out.println(dom1.printAllFields());

        ToDo task1 = new ToDo("Buy milk", "medium", false);
        System.out.println(task1.printAllFields());


    }
}
