package Strategy;

public class MagicStrategy implements FightingStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Using magic attack.");
    }
}
