package reservations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Reservation> listOfReservations = new ArrayList<>();

        Reservation res001 = new Reservation();
        Reservation res002 = new Reservation();
        Reservation res003 = new Reservation();
        Reservation res004 = new Reservation();
        listOfReservations.add(res001);
        listOfReservations.add(res002);
        listOfReservations.add(res003);
        listOfReservations.add(res004);

        for (Reservation reservation :
                listOfReservations) {
            reservation.show();
        }
    }
}
