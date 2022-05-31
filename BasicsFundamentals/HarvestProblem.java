package MoreExercise;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area = Integer.parseInt(scanner.nextLine());
        double yield = Double.parseDouble(scanner.nextLine());
        int wineNeed = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        //calculations
        double wineArea = area * 0.40;
        double grapeKG = wineArea * yield;
        double wineLiters = grapeKG / 2.5;
        //conditions
        if (wineLiters < wineNeed) {
            double lessWine = Math.floor(wineNeed - wineLiters);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", lessWine);
        } else {
            double moreWine = Math.ceil(wineLiters - wineNeed);
            wineLiters = Math.floor(wineLiters);
            double winePerEmployee = Math.ceil(moreWine / employees);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wineLiters);
            System.out.printf("%.0f liters left -> %.0f liters per person.", moreWine, winePerEmployee);
        }
    }
}
