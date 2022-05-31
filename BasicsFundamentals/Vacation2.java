package ExerciseWhileLoop;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double ownedMoney = Double.parseDouble(scanner.nextLine());

            double finalSum = ownedMoney;
            int countDays= 0;
            int spendingCount = 0;
            boolean isFailed = false;
            while (finalSum < neededMoney) {
                if (spendingCount == 5) {
                    isFailed = true;
                    break;
                }
                String command = scanner.nextLine();
                double money = Double.parseDouble(scanner.nextLine());

                countDays++;
                if (command.equals("save")) {
                    finalSum = finalSum + money;
                    spendingCount = 0;
                } else {
                    spendingCount++;
                    if (finalSum - money < 0) {
                        finalSum = 0;
                    } else {
                        finalSum = finalSum - money;
                    }
                }
            }
            if (isFailed) {
                System.out.printf("You can't save the money.%n");
                System.out.println(countDays);
            } else {
                System.out.printf("You saved the money for %d days.", countDays);
            }
    }
}
