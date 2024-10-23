package interpreter;

public class OperationExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private char operator;


    @Override
    public int interpret() {
        switch (operator) {
            case '+': return leftExpression.interpret() + rightExpression.interpret();
            case '-': return leftExpression.interpret() - rightExpression.interpret();
            default: throw new UnsupportedOperationException("Invalid operator");
        }
    }
}
