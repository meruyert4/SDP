import GameAction.*;
import State.*;
import Strategy.*;
import Visitor.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("---- Actions ----");
            System.out.println("1. Perform Attack Action");
            System.out.println("2. Perform Defend Action");
            System.out.println("3. Perform Heal Action");

            System.out.println("---- State ----");
            System.out.println("4. Change State to Normal");
            System.out.println("5. Change State to Defeated");
            System.out.println("6. Change State to Powered Up");

            System.out.println("---- Strategy ----");
            System.out.println("7. Use Melee Strategy");
            System.out.println("8. Use Magic Strategy");
            System.out.println("9. Use Ranged Strategy");

            System.out.println("---- Boost/Damage ----");
            System.out.println("10. Apply Damage");
            System.out.println("11. Apply Boost");

            System.out.println("12. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                // Actions pattern
                case 1:
                    character.setAction(new AttackAction());
                    character.performAction();
                    break;
                case 2:
                    character.setAction(new DefendAction());
                    character.performAction();
                    break;
                case 3:
                    character.setAction(new HealAction());
                    character.performAction();
                    break;

                // State pattern
                case 4:
                    character.setState(new NormalState());
                    character.changeState();
                    break;
                case 5:
                    character.setState(new DefeatedState());
                    character.changeState();
                    break;
                case 6:
                    character.setState(new PoweredUpState());
                    character.changeState();
                    break;

                // Strategy pattern
                case 7:
                    character.setStrategy(new MeleeStrategy());
                    character.executeStrategy();
                    break;
                case 8:
                    character.setStrategy(new MagicStrategy());
                    character.executeStrategy();
                    break;
                case 9:
                    character.setStrategy(new RangedStrategy());
                    character.executeStrategy();
                    break;

                // Visitor pattern
                case 10:
                    character.accept(new DamageVisitor());
                    break;
                case 11:
                    character.accept(new BoostVisitor());
                    break;

                case 12:
                    running = false;
                    System.out.println("Exiting game...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
