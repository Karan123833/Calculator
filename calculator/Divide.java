package calculator;

public class Divide implements Operation{
    public double execute(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return  number1 / number2;
    }
}
