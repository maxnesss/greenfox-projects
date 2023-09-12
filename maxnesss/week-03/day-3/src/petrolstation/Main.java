package petrolstation;

public class Main {

    public static void main(String[] args) {
        Station benzina = new Station(1000);
        Car bmw = new Car();

        System.out.println(benzina.gasAmount);
        System.out.println(bmw.gasAmount);

        benzina.refill(bmw);

        System.out.println(benzina.gasAmount);
        System.out.println(bmw.gasAmount);



    }


}
