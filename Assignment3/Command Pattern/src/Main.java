import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Multicooker multicooker = new Multicooker();
        RemoteControl remote = new RemoteControl();

        Scanner scanner = new Scanner(System.in);

        remote.setCommand(new PlugCommand(multicooker));
        remote.pressButton();

        remote.setCommand(new TurnOnCommand(multicooker));
        remote.pressButton();

        remote.setCommand(new PutIngredientsCommand(multicooker));
        remote.pressButton();

        System.out.println("Choose a mode: Steaming, Rice, Baking, Soup");
        String mode = scanner.nextLine();

        remote.setCommand(new ChooseModeCommand(multicooker, mode));
        remote.pressButton();

        remote.setCommand(new TurnOffCommand(multicooker));
        remote.pressButton();

        remote.setCommand(new UnplugCommand(multicooker));
        remote.pressButton();

        multicooker.displayResult();
    }
}