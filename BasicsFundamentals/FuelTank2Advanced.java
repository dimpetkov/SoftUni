package MoreExercise;

import java.util.Scanner;

public class P09FuelTank2 {
    public static void main(String[] args) {
        double gasoline = 2.22;
        double gasolineCard = 2.04;
        double diesel = 2.33;
        double dieselCard = 2.21;
        double gas = 0.93;
        double gasCard = 0.85;

        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double totalPrice = 0.00;

        if (fuel.equals("Gasoline")) {
            if (clubCard.equals("Yes")) {
                totalPrice = liters * gasolineCard;
            } else if (clubCard.equals("No")) {
                totalPrice = liters * gasoline;
            }
        }
        if (fuel.equals("Diesel")) {
            if (clubCard.equals("Yes")) {
                totalPrice = liters * dieselCard;
            } else if (clubCard.equals("No")) {
                totalPrice = liters * diesel;
            }
        }
        if (fuel.equals("Gas")) {
            if (clubCard.equals("Yes")) {
                totalPrice = liters * gasCard;
            } else if (clubCard.equals("No")) {
                totalPrice = liters * gas;
            }
        }
        if (liters >= 20 && liters <= 25) {
            totalPrice = totalPrice * 0.92;
        } else if (liters > 25) {
            totalPrice = totalPrice * 0.9;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
