package payments;

public interface PaymentMethod {
    void processPayment(double amount);
    void collectPaymentDetails();
}
