import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a theme (1 = Light, 2 = Dark): ");
        int choice = scanner.nextInt();

        ThemeFactory themeFactory;

        if (choice == 1) {
            themeFactory = new LightThemeFactory();
        } else if (choice == 2) {
            themeFactory = new DarkThemeFactory();
        } else {
            System.out.println("Invalid choice. Defaulting to Light Theme.");
            themeFactory = new LightThemeFactory();
        }

        Button button = themeFactory.createButton();
        Checkbox checkbox = themeFactory.createCheckbox();

        button.display();
        checkbox.display();
    }
}
