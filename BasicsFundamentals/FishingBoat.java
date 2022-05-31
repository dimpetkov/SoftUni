package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class MyFishingBoat {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int budget = Integer.parseInt(scanner.nextLine());
            String season = scanner.nextLine();
            int crew = Integer.parseInt(scanner.nextLine());

            int rent = 0;
            double discount = 0.00;
            double cost = 0.00;
            switch (season) { //Spring", "Summer", "Autumn", "Winter
                case "Spring":
                    rent = 3000;
                    break;
                case "Summer":
                    rent = 4200;
                    break;
                case "Autumn":
                    rent = 4200;
                    break;
                case "Winter":
                    rent = 2600;
                    break;
            }
            if (crew <= 6) {
                cost = rent * 0.9;
            } else if ( crew <= 11) {
                cost = rent * 0.85;
            } else if (crew > 12) {
                cost = rent * 0.75;
            }
            if (crew % 2 == 0 && !season.equals("Autumn")) {
                cost = cost * 0.95;
            }
            double diff = budget - cost;
            if (diff >= 0.00) {
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", Math.abs(diff));
            }

    }
}
