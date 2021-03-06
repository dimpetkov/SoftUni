package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class MyJourney {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine();

            double price = 0.00;
            String type = "";
            String destination = "";

            if (budget <= 100) {
                destination = "Bulgaria";
                switch (season) {
                    case "summer":
                        price = budget * 0.3;
                        type = "Camp";
                        break;
                    case "winter":
                        price = budget * 0.70;
                        type = "Hotel";
                        break;
                }
            } else if (budget <= 1000) {
                destination = "Balkans";
                switch (season) {
                    case "summer":
                        price = budget * 0.40;
                        type = "Camp";
                        break;
                    case "winter":
                        price = budget * 0.80;
                        type = "Hotel";
                        break;
                }
            } else {
                destination = "Europe";
                price = budget * 0.90;
                type = "Hotel";
            }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, price);
    }
}
