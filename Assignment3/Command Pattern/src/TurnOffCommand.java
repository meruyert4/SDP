public class TurnOffCommand implements Command{
    private Multicooker multicooker;

    public TurnOffCommand(Multicooker multicooker){
        this.multicooker = multicooker;
    }

    @Override
    public void execute() {
        multicooker.turnOff();
    }
}
