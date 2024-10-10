public class TurnOnCommand implements Command {
    private Multicooker multicooker;

    public TurnOnCommand(Multicooker multicooker) {
        this.multicooker = multicooker;
    }

    @Override
    public void execute() {
        multicooker.turnOn();
    }
}
