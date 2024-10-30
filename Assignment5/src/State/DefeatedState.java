package State;

public class DefeatedState extends CharacterState {
    @Override
    public void handleState() {
        System.out.println("Character is defeated.");
    }
}
