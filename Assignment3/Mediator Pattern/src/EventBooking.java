public interface EventBooking {
    void requestTicket();
    void cancelReservation();
    void requestEventInformation();
    void notify(String message);
}
