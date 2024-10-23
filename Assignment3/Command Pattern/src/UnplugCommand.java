public class UnplugCommand implements Command{
    private Multicooker multicooker;

    public UnplugCommand(Multicooker multicooker){
        this.multicooker = multicooker;
    }

    @Override
    public void execute() {
        multicooker.unplug();
    }
}
