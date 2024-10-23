public class PlugCommand implements Command {
    private Multicooker multicooker;

    public PlugCommand(Multicooker multicooker) {
        this.multicooker = multicooker;
    }

    @Override
    public void execute() {
        multicooker.plugIn();
    }
}
