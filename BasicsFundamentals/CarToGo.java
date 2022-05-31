package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String vehicleClass = ""; //"Economy class", "Compact class", "Luxury class"
        String vehicle = "";//"Cabrio", "Jeep"
        double price = 0.00;
        if (budget > 500) {
            vehicleClass = "Luxury class";
            vehicle = "Jeep";
            price = budget * 0.90;
        } else {
            switch (season) {
                case "Summer":
                    if (budget <= 100) {
                        vehicleClass = "Economy class";
                        vehicle = "Cabrio";
                        price = budget * 0.35;
                    } else if (budget > 100 && budget <= 500) {
                        vehicleClass = "Compact class";
                        vehicle = "Cabrio";
                        price = budget * 0.45;
                    }
                    break;
                case "Winter":
                    if (budget <= 100) {
                        vehicleClass = "Economy class";
                        vehicle = "Jeep";
                        price = budget * 0.65;
                    } else if (budget > 100 && budget <= 500) {
                        vehicleClass = "Compact class";
                        vehicle = "Jeep";
                        price = budget * 0.80;
                    }
                    break;
            }
        }
        System.out.printf("%s%n", vehicleClass);
        System.out.printf("%s - %.2f", vehicle, price);
    }
}
