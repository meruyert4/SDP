package Payment;

public class Main{
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();
        Payment bankTransfer = new BankTransferPayment();

        PaymentProcessor processor1 = new PaymentProcessor(creditCard);
        processor1.process(123);

        PaymentProcessor processor2 = new PaymentProcessor(payPal);
        processor1.process(432);

        PaymentProcessor processor3 = new PaymentProcessor(bankTransfer);
        processor1.process(1234);
    }
}