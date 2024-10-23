import java.util.Scanner;
import interpreter.*;
import memento.*;
import observer.*;
import java.util.List;
import java.util.ArrayList;


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
            scanner.nextLine();

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
            scanner.nextLine();

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
        List<NewsChannel> subscribers = new ArrayList<>();

        NewsChannel channel1 = new NewsChannel("Astana");
        NewsChannel channel2 = new NewsChannel("Khabar");

        subscribers.add(channel1);
        subscribers.add(channel2);

        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);

        while (true) {
            System.out.println("Enter a new headline or type 'exit' to stop:");
            String headline = scanner.nextLine();

            if (headline.equalsIgnoreCase("exit")) {
                break;
            }

            newsAgency.setHeadline(headline);

            System.out.println("Do you want to add a new subscriber? (yes/no)");
            String addChoice = scanner.nextLine();

            if (addChoice.equalsIgnoreCase("yes")) {
                System.out.println("Enter the name of the new channel:");
                String newChannelName = scanner.nextLine();
                NewsChannel newChannel = new NewsChannel(newChannelName);
                newsAgency.addObserver(newChannel);
                subscribers.add(newChannel);
                System.out.println(newChannelName + " has been added as a subscriber.");
            }

            System.out.println("Do you want to remove a subscriber? (yes/no)");
            String removeChoice = scanner.nextLine();

            if (removeChoice.equalsIgnoreCase("yes")) {
                System.out.println("Enter the name of the channel to remove:");
                String channelToRemove = scanner.nextLine();

                NewsChannel channelToDelete = null;
                for (NewsChannel subscriber : subscribers) {
                    if (subscriber.getName().equalsIgnoreCase(channelToRemove)) {
                        channelToDelete = subscriber;
                        break;
                    }
                }

                if (channelToDelete != null) {
                    newsAgency.removeObserver(channelToDelete);
                    subscribers.remove(channelToDelete);
                    System.out.println(channelToRemove + " has been removed.");
                } else {
                    System.out.println("Channel not found.");
                }
            }
        }
    }
}
