import GameAction.GameAction;
import State.CharacterState;
import Strategy.FightingStrategy;
import Visitor.EffectVisitor;

public class Character {
    private GameAction action;
    private CharacterState state;
    private FightingStrategy strategy;
    private EffectVisitor visitor;

    public void setAction(GameAction action) {
        this.action = action;
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void accept(EffectVisitor visitor) {
        this.visitor = visitor;
        visitor.visit();
    }

    public void performAction() {
        if (action != null) action.execute();
    }

    public void changeState() {
        if (state != null) state.handleState();
    }

    public void executeStrategy() {
        if (strategy != null) strategy.executeStrategy();
    }
}
