package Strategy;

public class RangedStrategy implements FightingStrategy {
    @Override
    public void executeStrategy() {
        System.out.println("Using ranged attack.");
    }
}
