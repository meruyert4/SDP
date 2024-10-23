import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskHandler level1 = new Level1TaskHandler();
        TaskHandler level2 = new Level2TaskHandler();
        TaskHandler level3 = new Level3TaskHandler();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        Scanner scanner = new Scanner(System.in);

        // ask the user how many tasks they want to input
        System.out.println("How many tasks you want to input? ");
        int numberOfTasks = scanner.nextInt();
        scanner.nextLine();

        // creating a list to store tasks
        List<Request> taskList = new ArrayList<>();

        // getting task and its priority from the user
        for (int i = 0; i < numberOfTasks; i++) {
            System.out.print("Enter the task " + (i + 1) + ": ");
            String taskDescription = scanner.nextLine();

            Priority priority = null;
            while (priority == null) {
                System.out.print("Enter the priority for task " + (i + 1) + " (LOW, MEDIUM, HIGH): ");
                String priorityInput = scanner.nextLine().toUpperCase();

                // converting string value to enum
                try {
                    priority = Priority.valueOf(priorityInput);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid priority. Enter LOW / MEDIUM / HIGH.");
                } //handling error
            }

            Request request = new Request(taskDescription, priority);
            taskList.add(request);
        }

        // processing each task
        System.out.println("\nProcessing tasks based on priority:");
        for (Request task : taskList) {
            level1.handleRequest(task);
        }

        scanner.close();
    }
}
