public class EventBookingService implements EventBookingMediator{
    @Override
    public void bookTicket(EventBooking user) {
        user.notify("Your ticket booked successfully");
    }

    @Override
    public void cancelReservation(EventBooking user) {
        user.notify("Your reservation canceled");
    }

    @Override
    public void provideEventInformation(EventBooking user) {
        user.notify("Information about event*");
    }

}
