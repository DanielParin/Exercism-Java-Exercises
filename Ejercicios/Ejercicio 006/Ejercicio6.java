/*public*/ class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}

class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        switch (operation) {
            case "+":
                return "" + operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            case "*":
                return "" + operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            case "/":

                if (operand2 == 0) {
                    throw new IllegalOperationException("Division by zero is not allowed",
                            new ArithmeticException("Divided by zero"));
                }
                return "" + operand1 + " / " + operand2 + " = " + (operand1 / operand2);
        }

        return "ERROR";
    }
}