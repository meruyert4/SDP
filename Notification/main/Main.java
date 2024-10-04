package main;

import notifications.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SMSNotification smsNotification = new SMSNotification();
        EmailNotification emailNotification = new EmailNotification();
        PushNotification pushNotification = new PushNotification();

        System.out.println("Choose a notification type:");
        System.out.println("1. SMS");
        System.out.println("2. Email");
        System.out.println("3. Push Notification");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String recipient = "";
        String message;

        switch (choice) {
            case 1: // SMS
                System.out.print("Enter the phone number: ");
                recipient = scanner.nextLine(); // Get phone number
                System.out.print("Enter your message: ");
                message = scanner.nextLine();
                smsNotification.send(recipient, message);
                break;
            case 2: // Email
                System.out.print("Enter the email address: ");
                recipient = scanner.nextLine(); // Get email address
                System.out.print("Enter your message: ");
                message = scanner.nextLine();
                emailNotification.send(recipient, message);
                break;
            case 3: // Push Notification
                System.out.print("Enter the username: ");
                recipient = scanner.nextLine(); // Get username
                System.out.print("Enter your message: ");
                message = scanner.nextLine();
                pushNotification.send(recipient, message);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid notification type.");
        }

        scanner.close();
    }
}
