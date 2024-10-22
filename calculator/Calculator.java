package calculator;

import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations;

    public Calculator(Map<String, Operation> operations) {
        this.operations = operations;
    }

    public double calculate(String operator, double number1, double number2) {
        Operation operation = operations.get(operator);
        return operation.execute(number1, number2);
    }

}
