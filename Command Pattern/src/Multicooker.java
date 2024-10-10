import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Multicooker {
    private String ingredients;
    private String mode;
    private int time;

    public void plugIn(){
        System.out.println("Multicooker is plugged in");
    }

    public void unplug(){
        System.out.println("Multicooker unplugged");
    }

    public void turnOn(){
        System.out.println("Multicooker is turned on");
    }

    public void turnOff(){
        System.out.println("Multicooker is turned off");
    }

    public void putIngredients() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ingredients (comma separated): ");
        ingredients = scanner.nextLine();
        System.out.println("Ingredients added: " + ingredients);
    }

    public void chooseMode(String mode){
        this.mode = mode;

        switch (mode.toLowerCase()){
            case "steaming":
                time = 15;
                System.out.println("Steaming mode: Cooking for " + time + " minutes");
                break;
            case "rice":
                time = 20;
                System.out.println("Rice mode: Cooking for " + time + " minutes");
                break;
            case "baking":
                time = 30;
                System.out.println("Baking mode: Cooking for " + time + " minutes");
                break;
            case "soup":
                time = 25;
                System.out.println("Soup mode: Cooking for " + time + " minutes");
                break;
            default:
                System.out.println("Invalid mode. Choose from steaming/rice/baking/soup");
        }
        cooking(time);
    }

    public void cooking(int time){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e){
            System.out.println("Cooking interupted");
        }

        System.out.println("Cooking completed in " + time + " minutes");
    }


    public void displayResult(){
        System.out.println("Food was prepared with \"" + ingredients + "\" on mode: \"" + mode + "\" for " + time + " minutes.");
    }
}
