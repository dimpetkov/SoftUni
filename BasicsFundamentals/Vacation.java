package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine();

            String place = "";
            String accommodation = "";
            double price = 0.00;
            if (budget <= 1000) {
                accommodation = "Camp";
                switch (season) {
                    case "Summer":
                        place = "Alaska";
                        price = budget * 0.65;
                        break;
                    case "Winter":
                        place = "Morocco";
                        price = budget * 0.45;
                        break;
                }
            } else  if (budget > 1000 && budget <= 3000) {
                accommodation = "Hut";
                switch (season) {
                    case "Summer":
                        place = "Alaska";
                        price = budget * 0.80;
                        break;
                    case "Winter":
                        place = "Morocco";
                        price = budget * 0.60;
                        break;
                }
            } else  if (budget > 3000) {
                accommodation = "Hotel";
                price = budget * 0.90;
                switch (season) {
                    case "Summer":
                        place = "Alaska";
                        break;
                    case "Winter":
                        place = "Morocco";
                        break;
                }
            }
        System.out.printf("%s - %s - %.2f", place, accommodation, price);
    }
}
