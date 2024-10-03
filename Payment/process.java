package Payment;

class PaymentProcessor{
    private Payment method;
    public PaymentProcessor(Payment method){
        this.method = method;
    }
    public void process(double amount){
        method.process = processPayment(amount)
    }
}