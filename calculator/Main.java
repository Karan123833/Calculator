package calculator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Operation> operations = new HashMap<>();
        operations.put("+", new Addition());
        operations.put("-", new Subtract());
        operations.put("*", new Multiply());
        operations.put("/", new Divide());

        Calculator calculator = new Calculator(operations);
        Input input = new Input();

        while (true) {
            String operator = input.getOperator(operations);

            if (operator == null) {
                System.out.println("Done!!");
                break;
            }

            double number1 = input.getInputNumber("Enter the first number ");
            double number2 = input.getInputNumber("Enter the second number ");

            try {
                double solution = calculator.calculate(operator, number1, number2);
                System.out.println("Result " + solution);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (!input.carryOn()) {
                System.out.println("DONE!!");
                break;
            }
        }
    }
}