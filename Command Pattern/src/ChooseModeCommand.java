public class ChooseModeCommand implements Command{
    private Multicooker multicooker;
    private String mode;

    public ChooseModeCommand(Multicooker multicooker, String mode){
        this.multicooker = multicooker;
        this.mode = mode;
    }

    public void execute(){
        multicooker.chooseMode(mode);
    }
}
