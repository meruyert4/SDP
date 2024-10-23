class User implements EventBooking{
    private EventBookingMediator mediator;
    private String name;

    public User(EventBookingMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public void requestTicket(){
        mediator.bookTicket(this);
    }

    public void cancelReservation(){
        mediator.cancelReservation(this);
    }

    public void requestEventInformation(){
        mediator.provideEventInformation(this);
    }

    public String getName(){
        return name;
    }

    public void notify(String message){
        System.out.println(name + ": " + message);
    }

}
