package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            double water = n * 20;
            double internet = n * 15;
            double others = 0;
            double electricitySum = 0;

        double averageCostMonth = 0;
        for (int i = 1; i <= n; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            others = others + (35 + electricity) * 1.20;
            electricitySum = electricitySum + electricity;
            double totalCost = water + internet + others + electricitySum;
            averageCostMonth = totalCost / i;
        }
        System.out.printf("Electricity: %.2f lv%n", electricitySum);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv", averageCostMonth);
    }
}