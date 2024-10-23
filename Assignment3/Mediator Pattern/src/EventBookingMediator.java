public interface EventBookingMediator {
    void bookTicket(EventBooking user);
    void cancelReservation(EventBooking user);
    void provideEventInformation(EventBooking user);
}
