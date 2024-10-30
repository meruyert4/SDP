import GameAction.*;
import State.*;
import Strategy.*;
import Visitor.*;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        character.accept(new DamageVisitor());
        character.accept(new BoostVisitor());

        character.setAction(new AttackAction());
        character.performAction();

        character.setAction(new DefendAction());
        character.performAction();

        character.setAction(new HealAction());
        character.performAction();

        character.setState(new NormalState());
        character.changeState();

        character.setState(new DefeatedState());
        character.changeState();

        character.setStrategy(new MeleeStrategy());
        character.executeStrategy();

        character.setStrategy(new MagicStrategy());
        character.executeStrategy();

        character.setStrategy(new RangedStrategy());
        character.executeStrategy();

        character.accept(new BoostVisitor());
    }
}
