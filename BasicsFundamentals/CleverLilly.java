package ForCycles;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int age = Integer.parseInt(scanner.nextLine());
            double washMachinePrice = Double.parseDouble(scanner.nextLine());
            int toyPrice = Integer.parseInt(scanner.nextLine());

            int toysCount = 0;
            int countBrother = 0;
            double currentMoney = 0.00;
            double sumMoney = 0.00;
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
            toysCount++;
            } else {
                countBrother++;
                currentMoney = currentMoney + 10;
                sumMoney = sumMoney + currentMoney;
            }
        }
        double allSavedMoney = sumMoney + (toyPrice * toysCount) - countBrother;

        double diff = Math.abs(allSavedMoney - washMachinePrice);
        if (allSavedMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
