package Visitor;

public class BoostVisitor implements EffectVisitor {
    @Override
    public void visit() {
        System.out.println("Applying boost effect.");
    }
}
