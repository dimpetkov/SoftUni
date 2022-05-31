package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double n1 = Double.parseDouble(scanner.nextLine());
            double n2 = Double.parseDouble(scanner.nextLine());
            String operation = scanner.nextLine();

            //conditions
        double answer = 0.00;
        if (operation.equals("+") || operation.equals("-") || operation.equals("*")) {
            switch (operation) {
                case "+":
                    answer = n1 + n2;
                    break;
                case "-":
                    answer = n1 - n2;
                    break;
                case "*":
                    answer = n1 * n2;
                    break;
            }
            if (answer % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", n1, operation, n2, answer);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", n1, operation, n2, answer);
            }
        }else if (operation.equals("/") && n2 != 0) {
            answer = n1 / n2;
            System.out.printf("%.0f %s %.0f = %.2f", n1, operation, n2, answer);
        } else if (operation.equals("/") || operation.equals("%") && n2 == 0.00) {
            System.out.printf("Cannot divide %.0f by zero", n1);
        } else if (operation.equals("%")) {
            answer = n1 % n2;
            System.out.printf("%.0f %s %.0f = %.0f", n1, operation, n2, answer);
        }
    }
}
