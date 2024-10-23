import java.util.Scanner;
import interpreter.*;
import memento.*;
import observer.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose a design pattern to run:");
            System.out.println("1. Interpreter Pattern (Arithmetic Evaluator)");
            System.out.println("2. Memento Pattern (Simple Text Editor with Undo)");
            System.out.println("3. Observer Pattern (News Agency Notification System)");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    runInterpreterPattern(scanner);
                    break;
                case 2:
                    runMementoPattern(scanner);
                    break;
                case 3:
                    runObserverPattern(scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }

        scanner.close();
    }

    private static void runInterpreterPattern(Scanner scanner) {
        System.out.println("Enter an arithmetic expression (e.g., '5 + 3 - 2'):");
        String expression = scanner.nextLine();
        int result = Interpreter.evaluate(expression);
        System.out.println("Result: " + result);
    }

    private static void runMementoPattern(Scanner scanner) {
        TextEditor editor = new TextEditor();
        History history = new History();

        while (true) {
            System.out.println("Current text: " + editor.getText());
            System.out.println("Options: [1] Type [2] Undo [3] Exit");
            int action = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (action) {
                case 1:
                    System.out.println("Enter text to type:");
                    String newText = scanner.nextLine();
                    history.save(editor.save());
                    editor.type(newText);
                    break;
                case 2:
                    Memento memento = history.undo();
                    if (memento != null) {
                        editor.restore(memento);
                    } else {
                        System.out.println("No states to undo.");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void runObserverPattern(Scanner scanner) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);

        while (true) {
            System.out.println("Enter a new headline or type 'exit' to stop:");
            String headline = scanner.nextLine();

            if (headline.equalsIgnoreCase("exit")) {
                break;
            }

            newsAgency.setHeadline(headline);
        }
    }
}
