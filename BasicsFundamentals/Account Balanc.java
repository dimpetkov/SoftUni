package LabWhileLoop;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //operation: double, or "NoMoreMoney"
            //repeat: read operation
            //stop: operation == "NoMoreMoney"
            //continue: operation != "NoMoreMoney"
        double totalSum = 0;
        String command = scanner.nextLine();
        while (!command.equals("NoMoreMoney")) {
            //if operation is double command += value(operation);
            double sum = Double.parseDouble(command);
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", sum);
            totalSum += sum;
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
