package interpreter;

import java.util.Stack;

public class Interpreter {

    public static int evaluate(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        expression = expression.replaceAll("\\s+", "");

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) { //converting string to int
                int number = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    number = number * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.push(number);
            }
            // defining operations
            else if (currentChar == '+' || currentChar == '-') {
                while (!operations.isEmpty() && precedence(currentChar, operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(currentChar);
            }
        }

        while (!operations.isEmpty()) {
            numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private static boolean precedence(char currentOp, char topOp) {
        if (topOp == '+' || topOp == '-') {
            return true;
        }
        return false;
    }

    private static int applyOperation(char operation, int b, int a) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            default:
                throw new UnsupportedOperationException("Invalid operation: " + operation);
        }
    }
}
