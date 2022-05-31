package MoreExercise;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //do the math...
        double totalWaterP1 = h * p1;
        double totalWaterP2 = h * p2;
        double totalWater = totalWaterP1 + totalWaterP2;

        //conditions
        if (totalWater <= v) {
            double filledPercent = totalWater / v * 100;
            double percentP1 = totalWaterP1 / totalWater * 100;
            double percentP2 = totalWaterP2 / totalWater * 100;

            System.out.printf("The pool is %.2f %% full. Pipe 1: %.2f %% . Pipe 2: %.2f %% .", filledPercent, percentP1, percentP2);
        } else {
            double overflow = totalWater - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h, overflow);
        }
    }
}
