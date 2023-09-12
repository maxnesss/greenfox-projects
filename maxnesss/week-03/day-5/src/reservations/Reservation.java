package reservations;

import java.util.Random;

public class Reservation implements Reservable{
    private String reservationCode;
    private String reservationDay;
    Reservation(){
        this.reservationCode = getBookingCode();
        this.reservationDay = getBookingDow();
    }
    @Override
    public String getBookingDow() {
        String[] arrDays = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int rand = (int)(Math.random()*7);
        return arrDays[rand];
    }

    @Override
    public String getBookingCode() {
        String validChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(validChars.length());
            char randomChar = validChars.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
    public void show(){
        System.out.println("Booking# "+this.reservationCode+" for "+this.reservationDay);
    }
}
