package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            double pointSum = 0;
        double first = 0;
        double second = 0;
        double third = 0;
        double fourth = 0;
        double fifth = 0;
        double invalid = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number <= 9) {
                pointSum = pointSum + number * 0.20;    //
                first++;
            } else if (number >= 10 && number <= 19) {
                pointSum = pointSum + number * 0.30;    //
                second++;
            } else if (number >= 20 && number <= 29) {
                pointSum = pointSum + number * 0.40;    //
                third++;
            } else if (number >= 30 && number <= 39) {
                pointSum = pointSum + 50;               //
                fourth++;
            } else if (number >= 40 && number <= 50) {
                pointSum = pointSum + 100;              //
                fifth++;
            } else {
                pointSum = pointSum / 2;
                invalid++;
            }
        }
        System.out.printf("%.2f%n", pointSum);
        System.out.printf("From 0 to 9: %.2f%%%n", first / n * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", second / n * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", third / n * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", fourth / n * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", fifth / n * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalid / n * 100);
    }
}
