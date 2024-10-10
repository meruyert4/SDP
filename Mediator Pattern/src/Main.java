public class Main {
    public static void main(String[] args) {
        EventBookingMediator eventBookingService = new EventBookingService();

        EventBooking user1 = new User(eventBookingService, "Zhannur");
        EventBooking user2 = new User(eventBookingService, "Aida");
        EventBooking user3 = new User(eventBookingService, "Alice");

        user1.requestTicket();
        user1.cancelReservation();
        user1.requestEventInformation();

        user2.requestTicket();
        user2.requestEventInformation();
        user2.cancelReservation();

        user3.requestTicket();
        user3.requestEventInformation();
        user3.cancelReservation();
    }
}