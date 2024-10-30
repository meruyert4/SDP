package State;

public class PoweredUpState extends CharacterState {
    @Override
    public void handleState() {
        System.out.println("Character is powered up!");
    }
}
