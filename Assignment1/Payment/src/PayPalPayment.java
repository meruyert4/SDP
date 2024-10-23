import java.util.Scanner;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    @Override
    public void processPayment(double amount) {
        System.out.println();
        System.out.println("Processing PayPal payment of: " + amount + " KZT");
    }

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PayPal email: ");
        email = scanner.nextLine();
        System.out.print("Enter PayPal password: ");
        password = scanner.nextLine();
    }
}