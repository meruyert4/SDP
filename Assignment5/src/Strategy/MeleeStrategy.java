package Strategy;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Using melee attack.");
    }
}
