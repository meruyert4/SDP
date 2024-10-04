package payments;

import java.util.Scanner;

public class BankTransferPayment implements PaymentMethod {
    private String accountNumber;
    private String routingNumber;

    @Override
    public void processPayment(double amount) {
        System.out.println();
        System.out.println("Processing bank transfer payment of: " + amount + " KZT");
    }

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bank account number: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter routing number: ");
        routingNumber = scanner.nextLine();
    }
}
