package Visitor;

public class DamageVisitor implements EffectVisitor {
    @Override
    public void visit() {
        System.out.println("Applying damage effect.");
    }
}
