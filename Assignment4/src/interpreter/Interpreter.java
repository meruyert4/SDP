package interpreter;

import java.util.Stack;

public class Interpreter {

    public static int evaluate(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        // Remove spaces for easier processing
        expression = expression.replaceAll("\\s+", "");

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // If it's a digit, extract the full number
            if (Character.isDigit(currentChar)) {
                int number = 0;
                // There might be more than one digit in the number
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    number = number * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;  // Adjust the index after extracting the number
                numbers.push(number);
            }
            // If it's an operator
            else if (currentChar == '+' || currentChar == '-') {
                while (!operations.isEmpty() && precedence(currentChar, operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(currentChar);
            }
        }

        // Apply remaining operations
        while (!operations.isEmpty()) {
            numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    // Function to determine precedence: + and - have the same precedence
    private static boolean precedence(char currentOp, char topOp) {
        if (topOp == '+' || topOp == '-') {
            return true;
        }
        return false;
    }

    // Function to apply an operation on two operands
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
