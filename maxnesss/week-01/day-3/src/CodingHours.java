//
// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52


public class CodingHours {
    public static void main(String[] args) {
        // How many hours each attendee spend coding per semester
        System.out.println("Each attendee spends " + 6 * 5 * 17 + " per semester coding.");

        // how many percent of 52 hour work week does average attendee spends coding
        System.out.println("Each attendee spends " + (float) (6 * 5) / 52 * 100 + " percent of week coding.");
    }
}
