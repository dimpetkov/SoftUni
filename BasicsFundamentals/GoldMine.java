package ExamJuly_2_20210;

import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());
        for (int loc = 1; loc <= locations; loc++) {
            double goldTotal = 0;
            double averageYieldActual = 0;
            double averageYieldExpected = scanner.nextDouble();
            int days = scanner.nextInt();
            for (int d = 1; d <= days; d++) {
                double goldDaily = scanner.nextDouble();
                goldTotal = goldTotal + goldDaily;
                averageYieldActual = goldTotal / d;
            }
            if (averageYieldActual >= averageYieldExpected) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageYieldActual);
            } else if (averageYieldActual < averageYieldExpected) {
                System.out.printf("You need %.2f gold.%n", averageYieldExpected - averageYieldActual);
            }
        }
    }
}
