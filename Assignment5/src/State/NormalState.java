package State;

public class NormalState extends CharacterState {
    @Override
    public void handleState() {
        System.out.println("Character is in normal state.");
    }
}
