public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        // total number of seconds in a day: 60 seconds * 60 minutes * 24 hours
        int secondsInADay = 60 * 60 * 24;

        // how many seconds has passed today:
        int currentTime = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;

        // total number of seconds - total seconds in a day
        System.out.println("There are " + (secondsInADay - currentTime) + " seconds left today.");

    }
}
