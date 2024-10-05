import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentFactory factory = null;

        System.out.println("Choose the type of document to create:");
        System.out.println("1. PDF Document");
        System.out.println("2. Word Document");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                factory = new PDFDocumentFactory();
                break;
            case 2:
                factory = new WordDocumentFactory();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                scanner.close();
                return;
        }

        System.out.println("Enter the document name:");
        String documentName = scanner.nextLine();

        factory.generateDocument(documentName);
        scanner.close();
    }
}
