package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            String type = scanner.nextLine();
            int people = Integer.parseInt(scanner.nextLine());
            double transport = 0.00;
            double ticketPrice = 0.00;
                if (people > 0 && people <= 4) {
                    transport = budget * 0.75;
                } else if (people >= 5 && people <= 9) {
                    transport = budget * 0.60;
                } else if (people >= 10 && people <= 24) {
                    transport = budget * 0.50;
                } else if (people >= 25 && people <= 49) {
                    transport = budget * 0.40;
                } else {
                    transport = budget * 0.25;
                }
               switch (type) {
                   case "VIP":
                       ticketPrice = 499.99;
                       break;
                   case "Normal":
                       ticketPrice = 249.99;
                       break;
               }
                double total = people * ticketPrice + transport;
                double diff = budget - total;
                if (budget >  total) {
                    System.out.printf("Yes! You have %.2f leva left.", Math.abs(diff));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", Math.abs(diff));
                }
    }
}
