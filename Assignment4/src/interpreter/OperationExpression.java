package interpreter;

public class OperationExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private char operator;

    public OperationExpression(Expression left, Expression right, char operator) {
        this.leftExpression = left;
        this.rightExpression = right;
        this.operator = operator;
    }

    @Override
    public int interpret() {
        switch (operator) {
            case '+': return leftExpression.interpret() + rightExpression.interpret();
            case '-': return leftExpression.interpret() - rightExpression.interpret();
            default: throw new UnsupportedOperationException("Invalid operator");
        }
    }
}
