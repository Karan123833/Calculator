package calculator;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Input {
    private final Scanner sc = new Scanner(System.in);

    public double getInputNumber(String command) {
        while(true) {
            System.out.println(command);

            String input = sc.nextLine().trim();
            try {
                return Double.parseDouble(input);
            }
            catch (NumberFormatException e) {
                System.out.println("not valid number");
            }
        }
    }

    public String getOperator(Map<String,Operation> operations) {
        Set<String> validOne = operations.keySet();

        int count = 0;
        while(count < 5) {
            System.out.printf("Enter an operator (%s)%n", String.join(", ", validOne));
            String operator = sc.nextLine().trim();
            if(validOne.contains(operator)) {
                return operator;
            }
            count++;
            if(count==5) {break;}
            System.out.println("Invalid operator. Please enter a valid operator");
        }
        return null;
    }

    public boolean carryOn() {
        System.out.println("another calculation? (yes/no) ");
        String reply = sc.nextLine().trim().toLowerCase();
        return reply.equals("yes") || reply.equals("y") || reply.equals("ye") || reply.equals("yess");
    }
}
