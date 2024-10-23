package interpreter;

public class NumberExpression implements Expression {
    private int number;

    @Override
    public int interpret() {
        return this.number;
    }
}
