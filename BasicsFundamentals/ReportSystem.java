package MoreExerciseWhileLoop;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int target = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            int cycle = 0;
            int moneyCollected = 0;
            int CS = 0;
            int csMoney = 0;
            int CC = 0;
            int ccMoney = 0;
            while (!input.equals("End")) {
                cycle++;
                int transaction = Integer.parseInt(input);
                if ((cycle % 2 != 0) && (transaction <= 100)) {
                    moneyCollected = moneyCollected + transaction;
                    csMoney = csMoney + transaction;
                    CS++;
                    System.out.println("Product sold!");
                } else if (cycle % 2 == 0 && transaction >= 10) {
                    moneyCollected = moneyCollected + transaction;
                    ccMoney = ccMoney + transaction;
                    CC++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
                if (moneyCollected >= target) {
                    double csAverage = csMoney * 1.00 / CS;
                    double ccAverage = ccMoney * 1.00/ CC;
                    System.out.printf("Average CS: %.2f%n", csAverage);
                    System.out.printf("Average CC: %.2f%n", ccAverage);
                    break;
                }
                input = scanner.nextLine();
            }
            if (input.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
            }
    }
}
