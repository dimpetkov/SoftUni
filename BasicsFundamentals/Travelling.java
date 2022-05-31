package Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String command = scanner.nextLine();

            while (!command.equals("End")) {
                String destination = command;
                double budget = Double.parseDouble(scanner.nextLine());
                double availableMoney = 0;
                while (availableMoney < budget) {
                    double savedMoney = Double.parseDouble(scanner.nextLine());
                    availableMoney += savedMoney;
                }
                System.out.printf("Going to %s!%n", destination);

                command = scanner.nextLine();
            }
    }
}
