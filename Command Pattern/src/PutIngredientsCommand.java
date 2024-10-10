public class PutIngredientsCommand implements Command{
    private Multicooker multicooker;
    public PutIngredientsCommand(Multicooker multicooker){
        this.multicooker = multicooker;
    }

    @Override
    public void execute() {
        multicooker.putIngredients();
    }
}
