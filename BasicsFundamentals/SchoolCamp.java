package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String season = scanner.nextLine(); //“Winter”, “Spring”, “Summer”
            String group = scanner.nextLine(); //“boys”, “girls”, “mixed”;
            int students = Integer.parseInt(scanner.nextLine());
            int nights = Integer.parseInt(scanner.nextLine());

            String sport = "";
            double priceNight = 0.00;
            double discount = 0.00;

            switch (season) {
                case "Winter":
                    if (group.equals("boys")) {
                        priceNight = 9.60;
                        sport = "Judo";
                    } else if (group.equals("girls")) {
                        priceNight = 9.60;
                        sport = "Gymnastics";
                    } else {
                        priceNight = 10.00;
                        sport = "Ski";
                    }
                        break;
                case "Spring":
                    if (group.equals("boys")) {
                        priceNight = 7.20;
                        sport = "Tennis";
                    } else if (group.equals("girls")) {
                        priceNight = 7.20;
                        sport = "Athletics";
                    } else {
                        priceNight = 9.50;
                        sport = "Cycling";
                    }
                    break;
                case "Summer":
                    if (group.equals("boys")) {
                        priceNight = 15.00;
                        sport = "Football";
                    } else if (group.equals("girls")) {
                        priceNight = 15.00;
                        sport = "Volleyall";
                    } else {
                        priceNight = 20.00;
                        sport = "Swimming";
                    }
                    break;
            }
            double price = nights * priceNight * students;
            if (students >= 50) {
                discount = price * 0.50;
            } else if (students >= 20) {
                discount = price * 0.15;
            } else if (students >= 10) {
                discount = price * 0.05;
            }
            double finalPrice = price - discount;
        System.out.printf("%s %.2f lv.", sport, finalPrice);
    }
}
