import java.util.Scanner;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    @Override
    public void processPayment(double amount) {
        System.out.println();
        System.out.println("Processing credit card payment of: " + amount + " KZT");
    }

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card number: ");
        cardNumber = scanner.nextLine();
        System.out.print("Enter expiration date (MM/YY): ");
        expirationDate = scanner.nextLine();
        System.out.print("Enter CVV: ");
        cvv = scanner.nextLine();
    }
}