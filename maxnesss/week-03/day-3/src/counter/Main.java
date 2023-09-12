package counter;

public class Main {
    public static void main(String[] args) {
        Counter pc = new Counter();
        Counter mac = new Counter(5);

        pc.add();
        mac.add(5);

        mac.reset();

        System.out.println(pc.get());
        System.out.println(mac.get());
    }
}
