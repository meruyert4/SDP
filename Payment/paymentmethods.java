package Payment;

class CreditCardPayment implements Payment{
    public void process(double amount){
        System.out.println("Payment with credit card: " + amount);
    }
}

class PayPalPayment implements Payment{
    public void process(double amount){
        System.out.println("Payment with PayPal: " + amount);
    }
}

class BankTransferPayment implements Payment{
    public void process(double amount){
        System.out.println("Payment with bank transfer: " + amount);
    }
}